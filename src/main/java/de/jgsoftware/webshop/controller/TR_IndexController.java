package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.controller.interfaces.iTR_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller

public class TR_IndexController implements iTR_Controller
{

    // TR Türkey
    @Override
    public ModelAndView tr()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", Locale.getDefault().getCountry());
        return new ModelAndView("/tr/index.html", prodtlists);
    }



}