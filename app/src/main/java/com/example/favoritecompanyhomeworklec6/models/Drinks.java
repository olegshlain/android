package com.example.favoritecompanyhomeworklec6.models;

public class Drinks {

    String coke;
    String pepsi;
    String schweppes;
    String drPepper;

    public Drinks(String coke, String pepsi, String schweppes, String drPepper) {
        this.coke = coke;
        this.pepsi = pepsi;
        this.schweppes = schweppes;
        this.drPepper = drPepper;
    }


    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }

    public String getPepsi() {
        return pepsi;
    }

    public void setPepsi(String pepsi) {
        this.pepsi = pepsi;
    }

    public String getSchweppes() {
        return schweppes;
    }

    public void setSchweppes(String schweppes) {
        this.schweppes = schweppes;
    }

    public String getDrPepper() {
        return drPepper;
    }

    public void setDrPepper(String drPepper) {
        this.drPepper = drPepper;
    }
}
