package de.jgsoftware.webshop.dao.interfaces;

import de.jgsoftware.webshop.model.Kundenstamm;
import de.jgsoftware.webshop.model.Users;

import java.util.List;

public interface i_daouser
{

    Kundenstamm findByEmail(String email);
    Users getUsers();
    void setUsers(Users users);
    List<Kundenstamm> getUserlogin();
    void setUserlogin(List<Kundenstamm> userlogin);

}
