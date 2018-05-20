package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        request.requestStr = request.requestStr.replace("敏感", "不敏感")+"---SensitiveFilter";
        filterChain.doFilter(request,response,filterChain);
        response.responseStr+="---SensitiveFilter";
    }
}
