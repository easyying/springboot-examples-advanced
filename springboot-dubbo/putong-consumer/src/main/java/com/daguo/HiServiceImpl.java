package com.daguo;

import org.springframework.stereotype.Service;

@Service
public class HiServiceImpl implements HiService {
    @Override
    public String sayHi(String name) {
        return "Hi:"+name ;
    }
}
