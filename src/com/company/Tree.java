package com.company;

import java.util.List;

import java.util.ArrayList;

public class Tree {
    private List<Tree> list = new ArrayList<Tree>();

    private Board board;

    public Tree(Board board){
        this.board = board;
    }

    public void changePosition(int row, int column){
        board.setPosition(row,column);
    }

    public void copy(Board board){
        this.board = board;


    }

    public Board getBoard(){
        return board;
    }

    public List<Tree> getList(){
        return list;
    }


}
