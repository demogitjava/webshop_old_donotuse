package de.jgsoftware.webshop.service;


import de.jgsoftware.webshop.dao.Doa_UserProductList;
import de.jgsoftware.webshop.model.Product;
import de.jgsoftware.webshop.service.interfaces.User_Product_List_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.util.StringUtils;

import javax.swing.*;
import java.util.*;
import java.util.Set;
import java.util.Iterator;

@Service
public class User_Product_List_Service implements User_Product_List_Interface
{

    @Autowired
    de.jgsoftware.webshop.dao.Doa_UserProductList doaUserProductList;

    public Doa_UserProductList getDoaUserProductList() {
        return doaUserProductList;
    }

    public void setDoaUserProductList(Doa_UserProductList doaUserProductList) {
        this.doaUserProductList = doaUserProductList;
    }

    public double priceshoppingchart(Double shoppingpriceitem, List productswithtextandprice)
    {
        double shopinngprice = 0.00;

        if(shoppingpriceitem == 0.00)
        {
            System.out.print("shpping item is 0");
            shoppingpriceitem = Double.valueOf(1);
        }

        else if(shoppingpriceitem < 0.00)
        {
            System.out.print("shpping item is 0");
            shoppingpriceitem = Double.valueOf(1);
        }

        Object objprice;
        //  String agentCode = (String)((Map) productswithtextandpric.next()).get("AGENTSURROGATECODE");
        // ((org.springframework.util.LinkedCaseInsensitiveMap)productswithtextandprice.get(0)).entrySet().toArray()[14]



        for(int i =0; i < productswithtextandprice.size(); i++)
        {
            System.out.print("die row ist" + i + "\n");

            objprice = ((LinkedCaseInsensitiveMap) productswithtextandprice.get(i)).entrySet().toArray()[14].toString();


            String result[] = ((String) objprice).split("=");
            String returnValue = result[result.length - 1]; //equals "ghfj.doc"

            shopinngprice = shoppingpriceitem * Double.parseDouble(returnValue);


        }

        return shopinngprice;
    }


    public Double getUSTChart(double dobletotal)
    {




        dobletotal = dobletotal / 100 * 19;

        Double ustchart = dobletotal;

        return ustchart;
    }

}