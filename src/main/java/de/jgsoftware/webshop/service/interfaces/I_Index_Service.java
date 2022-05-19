package de.jgsoftware.webshop.service.interfaces;

import de.jgsoftware.webshop.dao.DaoIndex;
import de.jgsoftware.webshop.dao.DaoProduct;
import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.support.PagedListHolder;

import java.util.List;

public interface I_Index_Service
{
    DaoProduct getDaoProduct();
    void setDaoProduct(DaoProduct daoProduct);
    DaoIndex getDaoindex();
    void setDaoindex(DaoIndex daoindex);

    DaoIndex getDaoIndex();
    Integer getdefaultSize(List<Product> productList);

    PagedListHolder getpageList(List<Product> productList);
    List<Product> getpageSublist(List<Product> productList, int page);

}