package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private String maker;
    private String avatar;


    public Product(){

    }

    public Product(int id, String name, double price, String description, String maker,String avatar) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.maker = maker;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
