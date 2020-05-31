package models;

public class Chocolate {

    private int Id;
    private String name;
    private String brand;
    private int qty;
    private float price;

    public Chocolate (int expectedId, String expectedName, String expectedBrand, int expectedQty, float expectedPrice) {
    }

    public Chocolate(int i, String name, String brand, String sport, int size, int quantity, float price) {

    }

    public Chocolate() {

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



    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }



}



