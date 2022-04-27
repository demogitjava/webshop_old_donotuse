package de.jgsoftware.webshop.service.interfaces;

import de.jgsoftware.webshop.dao.DaoProduct;

public interface i_Product_Service
{
    DaoProduct getDaoProduct();
    void setDaoProduct(DaoProduct daoProduct);
}
