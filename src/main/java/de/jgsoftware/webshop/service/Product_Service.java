package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import de.jgsoftware.webshop.dao.DaoProduct;

import java.util.List;

@Service
public class Product_Service
{

    @Autowired
    DaoProduct daoProduct;





    public DaoProduct getDaoProduct() {
        return daoProduct;
    }

    public void setDaoProduct(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }



}