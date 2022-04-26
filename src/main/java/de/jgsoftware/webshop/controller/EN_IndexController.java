package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.controller.interfaces.iEN_IndexController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class EN_IndexController implements iEN_IndexController
{

    // EN English is set by default
    @Override
    public ModelAndView en()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", java.util.Locale.getDefault().getCountry());
        return new ModelAndView("/en/index.html", prodtlists);
    }



}