package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.dao.Dao_FR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FR_Service
{
    @Autowired
    Dao_FR dao_fr;


    public Dao_FR getDao_fr() {
        return dao_fr;
    }

    public void setDao_fr(Dao_FR dao_fr) {
        this.dao_fr = dao_fr;
    }
}