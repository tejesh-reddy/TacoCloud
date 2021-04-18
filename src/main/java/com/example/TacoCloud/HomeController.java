package com.example.TacoCloud;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

}
