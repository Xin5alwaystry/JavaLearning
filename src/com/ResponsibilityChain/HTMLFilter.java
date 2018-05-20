package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        request.requestStr = request.requestStr.replace('<', '[')
                .replace('>', ']')+"----HTMLFilter";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr+="---HTMLFilter";
    }
}
