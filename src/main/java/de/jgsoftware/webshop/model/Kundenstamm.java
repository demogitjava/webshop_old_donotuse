package de.jgsoftware.webshop.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "KUNDENSTAMM", schema = "PUBLIC", catalog = "SHOPDB")
public class Kundenstamm
{

    private long kundennummer;

    private String ansprechpartner;
    private String blz;
    private String email;
    private String iban;
    private String konto_nr;
    private double kreditlimit;
    private String land;
    private String mobil1;
    private String mobil2;
    private String name_anschrift1;
    private String name_anschrift2;
    private String name_anschrift3;
    private String name_anschrift4;
    private String ort;
    private int plz;
    private String sip;
    private String strasse;
    private String telefon;
    private Timestamp timestamp;
    private Float umsatz_jahr_1;
    private Float umsatz_jahr_2;
    private Float umsatz_ldf_jahr;

    private String firmenname;




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(mappedBy="customer")
    private USER_PRODUCT_LIST order;


    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public USER_PRODUCT_LIST getOrder() {
        return order;
    }

    public void setOrder(USER_PRODUCT_LIST order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public long getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(long kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getKonto_nr() {
        return konto_nr;
    }

    public void setKonto_nr(String konto_nr) {
        this.konto_nr = konto_nr;
    }

    public double getKreditlimit() {
        return kreditlimit;
    }

    public void setKreditlimit(double kreditlimit) {
        this.kreditlimit = kreditlimit;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getMobil1() {
        return mobil1;
    }

    public void setMobil1(String mobil1) {
        this.mobil1 = mobil1;
    }

    public String getMobil2() {
        return mobil2;
    }

    public void setMobil2(String mobil2) {
        this.mobil2 = mobil2;
    }

    public String getName_anschrift1() {
        return name_anschrift1;
    }

    public void setName_anschrift1(String name_anschrift1) {
        this.name_anschrift1 = name_anschrift1;
    }

    public String getName_anschrift2() {
        return name_anschrift2;
    }

    public void setName_anschrift2(String name_anschrift2) {
        this.name_anschrift2 = name_anschrift2;
    }

    public String getName_anschrift3() {
        return name_anschrift3;
    }

    public void setName_anschrift3(String name_anschrift3) {
        this.name_anschrift3 = name_anschrift3;
    }

    public String getName_anschrift4() {
        return name_anschrift4;
    }

    public void setName_anschrift4(String name_anschrift4) {
        this.name_anschrift4 = name_anschrift4;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Float getUmsatz_jahr_1() {
        return umsatz_jahr_1;
    }

    public void setUmsatz_jahr_1(Float umsatz_jahr_1) {
        this.umsatz_jahr_1 = umsatz_jahr_1;
    }

    public Float getUmsatz_jahr_2() {
        return umsatz_jahr_2;
    }

    public void setUmsatz_jahr_2(Float umsatz_jahr_2) {
        this.umsatz_jahr_2 = umsatz_jahr_2;
    }

    public Float getUmsatz_ldf_jahr() {
        return umsatz_ldf_jahr;
    }

    public void setUmsatz_ldf_jahr(Float umsatz_ldf_jahr) {
        this.umsatz_ldf_jahr = umsatz_ldf_jahr;
    }

}