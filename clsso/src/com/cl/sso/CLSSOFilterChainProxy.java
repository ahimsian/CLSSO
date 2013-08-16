package com.cl.sso;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.FilterInvocation;



public class CLSSOFilterChainProxy extends FilterChainProxy {

    private static final Log LOGGER = LogFactory.getLog(CLSSOFilterChainProxy.class);


    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        final FilterInvocation finv = new FilterInvocation(request, response, chain);
        final List<Filter> filters = getFilters(finv.getRequestUrl());


        if (filters == null || filters.isEmpty()) {
            if (LOGGER.isDebugEnabled()) {
            	//LOGGER.debug(finv.getRequestUrl() + filters == null ? " has no matching filters" : " has an empty filter list");
            }

            chain.doFilter(request, response);

            return;
        }

        final VirtualFilterChain virtualFilterChain = new VirtualFilterChain(finv, filters);
        virtualFilterChain.doFilter(finv.getRequest(), finv.getResponse());
    }

   
    private static class VirtualFilterChain implements FilterChain {
        final private FilterInvocation finv;
        final private List<Filter> additionalFilters;
        private int currentPosition = 0;

        private VirtualFilterChain(final FilterInvocation filterInvocation, final List<Filter> additionalFilters) {
            this.finv = filterInvocation;
            this.additionalFilters = additionalFilters;
        }

        public void doFilter(final ServletRequest request, final ServletResponse response) throws IOException, ServletException {
            if (currentPosition == additionalFilters.size()) {
                if (LOGGER.isDebugEnabled()) {
                	LOGGER.debug(finv.getRequestUrl()
                        + " reached end of additional filter chain; proceeding with original chain");
                }

                finv.getChain().doFilter(request, response);
            } else {
                currentPosition++;

                final Filter nextFilter = additionalFilters.get(currentPosition - 1);

                if (LOGGER.isDebugEnabled()) {
                	LOGGER.debug(finv.getRequestUrl() + " at position " + currentPosition + " of "
                        + additionalFilters.size() + " in additional filter chain; firing Filter: '"
                        + nextFilter + "'");
                }

               nextFilter.doFilter(request, response, this);
            }
        }
    }

    public interface FilterChainValidator {
        void validate(CLSSOFilterChainProxy filterChainProxy);
    }

}
