package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Составьте программу, которая переводит переменную из byte в short

        byte bateValue11 = 11;
        Byte byteValue69 = 69;
        byte byteValue67 = 67;

        short shortValue = bateValue11;
        short shortValue69 = byteValue69.shortValue();
        Short shortValue67 = Short.valueOf(byteValue67);

        System.out.println("bateValue: " + bateValue11);
        System.out.println("shortValue: " + shortValue);
        System.out.println("shortValue69: " + shortValue69);
        System.out.println("shortValue67: " + shortValue67);
    }
}