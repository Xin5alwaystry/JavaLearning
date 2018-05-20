package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
