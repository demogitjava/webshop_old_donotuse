package de.jgsoftware.webshop.controller;

import de.jgsoftware.webshop.controller.interfaces.iFR_IndexController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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