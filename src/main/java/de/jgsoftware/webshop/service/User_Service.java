package de.jgsoftware.webshop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import de.jgsoftware.webshop.dao.DaoUser;

import java.util.List;

@Service
public class User_Service
{
    @Autowired
    private DaoUser daoUser;



    public DaoUser getDaoUser() {
        return daoUser;
    }

    public void setDaoUser(DaoUser daoUser) {
        this.daoUser = daoUser;
    }




}