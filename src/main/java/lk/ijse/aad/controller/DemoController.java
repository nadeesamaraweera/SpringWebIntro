package lk.ijse.aad.controller;

import jakarta.servlet.http.HttpServlet;
import lk.ijse.aad.config.WebAppRootConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("demo")
@RestController
public class DemoController {

    @GetMapping(value = "/pattern/{name}")
    public String pathvariable(@PathVariable("name") String name){
        return "DemoController run perfectly with :"+name;
    }

    @GetMapping(value = "/patternRegex/{id:C\\d{3}}")
    public String pathvariableWithRegex(@PathVariable("id") String id){
        return "DemoController run perfectly with :"+ id;
    }

    @GetMapping
    public String otherTest(){
        return "other test";
    }

}
