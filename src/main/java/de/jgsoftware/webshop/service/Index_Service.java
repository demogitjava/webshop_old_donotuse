package de.jgsoftware.webshop.service;

import de.jgsoftware.webshop.dao.DaoIndex;
import de.jgsoftware.webshop.dao.DaoProduct;
import de.jgsoftware.webshop.model.Product;
import de.jgsoftware.webshop.service.interfaces.I_Index_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Index_Service implements I_Index_Service
{

    @Autowired
    DaoIndex daoindex;

    @Autowired
    DaoProduct daoProduct;

    public int listsize;

    public Pageable pageable;


    @Override
    public DaoProduct getDaoProduct() {
        return daoProduct;
    }

    @Override
    public void setDaoProduct(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }

    @Override
    public DaoIndex getDaoindex() {
        return daoindex;
    }

    @Override
    public void setDaoindex(DaoIndex daoindex) {
        this.daoindex = daoindex;
    }


    @Override
    public DaoIndex getDaoIndex()
    {


        return daoindex;
    }


    @Override
    public Integer getdefaultSize(List<Product> productList)
    {
        listsize = productList.size() /10;

        if(listsize == 0)
        {
            return 1;
        }


        return listsize;
    }



    @Override
    public PagedListHolder getpageList(List<Product> productList)
    {
        PagedListHolder pagelist = new PagedListHolder(productList);

        pagelist.getPageCount(); // number of pages
        pagelist.getPageList();  // a List which represents the current page

        return pagelist;
    }



    @Override
    public List<Product> getpageSublist(List<Product> productList, int page)
    {

        List<Product> pagelist = null;      // create sublist

        if(page == 0)
        {
            System.out.print("list is null // 0 - 9" + "\n" + "\n");
            pagelist = productList.subList(0, productList.size());
        }
        else
        {
            int pagesite = page * 10;
            int topageitem = (page +1) *10 -1;


            try
            {
                pagelist = productList.subList(page *10, (page +1) *10 -1);
            } catch (Exception e)
            {
                pagelist = productList.subList(0, productList.size());
                System.out.print("Fehler " + e);
            }
        }



        return pagelist;
    }
}