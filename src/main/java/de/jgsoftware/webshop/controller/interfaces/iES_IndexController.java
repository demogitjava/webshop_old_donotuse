package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/es")
public interface iES_IndexController
{
    @GetMapping({"es", "/"})
    ModelAndView es();
}
