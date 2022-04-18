package com.ua.lpnu.firstLab;

public record Shoes(String manufactureName, double priceInDollars, int shoeSize,
                    String shoeColor, String shoeMaterial, String purposeOfShoes) {

    private static String sexOfPerson = "male";
    public static String getSexOfPerson () {
        return sexOfPerson;
    }

    public Shoes() {
        this("Nike Inc.", 50, 45);
    }

    public Shoes(String manufacturerName, double priceInDollars, int shoeSize) {
        this(manufacturerName, priceInDollars, shoeSize, "black", "leather imitation", "sport");
    }

    @Override
    public String toString() {
        return String.format("Manufacturer name is - %s, the price is %.2f, the size in EU - %d, "
                        + "color is - %s, material - %s, the purpose of shoes is - %s",
                manufactureName, priceInDollars, shoeSize, shoeColor, shoeMaterial, purposeOfShoes);
    }
}
