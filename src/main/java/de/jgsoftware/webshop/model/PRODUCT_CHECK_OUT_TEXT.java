package de.jgsoftware.webshop.model;


import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_CHECK_OUT_TEXT", schema = "PUBLIC", catalog = "SHOPDB")
public class PRODUCT_CHECK_OUT_TEXT
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Lob
    private String product_name_de;

    @Lob
    private String product_name_en;

    @Lob
    private String product_name_es;

    @Lob
    private String product_name_fr;

    @Lob
    private String product_name_it;

    @Lob
    private String product_name_tr;

    private long artikelnumber;

    private Integer id_products;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name_de() {
        return product_name_de;
    }

    public void setProduct_name_de(String product_name_de) {
        this.product_name_de = product_name_de;
    }

    public String getProduct_name_en() {
        return product_name_en;
    }

    public void setProduct_name_en(String product_name_en) {
        this.product_name_en = product_name_en;
    }

    public String getProduct_name_es() {
        return product_name_es;
    }

    public void setProduct_name_es(String product_name_es) {
        this.product_name_es = product_name_es;
    }

    public String getProduct_name_fr() {
        return product_name_fr;
    }

    public void setProduct_name_fr(String product_name_fr) {
        this.product_name_fr = product_name_fr;
    }

    public String getProduct_name_it() {
        return product_name_it;
    }

    public void setProduct_name_it(String product_name_it) {
        this.product_name_it = product_name_it;
    }

    public String getProduct_name_tr() {
        return product_name_tr;
    }

    public void setProduct_name_tr(String product_name_tr) {
        this.product_name_tr = product_name_tr;
    }

    public long getArtikelnumber() {
        return artikelnumber;
    }

    public void setArtikelnumber(long artikelnumber) {
        this.artikelnumber = artikelnumber;
    }

    public Integer getId_products() {
        return id_products;
    }

    public void setId_products(Integer id_products) {
        this.id_products = id_products;
    }
}