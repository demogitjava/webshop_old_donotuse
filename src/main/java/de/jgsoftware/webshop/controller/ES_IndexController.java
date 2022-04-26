package de.jgsoftware.webshop.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import de.jgsoftware.webshop.controller.interfaces.iES_IndexController;

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