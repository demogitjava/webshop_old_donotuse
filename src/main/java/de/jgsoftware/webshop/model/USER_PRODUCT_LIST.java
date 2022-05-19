package de.jgsoftware.webshop.model;


import javax.persistence.*;

@Entity
@Table(name = "USER_PRODUCT_LIST", schema = "PUBLIC", catalog = "SHOPDB")
public class USER_PRODUCT_LIST
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;




    @Column(name = "user_id")
    private int user_id;

    @Column(name = "product_id")
    private long product_id;


    @OneToOne
    @JoinColumn(referencedColumnName = "ID", nullable=false)
    private Kundenstamm customer;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }
}