package com.ResponsibilityChain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2018/5/20.
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain add(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if(index==filters.size()) {
            return;
        }
        Filter f = filters.get(index);
        index++;
        f.doFilter(request,response,filterChain);
    }
}
