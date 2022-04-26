package de.jgsoftware.webshop.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/tr")
public class TR_IndexController
{

    // TR Türkey
    @GetMapping({"tr", "/"})
    public ModelAndView index()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", Locale.getDefault().getCountry());
        return new ModelAndView("/tr/index.html", prodtlists);
    }



}