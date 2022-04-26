package de.jgsoftware.webshop.service.interfaces;

import de.jgsoftware.webshop.model.Product;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface I_Index_Service
{
    public Integer getdefaultSize(List<Product> productList);
    public PagedListHolder getpageList(List<Product> productList);
    public List<Product> getpageSublist(List<Product> productList, int page);

}