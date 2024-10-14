package com.teachmeskills;

/*1*. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8. С помощью циклов задать
элементам циклам значения B(Black) или W(White). Результат работы
программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W*/


public class Main1 {
    public static void main(String[] args) {

        String[][] board = new String[8][8];

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if ((x + y) % 2 == 0) {
                    board[x][y] = "W";
                } else {
                    board[x][y] = "B";
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
