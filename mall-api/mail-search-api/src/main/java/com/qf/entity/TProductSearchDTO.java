package com.qf.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TProductSearchDTO implements Serializable {
    private Long id;
    private String tProductName;
    private double tProductPrice;
    private double tProductSaleprice;
    private String tProductPimage;
    private String tProductPdesc;

    public TProductSearchDTO() {
    }

    public TProductSearchDTO(Long id, String tProductName, double tProductPrice, double tProductSaleprice, String tProductPimage, String tProductPdesc) {
        this.id = id;
        this.tProductName = tProductName;
        this.tProductPrice = tProductPrice;
        this.tProductSaleprice = tProductSaleprice;
        this.tProductPimage = tProductPimage;
        this.tProductPdesc = tProductPdesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettProductName() {
        return tProductName;
    }

    public void settProductName(String tProductName) {
        this.tProductName = tProductName;
    }

    public double gettProductPrice() {
        return tProductPrice;
    }

    public void settProductPrice(double tProductPrice) {
        this.tProductPrice = tProductPrice;
    }

    public double gettProductSaleprice() {
        return tProductSaleprice;
    }

    public void settProductSaleprice(double tProductSaleprice) {
        this.tProductSaleprice = tProductSaleprice;
    }

    public String gettProductPimage() {
        return tProductPimage;
    }

    public void settProductPimage(String tProductPimage) {
        this.tProductPimage = tProductPimage;
    }

    public String gettProductPdesc() {
        return tProductPdesc;
    }

    public void settProductPdesc(String tProductPdesc) {
        this.tProductPdesc = tProductPdesc;
    }

    @Override
    public String toString() {
        return "TProductSearchDTO{" +
                "id=" + id +
                ", tProductName='" + tProductName + '\'' +
                ", tProductPrice=" + tProductPrice +
                ", tProductSaleprice=" + tProductSaleprice +
                ", tProductPimage='" + tProductPimage + '\'' +
                ", tProductPdesc='" + tProductPdesc + '\'' +
                '}';
    }
}
