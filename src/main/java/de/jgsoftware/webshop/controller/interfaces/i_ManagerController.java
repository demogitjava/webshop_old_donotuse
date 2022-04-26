package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/manager/")
public interface i_ManagerController
{
    @GetMapping({"manager", "/"})
    ModelAndView mcontroller();
}
