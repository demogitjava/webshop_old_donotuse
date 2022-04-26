package de.jgsoftware.webshop.controller;


import de.jgsoftware.webshop.model.Product;
import de.jgsoftware.webshop.service.Index_Service;
import de.jgsoftware.webshop.service.User_Service;
import de.jgsoftware.webshop.service.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.*;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DE_IndexController
{


    @Autowired
    Index_Service indexservice;

    @Autowired
    User_Service userService;

    @Autowired
    Product_Service pservice;


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
    @GetMapping({"de", "/"})
    public ModelAndView index(Device device)
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



    @GetMapping("login")
    public String login()
    {

        return "login";
    }


    @PostMapping("addProcducttocase")
    public ModelAndView getProduct()
    {
        mv = new ModelAndView("index");
        return mv;
    }


    /*
            loading supported language from browser

     */
    @RequestMapping("fr")
    public String pagefr() {
        return "/fr/index";
    }

    @RequestMapping("en")
    public String pageen() {
        return "/en/index";
    }

    @RequestMapping("it")
    public String pageit() {
        return "/it/index";
    }

    @RequestMapping("tk")
    public String pagetk() {
        return "/tk/index";
    }

    @RequestMapping("es")
    public String pagees() {
        return "/es/index";
    }

    @RequestMapping("admin")
    public String pageadmin() {
        return "/admin/index";
    }

    @RequestMapping("manager")
    public String pagemanager() {
        return "/manager/index";
    }


    @PostMapping("searchProduct")
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


    @GetMapping(value = "pagination")
    public ModelAndView getEmployees(@RequestParam(value = "page", required = false) Integer page,
                                     Pageable pageable, Device device) {

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

    @GetMapping(value = "nextpage")
    public ModelAndView getnextpage(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device) {

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


    @GetMapping(value = "previous")
    public ModelAndView setprevious(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device) {

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