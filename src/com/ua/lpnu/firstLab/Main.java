package com.ua.lpnu.firstLab;

public class Main {
    public static void main (String[] args) {
        Shoes firstPair = new Shoes();
        Shoes secondPair = new Shoes("Adidas Inc.", 45.99, 40);
        Shoes thirdPair = new Shoes("Puma Inc.", 50.99, 43, "grey", "suede", "skateboarding");

        System.out.println(firstPair);
        System.out.println(secondPair);
        System.out.println(thirdPair);

    }

}