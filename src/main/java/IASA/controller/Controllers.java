package IASA.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controllers {
    @GetMapping("/hello")
    @ResponseBody
    String getHello(){
        return "HELLO!";
    }
}
