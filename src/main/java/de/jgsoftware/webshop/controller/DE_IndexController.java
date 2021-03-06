package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.controller.interfaces.iDE_IndexController;
import de.jgsoftware.webshop.model.Product;
import de.jgsoftware.webshop.service.interfaces.I_Index_Service;
import de.jgsoftware.webshop.service.interfaces.i_Product_Service;
import de.jgsoftware.webshop.service.interfaces.i_User_Service;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Controller
public class DE_IndexController implements iDE_IndexController
{


    @Autowired
    I_Index_Service indexservice;

    @Autowired
    i_User_Service userService;

    @Autowired
    i_Product_Service pservice;


    Pageable pageable;



    @Autowired
    HttpServletRequest request = null;

    // Container ModalAndView
    public Map<String, Object> prodtlists;

    // return itemlist from query over TextField
    private List<Product> productList;
    public static String lang;
    private ModelAndView mv;
    static int page;


    // DE German
    @Override
    public ModelAndView index(@NotNull Device device)
    {
        //Locale locale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);


        prodtlists = new HashMap<>();
        prodtlists.put("productList", indexservice.getDaoProduct().getProductsforLandingpage());

        prodtlists.put("lang", request.getLocale().getLanguage());

        if (device.isMobile()) {
            System.out.print("mobile page" + "\n");
            return new ModelAndView("mobile/index", prodtlists);
        } else if (device.isTablet()) {
            return new ModelAndView("tablet/index", prodtlists);
        } else if (device.isNormal()){
            return new ModelAndView("index", prodtlists);
        }
        else
        {
            // desktop
            // /resources/templates/index.html
            return new ModelAndView("index", prodtlists);
        }
    }



    @Override
    public String login()
    {

        return "login";
    }


    @Override
    public ModelAndView getProduct()
    {
        mv = new ModelAndView("index");
        return mv;
    }


    /*
            loading supported language from browser

     */
    @Override
    public String pagefr() {
        return "/fr/index";
    }

    @Override
    public String pageen() {
        return "/en/index";
    }

    @Override
    public String pageit() {
        return "/it/index";
    }

    @Override
    public String pagetk() {
        return "/tk/index";
    }

    @Override
    public String pagees() {
        return "/es/index";
    }

    @Override
    public String pageadmin() {
        return "/admin/index";
    }

    @Override
    public String pagemanager() {
        return "/manager/index";
    }


    @Override
    public ModelAndView searchProduct(@RequestParam(value = "searchProduct", required = false) String searchProduct, Pageable pageable, Device device)
    {
        lang = (String) request.getLocale().getLanguage();
        productList = indexservice.getDaoProduct().searchProductovertextfield(searchProduct, pageable);
        //Locale locale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);
        prodtlists = new HashMap<>();

        prodtlists.put("productList", indexservice.getpageSublist(productList, page));
        // prodtlists.put("page", indexservice.getpageList(productList));  // for list items pagable
        prodtlists.put("page", page);  // for list items pagable

        int pageSize = (Integer) indexservice.getdefaultSize(productList);
        prodtlists.put("pageSize", pageSize); // size of Items from Productlist
        prodtlists.put("lang", lang);

        if (device.isMobile()) {
            return new ModelAndView("mobile/index", prodtlists);
        } else if (device.isTablet()) {
            return new ModelAndView("tablet/index", prodtlists);
        } else if (device.isNormal()){
            return new ModelAndView("index", prodtlists);
        }
        else
        {
            // desktop
            // /resources/templates/index.html
            return new ModelAndView("index", prodtlists);
        }
    }


    @Override
    public ModelAndView getEmployees(@RequestParam(value = "page", required = false) Integer page,
                                     Pageable pageable, Device device)
    {

        lang = (String) request.getLocale().getLanguage();

        //Locale locale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);
        prodtlists = new HashMap<>();

        prodtlists.put("productList", indexservice.getpageSublist(productList, page));  // pageable list
        prodtlists.put("page", page);  // for list items pagable

        int pageSize = (Integer) indexservice.getdefaultSize(productList);
        prodtlists.put("pageSize", pageSize); // size of Items from Productlist
        prodtlists.put("lang", lang);


        if (device.isMobile()) {

            System.out.print("mobile page "+ "\n");
            return new ModelAndView("mobile/index", prodtlists);

        } else if (device.isTablet()) {
            return new ModelAndView("tablet/index", prodtlists);
        } else if (device.isNormal()){
            return new ModelAndView("index", prodtlists);
        }
        else
        {
            // desktop
            // /resources/templates/index.html
            return new ModelAndView("index", prodtlists);
        }

    }

    @Override
    public ModelAndView getnextpage(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device)
    {

        page = page + 1;
        lang = (String) request.getLocale().getLanguage();
        //Locale locale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);
        prodtlists = new HashMap<>();

        prodtlists.put("productList", indexservice.getpageSublist(productList, page));  // pageable list


        prodtlists.put("page", page);  // for list items pagable

        int pageSize = (Integer) indexservice.getdefaultSize(productList);
        prodtlists.put("pageSize", pageSize); // size of Items from Productlist
        prodtlists.put("lang", lang);


        if (device.isMobile()) {
            return new ModelAndView("mobile/index", prodtlists);
        } else if (device.isTablet()) {
            return new ModelAndView("tablet/index", prodtlists);
        } else if (device.isNormal()){
            return new ModelAndView("index", prodtlists);
        }
        else
        {
            // desktop
            // /resources/templates/index.html
            return new ModelAndView("index", prodtlists);
        }

    }


    @Override
    public ModelAndView setprevious(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device)
    {

        page = page - 1;
        lang = (String) request.getLocale().getLanguage();
        //Locale locale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);
        prodtlists = new HashMap<>();

        prodtlists.put("productList", indexservice.getpageSublist(productList, page));  // pageable list

        prodtlists.put("page", page);  // for list items pagable

        int pageSize = (Integer) indexservice.getdefaultSize(productList);
        prodtlists.put("pageSize", pageSize); // size of Items from Productlist
        prodtlists.put("lang", lang);


        if (device.isMobile()) {
            return new ModelAndView("mobile/index", prodtlists);
        } else if (device.isTablet()) {
            return new ModelAndView("tablet/index", prodtlists);
        } else if (device.isNormal()){
            return new ModelAndView("index", prodtlists);
        }
        else
        {
            // desktop
            // /resources/templates/index.html
            return new ModelAndView("index", prodtlists);
        }

    }




}