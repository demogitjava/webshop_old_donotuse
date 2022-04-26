package de.jgsoftware.webshop.dao.interfaces;

import de.jgsoftware.webshop.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface i_daoProduct
{
    List<Product> getProductsforLandingpage();
    Product getProductById(long productId);
    List<Product> searchProductovertextfield(String searchProduct, Pageable pageable);
    List<Product> searchProductop25(String searchProduct);
}