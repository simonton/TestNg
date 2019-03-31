package com.test.ng.testng.demo.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/queryBySn")
    public String queryById(@RequestBody String sn) {
        return "result: " + sn;
    }
}
