package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Operation {
    private Queue<Tree> queue = new LinkedList<Tree>();
    private Graph graph;

    public Operation(){
        graph = new Graph();
    }

    public void navigation(){
        graph = new Graph();
    }

    public boolean solveNQueen(Tree tree){
        Tree temp;
        queue.add(tree);
        while(true){
            System.out.println("size "+queue.size());
            temp = queue.peek();
            if(fullSafe(queue.peek().getBoard())){
                graph.printBoard(temp.getBoard());
                break;
            }
            else{
                int j=0;
                for(int i=0;i<temp.getBoard().getSize();i++){
                    queue.peek().setList(
                                        new Tree(graph.changePosition(queue.peek().getBoard(),j++))
                                        );
                    graph.printBoard(queue.peek().getBoard());
                }
                for(Tree t: queue.peek().getList()){
                    queue.add(t);
                }
                queue.poll();
            }
        }
        return true;
    }

    public boolean fullSafe(Board board){
        for(int i=0;i<board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(
                        graph.numberOfQueenInRow(board,i,j) != 0 ||
                        graph.numberOfQueenInColumn(board,i,j) != 0 ||
                        graph.numberOfQueenInDiameter(board,i,j) != 0
                ){
                    return false;
                }
            }

        }
        return true;
    }

    public void start(){
        System.out.print("pleas enter the border sizs: ");
        Board board = new Board(new Scanner(System.in).nextInt());
        Graph graph = new Graph();
        board = graph.randomGraph(board);
        graph.printBoard(board);
        Tree tree = new Tree(board);
        solveNQueen(tree);
    }
}
