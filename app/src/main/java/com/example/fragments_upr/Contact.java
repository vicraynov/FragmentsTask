package com.example.fragments_upr;

public class Contact {
    private String name;
    private String address;
    private String image;

    public Contact(String name, String address, String imageUrl) {
        this.name = name;
        this.address = address;
        this.image = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
