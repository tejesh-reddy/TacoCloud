package com.example.TacoCloud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/order")
public class OrderController {


    @PostMapping
    public String showOrders(@Valid Order order, Errors errors)
    {

        if(errors.hasErrors())
            return "order-form";

        return "order-success";
    }

    @GetMapping("/current")
    public String showOrders(Model model)
    {
        model.addAttribute("order", new Order());
        return "order-form";
    }

}
