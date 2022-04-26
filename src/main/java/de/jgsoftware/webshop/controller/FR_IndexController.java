package de.jgsoftware.webshop.controller;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import de.jgsoftware.webshop.controller.interfaces.iFR_IndexController;

@Controller
public class FR_IndexController implements iFR_IndexController
{

    // FR French
    @Override
    public ModelAndView fr()
    {


        Map<String, Object> prodtlists = new HashMap<>();

        prodtlists.put("lang", java.util.Locale.getDefault().getCountry());
        return new ModelAndView("/fr/index.html", prodtlists);
    }

}