package de.jgsoftware.webshop.dao;


import de.jgsoftware.webshop.model.Kundenstamm;
import de.jgsoftware.webshop.model.PRODUCT_CHECK_OUT_TEXT;
import de.jgsoftware.webshop.model.USER_PRODUCT_LIST;

import de.jgsoftware.webshop.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;


@Repository
public class Dao_UserProductList
{


    @Autowired
    private JdbcTemplate jtm;


    @PersistenceContext
    private EntityManager em;




    // insert record
    public USER_PRODUCT_LIST saveEntrytoDatabase(USER_PRODUCT_LIST user_product_list)
    {


        jtm.update("insert into user_product_list " +
                        "(user_id, product_id) " +
                        "values (?, ?)",
                user_product_list.getUser_id(),
                user_product_list.getProduct_id());

        return user_product_list;
    }

    public String saveuserdata(String productId, Long userid)
    {

        int prorid = Integer.parseInt(productId);


        try {
            jtm.update("INSERT INTO user_product_list (user_id, product_id, id) VALUES (?, ?, ?)", userid, prorid, prorid);

        } catch(Exception e)
        {
            // User Product exist in Product Table

            System.out.print("product exist");
        }
        return "userproduct_saved";
    }


    public List getUserId(String stusername)
    {

        List userlistid = jtm.query("select * from users where username like " + "'" + stusername + "'", new BeanPropertyRowMapper(Users.class));

        return userlistid;
    }

    public List getUserdataafterLogin(String stusername)
    {
        List userlistid = jtm.query("select * from users where username like " + "'" + stusername + "'", new BeanPropertyRowMapper(Users.class));
        return userlistid;
    }

    public List getCustomerdataoveremail(String stemail)
    {
        List customeroveremail = jtm.query("select * from kundenstamm where email like " + "'" + stemail + "'", new BeanPropertyRowMapper(Kundenstamm.class));

        return customeroveremail;
    }

    public List getCheckoutdata(Integer id_kundernumber)
    {



        //select * from KUNDENSTAMM JOIN USER_PRODUCT_LIST on KUNDENSTAMM.ID = USER_ID join PRODUCT_CHECK_OUT_TEXT on USER_PRODUCT_LIST.PRODUCT_ID = PRODUCT_CHECK_OUT_TEXT.ID_PRODUCTS where KUNDENSTAMM.ID like '1';

        Kundenstamm kdstamm = new Kundenstamm();


        /*
                 List customercheckout = (List) jtm.query("select * from KUNDENSTAMM JOIN USER_PRODUCT_LIST on KUNDENSTAMM.ID = USER_ID join PRODUCT_CHECK_OUT_TEXT on USER_PRODUCT_LIST.PRODUCT_ID = PRODUCT_CHECK_OUT_TEXT.ID_PRODUCTS where KUNDENSTAMM.ID like " + "'" + id_kundernumber + "'", new BeanPropertyRowMapper(kdstamm.getClass()));
         */

        String sql = "select * from KUNDENSTAMM JOIN USER_PRODUCT_LIST on KUNDENSTAMM.ID = USER_ID join PRODUCT_CHECK_OUT_TEXT on USER_PRODUCT_LIST.PRODUCT_ID = PRODUCT_CHECK_OUT_TEXT.ID_PRODUCTS where KUNDENSTAMM.ID like " + "'" + id_kundernumber + "'";
        List<Map<String, Object>> customercheckout = (List<Map<String, Object>>) jtm.queryForList(sql);

        return customercheckout;
    }


    public List getCustomercheckoutproductswithprice(Integer id_kundernumber)
    {

        String pid = new String("productId");
        String sql = "Select * from USER_PRODUCT_LIST join PRODUCT_CHECK_OUT_TEXT on PRODUCT_CHECK_OUT_TEXT.ID_PRODUCTS = USER_PRODUCT_LIST.PRODUCT_ID join PRODUCTS on \"productId\" = USER_PRODUCT_LIST.PRODUCT_ID where USER_ID like  + 1";
        List<Map<String, Object>> pdcheckout = (List<Map<String, Object>>) jtm.queryForList(sql);

        return pdcheckout;
    }


}

