package de.jgsoftware.webshop.dao;

import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.List;
import java.util.Locale;
import de.jgsoftware.webshop.dao.interfaces.i_daoindex;
@Repository
public class DaoIndex implements i_daoindex
{

    @Autowired
    private JdbcTemplate jtm;


    @Override
    public List<Product> getUserProductList()
    {


        //return "";
        return null;
    }


}