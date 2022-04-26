package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/tr")
public interface iTR_Controller
{
    @GetMapping({"tr", "/"})
    public ModelAndView tr();
}
