package de.jgsoftware.webshop.dao;

import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import de.jgsoftware.webshop.dao.interfaces.i_daofr;

@Repository
public class Dao_FR implements i_daofr
{

    @Autowired
    private JdbcTemplate jtm;






}