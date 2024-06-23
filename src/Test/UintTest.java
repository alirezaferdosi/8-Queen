package Test;

import com.company.Board;
import com.company.Graph;
import org.junit.Test;

import java.util.Scanner;

public class UintTest {
    @Test
    public void Test(){
        Graph graph = new Graph();
        Board board = new Board(10);
        graph.randomGraph(board);
        graph.printBoard(board);
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
//        System.out.println(graph.checkDiameter(board,n,m));
    }
}
