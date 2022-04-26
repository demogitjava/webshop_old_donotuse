package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.controller.interfaces.i_AdminController;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
public class AdminController implements i_AdminController
{




    @Override
    public ModelAndView index()
    {
        Map<String, Object> prodtlists = new HashMap<>();

        return new ModelAndView("/admin/index.html", prodtlists);
    }



}