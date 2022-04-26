package de.jgsoftware.webshop.controller;


import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import de.jgsoftware.webshop.controller.interfaces.i_ManagerController;
@Controller
@RequestMapping("/manager/")
public class ManagerController implements i_ManagerController
{


    @Override
    public ModelAndView mcontroller()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        //prodtlists.put("lang", java.util.Locale.getDefault().getCountry());
        return new ModelAndView("/manager/index.html", prodtlists);
    }



}