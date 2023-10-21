package org.example;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

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

        //  3. Составьте программу, которая переводит переменную из int в long

        Integer valueInt = 984645;
        long valueLong = (long) valueInt;
        System.out.println("int valueInt = " + valueInt + " - long LongValue = " + valueLong);

        Integer valueInt1 = 984345;
        long valueOfLong1 = Long.valueOf(valueInt1);
        System.out.println("int valueInt1 = " + valueInt1 + " - long LongValueOf1 = " + valueOfLong1);

        Integer valueInt2 = 984554;
        long longValue2 = valueInt2.longValue();
        System.out.println("int valueInt2 = " + longValue2 + " - long LongValue2 = " + longValue2);

        // 4. Составьте программу, которая переводит переменную из long в int
        // Явное приведение типов
        long longNum = 1000;
        int intNum = (int) longNum;
        System.out.println(longNum);

        // с помощью метода toIntExtract()
        long longValue3 = 545454L;
        int intValue3 = Math.toIntExact(longValue3);
        System.out.println(intValue3);

        //  с использованием класса intValue()
        Long longValue4 = 100L;
        int intValue4 = longValue4.intValue();
        System.out.println(intValue4);

        // 5. Составьте программу, которая переводит переменную из float в double
        System.out.println("// Присвоение");
        float floatValue1 = 9.8F;
        double doubleValue1 = floatValue1;
        System.out.println("float - " + floatValue1);
        System.out.println("double - " + doubleValue1);

        System.out.println("// Использование метода valueOf()");
        float floatValue2 = 91.08F;
        double doubleValue2 = Double.valueOf(floatValue2);
        System.out.println("float - " + floatValue2);
        System.out.println("double - " + doubleValue2);

        System.out.println("// Использование метода Float.doubleValue()");
        Float floatValue3 = Float.valueOf(50.5F);
        double doubleValue3 = floatValue3.doubleValue();
        System.out.println("float - " + floatValue3);
        System.out.println("double - " + doubleValue3 + "\n");

        System.out.println("//6. Составьте программу, которая переводит переменную из double в float");
        System.out.println(" // Приведение");
        double doubleValue4 = 343.43;
        float floatValue4 = (float) doubleValue4;
        System.out.println("double - " + doubleValue4);
        System.out.println("float - " + floatValue4);

        System.out.println(" // Использование метода Double.floatValueOf()");
        Double doubleValue5 = Double.valueOf(99.9);
        float floatValue5 = doubleValue5.floatValue();
        System.out.println("double - " + doubleValue5);
        System.out.println("float - " + floatValue5 + "\n");

        System.out.println(" // 7. Придумайте способ переводить из int в boolean и наоборот.");
        System.out.println("Введите 0 или 1");
        Scanner scan = new Scanner(System.in);
        int intValue1 = scan.nextInt();
        boolean booleanValue1;
        if (intValue1 < 1) {
            booleanValue1 = false;
            System.out.println("Вы ввели 0 - получтие false - " + booleanValue1);
        } else {
            booleanValue1 = true;
            System.out.println("Вы ввели 1 - получите true - " + booleanValue1);
        }

            System.out.println("// 8. Придумайте способ переводить из String в boolean");
            String str1 = "true";
            String str2 = "false";
            String str3 = "yes";
            String str4 = "тру";
            String str5 = "да";
            String str6 = "TrUe";

            String []strArray = {str1, str2, str3, str4, str5, str6};
            for (int i = 0; i < strArray.length; i++){
                boolean b1 = Boolean.parseBoolean(strArray[i]);
                System.out.println(b1);}

            System.out.println("//  9. Переведите переменную из char в string");

        char c = 'G';
        String s = "" + c;//1 Конкатенация строк: char + пробел
        String s2 = Character.toString(c); //2 с помощью метода toString
        String s3 = String.valueOf(c); //3 с использованием метода valueOf()
        System.out.println("" + s);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(" //10. Переведите переменную из char в int и наоборот.");
        System.out.println(" // Неявное преобразование");
        char c1 ='A';
        char charC = '1';

        int i = c1;
        int x = String.valueOf(c).getBytes()[0];
        int intY = Character.digit(charC, 11);
        System.out.println(i + " // Неявное преобразование");
        System.out.println(x + " // c помощью getBytes, который возвращает массив");
        System.out.println(intY + "  // с использованием метода Character.digit()");

        System.out.println(" Преобразование int в char");
        int i2 = 65;
        int digit = 1;

        char c2 = (char)i2;
        char c3 = (char)(digit + '0');
        char c4 = (char) Character.digit(digit, 10);
        char c5 = Character.forDigit(digit, 10);
        char[] c6 = Character.toChars(digit);
        System.out.println(c2 + " //  Использование кастинга");
        System.out.println(c3);
        System.out.println(c4 + "// с использованием метода Character.digit()");
        System.out.println(c5 + "// с использованием метода Character.forDigit()");
        System.out.println(Arrays.toString(c6) + "// как массив из одного символа \n");

        System.out.println("// 11. Пусть int равен от 30 до 150. Переведите каждый int в char, и выведите \n" +
                "таблицу, где на каждой строчке есть int и соответствующий ему char");

        int count = 150 - 30;
        int array[] = new int[count];
        for (int i7 = 30; i7 < count; i7++)
        {array[i7] = i7 + 1;}

        for (int i7 = 30; i7 < array.length; i7++) {
            char c7[] = Character.toChars(i7);
            System.out.print("int " + array[i7] + " ---> char ");
            System.out.println(c7);
        }
    }

    }









