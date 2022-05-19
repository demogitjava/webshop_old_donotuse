package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.dao.DaoUser;
import de.jgsoftware.webshop.service.interfaces.i_User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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