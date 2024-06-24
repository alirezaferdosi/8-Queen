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

    public int numberOfQueenInRow(Board board,int row, int column){
        int number = 0;
        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[row][i] == 1 && i != column){
                number++;
            }
        }
        return number;
    }

    public int numberOfQueenInColumn(Board board, int row, int column){
        int number = 0;
        for(int i=0 ; i<board.getSize() ; i++){
            if(board.getBoard()[i][column] == 1 && i != row) number++;
        }
        return number;
    }

    public int numberOfQueenInDiameter(Board board,int row, int column){
        int i=row,j=column,number=0;
        while(i > 0 && j > 0){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i--;
            j--;
        }
        i=row;
        j=column;
        while(i > 0 && j < board.getSize()){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i--;
            j++;
        }
        i=row;
        j=column;
        while(i < board.getSize() && j > 0 ){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i++;
            j--;
        }
        i=row;
        j=column;
        while(i < board.getSize() && j <  board.getSize()){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) number++;
            i++;
            j++;
        }
        return number;
    }

    public void printBoard(Board board){
        System.out.print("   ");
        for(int i=0;i<board.getSize();i++){
            System.out.print(i + "  ");
        }
        System.out.println();
        for(int i=0;i<board.getSize();i++){
            System.out.print(i + "  ");
            for(int j=0;j<board.getSize();j++) {
                System.out.print(board.getBoard()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Board changePosition(Board board,int row){
        int c=0;
        for(int i=0; i<board.getSize();i++){
            if(board.getBoard()[row][i] == 1) c=i;
        }

        if(c == board.getSize()-1){
            board.setPosition(row,c--);
        }
        else if(c == 0){
            board.setPosition(row,c++);
        }
        else{
            board.setPosition(row,c++);
        }
        return board;
    }

    private boolean rightDiameter(Board board, int row, int column){
        int i=row;
        int j=column;
        while(i < board.getSize() && j <  board.getSize()){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) return false;
            i++;
            j++;
        }

        i=row;
        j=column;
        while(i > 0 && j < board.getSize()){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) return false;
            i--;
            j++;
        }

        return true;
    }

    private boolean leftDiameter(Board board, int row, int column){
        int i=row;
        int j=column,number=0;
        while(i > 0 && j > 0){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) return false;
            i--;
            j--;
        }
        i=row;
        j=column;
        while(i < board.getSize() && j > 0 ){
            if(board.getBoard()[i][j] == 1 && i != row && j != column) return false;
            i++;
            j--;
        }
        return true;
    }


}
