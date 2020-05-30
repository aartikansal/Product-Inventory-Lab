package models;

public class Sneaker {

    private int Id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int qty;
    private float price;

    public Sneaker(int expectedId, String expectedName, String expectedBrand, String expectedSport, int expectedQty, float expectedPrice) {
    }

    public Sneaker() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }



    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getSport() {
        return sport;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }
}



