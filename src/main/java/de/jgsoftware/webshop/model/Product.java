package de.jgsoftware.webshop.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS", schema = "PUBLIC", catalog = "SHOPDB")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    @Column
    private String productName;

    @Lob
    private String productDescription;

    @Column(precision=16, scale=2)
    @NumberFormat(pattern="#0.00000")
    private int productPrice;

    @Column
    private int productUnit;

    private String image;

    private int landingpage;

    @Lob
    private String productDescription_EN;

    @Lob
    private String productDescription_ES;

    @Lob
    private String productDescription_FR;

    @Lob
    private String productDescription_IT;

    @Lob
    private String productDescription_TR;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(int productUnit) {
        this.productUnit = productUnit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLandingpage() {
        return landingpage;
    }

    public void setLandingpage(int landingpage) {
        this.landingpage = landingpage;
    }

    public String getProductDescription_EN() {
        return productDescription_EN;
    }

    public void setProductDescription_EN(String productDescription_EN) {
        this.productDescription_EN = productDescription_EN;
    }

    public String getProductDescription_ES() {
        return productDescription_ES;
    }

    public void setProductDescription_ES(String productDescription_ES) {
        this.productDescription_ES = productDescription_ES;
    }

    public String getProductDescription_FR() {
        return productDescription_FR;
    }

    public void setProductDescription_FR(String productDescription_FR) {
        this.productDescription_FR = productDescription_FR;
    }

    public String getProductDescription_IT() {
        return productDescription_IT;
    }

    public void setProductDescription_IT(String productDescription_IT) {
        this.productDescription_IT = productDescription_IT;
    }

    public String getProductDescription_TR() {
        return productDescription_TR;
    }

    public void setProductDescription_TR(String productDescription_TR) {
        this.productDescription_TR = productDescription_TR;
    }
}