package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@RequestMapping("profile")
public interface i_ProfileController
{
    @GetMapping("addToCart/{productId}")
    String addToCart(@PathVariable("productId") String productId, Principal principal, Model model);

    @GetMapping({"cart-product", "/"})
    ModelAndView index(Principal principal);

    @PostMapping("updatechart")
    ModelAndView updatechart(@RequestParam(value = "updatechart", required = false) String updatechart, Integer id, Integer shoppingpriceitem, Principal principal);

}
