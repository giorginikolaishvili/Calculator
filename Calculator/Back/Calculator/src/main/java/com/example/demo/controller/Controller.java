package com.example.demo.controller;


import com.example.demo.model.JsonData;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping("/api")
@RestController
public class Controller {


    @PostMapping("post")
    public String post(@RequestBody JsonData data) {
        String result = resultJson(data);
        return result;
    }

    private String resultJson(JsonData gaw) {
        int operate = 0;
        switch (gaw.getOperation()) {
            case "+":
                operate = gaw.getParam_a() + gaw.getParam_b();
                break;
            case "-":
                operate = gaw.getParam_a() - gaw.getParam_b();
                break;
            case "*":
                operate = gaw.getParam_a() * gaw.getParam_b();
                break;
            case "/":
                operate = gaw.getParam_a() / gaw.getParam_b();
                break;
        }
        return "{\"result\" :" + operate + "}";
    }

}
