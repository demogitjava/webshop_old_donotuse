package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.controller.interfaces.iES_IndexController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller

public class ES_IndexController implements iES_IndexController
{

    // ES Spanisch
    @Override
    public ModelAndView es()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", Locale.getDefault().getCountry());
        return new ModelAndView("/es/index.html", prodtlists);
    }



}