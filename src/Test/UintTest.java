package Test;

import com.company.Board;
import com.company.Graph;
import org.junit.Test;

public class UintTest {
    @Test
    public void Test(){
        Graph graph = new Graph();
        Board board = new Board(10);
        graph.randomGraph(board);
        graph.printBoard(board);
        System.out.println(graph.checkDiameter(board,5,7));
    }
}
