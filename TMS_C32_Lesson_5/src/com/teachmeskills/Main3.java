package com.teachmeskills;

/*3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
всех элементов массива.*/


public class Main3 {
    public static void main(String[] args) {

        int [][] array = {{18,28,18},{28,45,90},{45,3,14}};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
