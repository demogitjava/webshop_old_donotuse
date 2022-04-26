package de.jgsoftware.webshop.config;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mobile.device.DeviceHandlerMethodArgumentResolver;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import de.jgsoftware.webshop.config.AppConfigLocale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Locale;

@Configuration
public class MvcConfig implements WebMvcConfigurer {





    private AppConfigLocale appConfigLocale;

    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("de");

        registry.addViewController("/en/").setViewName("en");
        registry.addViewController("/es/").setViewName("es");
        registry.addViewController("/fr/").setViewName("fr");
        registry.addViewController("/it/").setViewName("it");
        registry.addViewController("/tr/").setViewName("tr");


        registry.addViewController("/admin/").setViewName("admin");
        registry.addViewController("/profile/").setViewName("profile");
        registry.addViewController("/profile/").setViewName("cart-product");
        registry.addViewController("/login/").setViewName("login");
        registry.addViewController("/manager/").setViewName("manager");

    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DeviceResolverHandlerInterceptor());
    }
}
