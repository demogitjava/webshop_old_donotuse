package de.jgsoftware.webshop.service.interfaces;

import de.jgsoftware.webshop.dao.DaoUser;

public interface i_User_Service
{

    DaoUser getDaoUser();
    void setDaoUser(DaoUser daoUser);
}
