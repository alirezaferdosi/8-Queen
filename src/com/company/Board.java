package com.company;

public class Board {
    private int size;
    private int[][] board;

    public Board(int size){
        this.size = size;
        this.board = new int[size][size];
    }

    public void setPosition(int row, int column){
        board[row][column] = 1;
        for(int i = 0; i< size; i++){
            board[i][0] = 0;
        }
    }

    public int[][] getBoard(){
        return board;
    }

    public int getSize(){ return size;}
}
