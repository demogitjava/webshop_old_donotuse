package de.jgsoftware.webshop.dao.interfaces;

import de.jgsoftware.webshop.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface i_daoProduct
{
    public List<Product> getProductsforLandingpage();
    public Product getProductById(long productId);
    public List<Product> searchProductovertextfield(String searchProduct, Pageable pageable);
    public List<Product> searchProductop25(String searchProduct);
}