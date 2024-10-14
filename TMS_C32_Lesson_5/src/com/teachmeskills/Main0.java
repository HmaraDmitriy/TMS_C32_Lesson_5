package com.teachmeskills;

/*0. Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заданное число. Пусть число, на которое будет
увеличиваться каждый элемент, задается из консоли.*/


import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {

        int[][][] array = {
                {{6, 8}, {3, 8}},
                {{5, 1}, {1, 8}}
        };

        System.out.println("Введите число на которое будет увеличиваться каждый элемент");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int x = 0; x< array.length; x++){
            for (int y = 0; y< array.length; y++){
                for (int z = 0; z< array.length; z++){
                   array[x][y][z] +=number;
                }
            }
        }

        System.out.println("Массив после увеличения:");
        for (int x = 0; x< array.length; x++){
            for (int y = 0; y< array.length; y++){
                for (int z = 0; z< array.length; z++){
                    System.out.println(array[x][y][z]);
                }
            }
        }
    }
}
