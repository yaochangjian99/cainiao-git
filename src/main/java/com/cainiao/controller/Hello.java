package com.cainiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: git
 * @Package: com.cainiao.controller
 * @ClassName: Hello
 * @Date: 2021/1/12 11:43
 * @Author: 铁板烤翅
 */
@RestController
public class Hello {
    @RequestMapping("info")
    public String info(){
        return "Hello Info";
    }
}
