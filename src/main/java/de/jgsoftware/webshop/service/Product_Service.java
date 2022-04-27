package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import de.jgsoftware.webshop.dao.DaoProduct;
import de.jgsoftware.webshop.service.interfaces.i_Product_Service;
import java.util.List;

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