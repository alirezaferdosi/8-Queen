package com.company;

import java.util.List;

import java.util.ArrayList;

public class Tree {
    private List<Tree> list = new ArrayList<Tree>();

    private Board board;

    public Tree(int n){
        this.board = new Board(n);
    }

    public void changePosition(int row, int column){
        board.setPosition(row,column);
    }


}
