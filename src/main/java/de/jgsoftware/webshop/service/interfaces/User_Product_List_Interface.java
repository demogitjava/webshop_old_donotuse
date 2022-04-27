package de.jgsoftware.webshop.service.interfaces;


import de.jgsoftware.webshop.service.User_Product_List_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedCaseInsensitiveMap;

import de.jgsoftware.webshop.dao.Dao_UserProductList;
import java.util.List;

public interface User_Product_List_Interface
{

    Dao_UserProductList getDaoUserProductList();
    void setDoaUserProductList(Dao_UserProductList daoUserProductList);
    double priceshoppingchart(Double shoppingpriceitem, List productswithtextandprice);
    Double getUSTChart(double shoppingpriceitem);
}