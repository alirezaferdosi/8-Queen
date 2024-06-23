package com.company;

public class Board {
    private int size;
    private int[][] board;

    public Board(int size){
        this.size = size;
        this.board = new int[size][size];
    }

    public void setPosition(int row, int column){
        for(int i=0;i<size;i++){
            board[row][i] = 0;
        }
        board[row][column] = 1;
    }

    public void copy(int[][] board){
        this.board = board;
    }

    public int[][] getBoard(){
        return board;
    }

    public int getSize(){ return size;}
}
