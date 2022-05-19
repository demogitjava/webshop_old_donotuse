package de.jgsoftware.webshop.dao;

import de.jgsoftware.webshop.dao.interfaces.i_daoProduct;
import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DaoProduct implements i_daoProduct
{

    @Autowired
    private JdbcTemplate jtm;


    public List<Product> productList;


    public List<Product> getProductsforLandingpage()
    {


        productList = jtm.query("select * from public.PRODUCTS where LANDINGPAGE like '1'", new BeanPropertyRowMapper(Product.class));

        return productList;
    }



    public Product getProductById(long productId)
    {
        de.jgsoftware.webshop.model.Product cartuserproduct = new de.jgsoftware.webshop.model.Product();



        // select * from public.PRODUCT where product_id = 1;
        String sql = "select * from public.PRODUCTS where product_id = " + productId;
        cartuserproduct = (Product) jtm.queryForObject(sql, new BeanPropertyRowMapper(Product.class));


        // jtm.query("select * from USERDETAIL where username like " + "'" + result + "'", new BeanPropertyRowMapper(User.class));
        //List<Product> productList = jtm.query("select * from public.PRODUCT where product_id =" + productId, new BeanPropertyRowMapper(Product.class));

        return cartuserproduct;
    }


    // textfield in webshop
    public List<Product> searchProductovertextfield(String searchProduct, Pageable pageable)
    {
        productList = jtm.query("select * from Products where productname like " + "'" + searchProduct + "'", new BeanPropertyRowMapper(Product.class));
        return productList;
    }


    // textfield in webshop with top 25
    public List<Product> searchProductop25(String searchProduct)
    {
        productList = jtm.query("select top(25) * from Products where productname like " + "'" + searchProduct + "'", new BeanPropertyRowMapper(Product.class));
        return productList;
    }

}