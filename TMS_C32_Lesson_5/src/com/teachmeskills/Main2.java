package com.teachmeskills;

/*2*. Умножение двух матриц
Создайте два массива целых чисел размером (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3 1 1 1 0 0 0*/


public class Main2 {
    public static void main(String[] args) {

        int[][] array1 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] array2 = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] result = new int[array1.length][array2[0].length];

        // Умножение матриц
        for (int x = 0; x < array1.length; x++) {
            for (int y = 0; y < array2[0].length; y++) {
                for (int z = 0; z < array1[0].length; z++) {
                    result[x][y] += array1[x][z] * array2[z][y];
                }
            }
        }


        System.out.println("Результат:");
        for (int[] i : result) {
            for (int arr : i) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }
}
