package de.jgsoftware.webshop.controller.interfaces;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/admin/")
@PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')")
public interface i_AdminController
{
    @GetMapping({"admin", "/"})
    ModelAndView index();
}
