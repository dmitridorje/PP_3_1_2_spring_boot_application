package kata.PP_3_1_2_spring_boot_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class IndexController {

    @GetMapping
    public String startPage(){
        return "redirect:/users/new";
    }
}
