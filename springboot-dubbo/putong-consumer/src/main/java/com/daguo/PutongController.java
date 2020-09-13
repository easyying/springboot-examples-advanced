package com.daguo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
//能调通 毕竟不是2个项目 ！！！
@RestController
public class PutongController {
    @Autowired
    private HiService hiService;
    @RequestMapping("/hi")
    public String sayHi(){
        System.out.println(hiService.sayHi("哈哈"));
        return hiService.sayHi("嘻嘻");
    }
}
