package de.jgsoftware.webshop;


import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;


@SpringBootApplication
public interface iWebShop
{


    public static void main(String[] args)
    {
        SpringApplication.run(WebshopApplication.class, args);
    }



}
