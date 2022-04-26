package de.jgsoftware.webshop.service.interfaces;

import de.jgsoftware.webshop.dao.Doa_UserProductList;
import de.jgsoftware.webshop.service.User_Product_List_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.List;

public interface User_Product_List_Interface
{

    public Doa_UserProductList getDoaUserProductList();
    public void setDoaUserProductList(Doa_UserProductList doaUserProductList);

    public double priceshoppingchart(Double shoppingpriceitem, List productswithtextandprice);
    public Double getUSTChart(double shoppingpriceitem);
}