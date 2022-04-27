package de.jgsoftware.webshop.dao.interfaces;

import de.jgsoftware.webshop.model.USER_PRODUCT_LIST;

import java.util.List;

public interface i_dao_userproductlist
{

    USER_PRODUCT_LIST saveEntrytoDatabase(USER_PRODUCT_LIST user_product_list);
    String saveuserdata(String productId, Long userid);
    List getUserId(String stusername);
    List getUserdataafterLogin(String stusername);

    List getCustomerdataoveremail(String stemail);
    List getCheckoutdata(Integer id_kundernumber);

    List getCustomercheckoutproductswithprice(Integer id_kundernumber);



}
