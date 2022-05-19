package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.dao.DaoProduct;
import de.jgsoftware.webshop.service.interfaces.i_Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_Service implements i_Product_Service
{

    @Autowired
    DaoProduct daoProduct;





    @Override
    public DaoProduct getDaoProduct() {
        return daoProduct;
    }


    @Override
    public void setDaoProduct(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }



}