package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.data.domain.Pageable;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
public interface iDE_IndexController
{

    @GetMapping({"de", "/"})
    ModelAndView index(Device device);

    @GetMapping("login")
    String login();

    @PostMapping("addProcducttocase")
    ModelAndView getProduct();

    @RequestMapping("fr")
    String pagefr();

    @RequestMapping("en")
    public String pageen();

    @RequestMapping("it")
    String pageit();

    @RequestMapping("tk")
    String pagetk();

    @RequestMapping("es")
    String pagees();

    @RequestMapping("admin")
    String pageadmin();

    @RequestMapping("manager")
    String pagemanager();

    @PostMapping("searchProduct")
    ModelAndView searchProduct(@RequestParam(value = "searchProduct", required = false) String searchProduct, Pageable pageable, Device device);

    @GetMapping(value = "pagination")
    ModelAndView getEmployees(@RequestParam(value = "page", required = false) Integer page,
                                     Pageable pageable, Device device);

    @GetMapping(value = "nextpage")
    ModelAndView getnextpage(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device);

    @GetMapping(value = "previous")
    ModelAndView setprevious(@RequestParam(value = "page", required = false) Integer page,
                                    Pageable pageable, Device device);
}
