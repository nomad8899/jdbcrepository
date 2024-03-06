package com.ohgiraffers.model.dto;

public class MenuDTO implements java.io.Serializable {

    private int code;
    private String name;
    private int price;
    private int cCode;
    private String sellStatus;

    public MenuDTO() {
    }

    public MenuDTO(int code, String name, int price, int cCode, String sellStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.cCode = cCode;
        this.sellStatus = sellStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getcCode() {
        return cCode;
    }

    public void setcCode(int cCode) {
        this.cCode = cCode;
    }

    public String getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cCode=" + cCode +
                ", sellStatus='" + sellStatus + '\'' +
                '}';
    }
}
