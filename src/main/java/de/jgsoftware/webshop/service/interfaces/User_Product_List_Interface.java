package de.jgsoftware.webshop.service.interfaces;


import de.jgsoftware.webshop.dao.Dao_UserProductList;

import java.util.List;

public interface User_Product_List_Interface
{

    Dao_UserProductList getDaoUserProductList();
    void setDoaUserProductList(Dao_UserProductList daoUserProductList);
    double priceshoppingchart(Double shoppingpriceitem, List productswithtextandprice);
    Double getUSTChart(double shoppingpriceitem);
}