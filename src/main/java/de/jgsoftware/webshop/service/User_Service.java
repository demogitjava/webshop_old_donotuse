package de.jgsoftware.webshop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import de.jgsoftware.webshop.dao.DaoUser;

import java.util.List;
import de.jgsoftware.webshop.service.interfaces.i_User_Service;
@Service
public class User_Service implements i_User_Service
{
    @Autowired
    private DaoUser daoUser;



    @Override
    public DaoUser getDaoUser() {
        return daoUser;
    }

    @Override
    public void setDaoUser(DaoUser daoUser) {
        this.daoUser = daoUser;
    }




}