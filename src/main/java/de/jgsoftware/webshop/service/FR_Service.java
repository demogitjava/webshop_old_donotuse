package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.dao.Dao_FR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.jgsoftware.webshop.service.FR_Service;

import de.jgsoftware.webshop.service.interfaces.i_fr_service;
@Service
public class FR_Service implements i_fr_service
{
    @Autowired
    Dao_FR dao_fr;


    @Override
    public Dao_FR getDao_fr() {
        return dao_fr;
    }

    @Override
    public void setDao_fr(Dao_FR dao_fr) {
        this.dao_fr = dao_fr;
    }
}