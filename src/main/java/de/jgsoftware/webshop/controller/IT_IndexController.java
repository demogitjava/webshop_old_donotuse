package de.jgsoftware.webshop.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import de.jgsoftware.webshop.controller.interfaces.iIT_IndexController;

@Controller
public class IT_IndexController implements iIT_IndexController
{

    private Locale locale;


    // IT Italy
    @Override
    public ModelAndView it()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        return new ModelAndView("/it/index.html", prodtlists);
    }



}