package com.bridgelabz.tictactoe;

import java.awt.*;
import java.util.Scanner;

public class TicTacToe {
    public static char playerChoice;
    public static char computerChoice;

    public static void main(String[] args) {

    }
    public static void board() {
        char[] emptyBoard = new char[10];
        for (int i = 0; i < 10 ; i++) {
            emptyBoard[i] = ' ' ;
        }
    }

    public static void chooseXorO() {
        System.out.println("Which one you want ?\n" +"'X' or 'O'");
        Scanner sc = new Scanner(System.in);
        char playerChoice = sc.next().charAt(0);
        if(playerChoice=='X') {
            computerChoice = 'O';
            System.out.println("Comp enters"+ computerChoice);
        }
        else {
            computerChoice = 'X';
            System.out.println("Comp enters"+ computerChoice);
        }
    }
}
