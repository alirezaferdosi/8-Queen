package com.company;

import java.util.Random;

public class Graph {
    public Board randomGraph(Board board){
        Random random = new Random();
        int po=0;
        for(int i = 0; i<board.getSize() ; i++){
            po = random.nextInt(board.getSize()-1);
            board.setPosition(i,po);
        }
        return board;
    }

    public Boolean checkRow(Board board){
        for(int i=0; i<board.getSize() ; i++){
            if(numberOfQueenInRow(board,i) > 1){
                return false;
            }
        }
        return true;
    }

    public Boolean checkColumn(Board board){
        for(int i=0; i<board.getSize() ; i++){
            if(numberOfQueenInColumn(board,i) > 1){
                return false;
            }
        }
        return true;
    }

    public Boolean checkDiameter(Board board,int i, int j){
        System.out.println(numberOfQueenInDiameter(board,i,j));
//        for(int i=0; i< board.getSize();i++){
//            for(int j=0; j<board.getSize();j++){
//                if(numberOfQueenInDiameter(board,i,j) > 0) return false;
//            }
//        }
        return true;
    }
    private int numberOfQueenInRow(Board board,int row){
        int number = 0;
        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[row][i] == 1) number++;
        }
        return number;
    }

    private int numberOfQueenInColumn(Board board,int column){
        int number = 0;
        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[i][column] == 1) number++;
        }
        return number;
    }

    private int numberOfQueenInDiameter(Board board,int row, int column){
        int i=row,j=column,number=0;
        while(i > 0 && j > 0){

            System.out.println("-");
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i--;
            j--;
        }

        i=row;
        j=column;
        while(i > 0 && j < board.getSize()){

            System.out.println("--");
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i--;
            j++;
        }
        i=row;
        j=column;
        while(i < board.getSize() && j > 0 ){

            System.out.println("---");
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i++;
            j--;
        }
        i=row;
        j=column;
        while(i < board.getSize() && j <  board.getSize()){

            System.out.println("----");
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i++;
            j++;
        }
        return number;

    }

    public void printBoard(Board board){
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++) {
                System.out.print(board.getBoard()[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
