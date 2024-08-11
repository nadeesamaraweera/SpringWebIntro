package lk.ijse.aad.controller;

import jakarta.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("demo")
@RestController
public class DemoController {

    @GetMapping(value = "/health")
    public String healthCheck(){
        return "DemoController run perfectly";
    }
}
