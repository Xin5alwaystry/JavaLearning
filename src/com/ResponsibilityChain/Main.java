package com.ResponsibilityChain;

/**
 * Created by User on 2018/5/20.
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好:) <script> 敏感";
        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter())
                    .add(new SensitiveFilter());
        filterChain.doFilter(request,response,filterChain);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
