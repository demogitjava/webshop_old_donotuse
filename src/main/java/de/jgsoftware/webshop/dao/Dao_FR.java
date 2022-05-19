package de.jgsoftware.webshop.dao;

import de.jgsoftware.webshop.dao.interfaces.i_daofr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Dao_FR implements i_daofr
{

    @Autowired
    private JdbcTemplate jtm;






}