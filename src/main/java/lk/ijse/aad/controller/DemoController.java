package lk.ijse.aad.controller;

import jakarta.servlet.http.HttpServlet;
import lk.ijse.aad.config.WebAppRootConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("demo")
@RestController
public class DemoController {

    @GetMapping(value = "/health/*")//?= ona charactor ekk dnn puluwn
    public String healthCheck(){
        return "DemoController run perfectly";
    }

    @GetMapping
    public String otherTest(){
        return "other test";
    }

}
