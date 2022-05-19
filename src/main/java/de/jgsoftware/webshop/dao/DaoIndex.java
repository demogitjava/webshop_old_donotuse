package de.jgsoftware.webshop.dao;

import de.jgsoftware.webshop.dao.interfaces.i_daoindex;
import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
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