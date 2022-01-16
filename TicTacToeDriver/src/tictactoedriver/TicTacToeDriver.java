/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoedriver;

import java.util.Scanner;

public class TicTacToeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToeBoard board = new TicTacToeBoard();
        String ans = "yes";
        while(!ans.equals("no")){
            board.printBoard();
            int moves = 0;
            while(true){
                while(true){
                    System.out.print("Player 1: Enter your move: ");
                    int number = sc.nextInt();
                    if(board.isCellAvailable(number)){
                        board.place(number, 'X');
                        board.printBoard();
                        moves += 1;
                        break;
                    }else{
                        System.out.println("Cell not availbale. ");
                    }
                }
                if(board.isWinner()){
                    System.out.println("Player 1 Wins.");
                    break;
                }
                if(moves == 9){
                    System.out.println("Draw. Game ended.");
                    break;
                }
                while(true){
                    System.out.print("Player 2: Enter your move: ");
                    int number = sc.nextInt();
                    if(board.isCellAvailable(number)){
                        board.place(number, 'Y');
                        board.printBoard();
                        moves += 1;
                        break;
                    }else{
                        System.out.println("Cell not availbale. ");
                    }
                }
                if(board.isWinner()){
                    System.out.println("Player 2 Wins.");
                    break;
                }
                if(moves == 9){
                    System.out.println("Draw. Game ended.");
                    break;
                }
            }
            sc = new Scanner(System.in);
            System.out.print("Do you want to play again:(no for stop/ yes for restart):  ");
            ans = sc.nextLine();
            board = new TicTacToeBoard();
            System.out.println("");
        }
    }
}
    

