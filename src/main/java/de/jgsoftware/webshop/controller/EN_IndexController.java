package de.jgsoftware.webshop.controller;



import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/en")
public class EN_IndexController
{

    // EN English is set by default
    @GetMapping({"en", "/"})
    public ModelAndView index()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", java.util.Locale.getDefault().getCountry());
        return new ModelAndView("/en/index.html", prodtlists);
    }



}