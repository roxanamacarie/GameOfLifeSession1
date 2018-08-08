/**
 * Created by macarie on 08/08/2018.
 */

import com.company.GameOfLife;
import com.company.Main;
import org.junit.Assert;
import org.junit.Test;
public class GameOfLifeTest {

    @Test
    public void neighbourTest() {

        boolean[][] startState = {{true, false , false, false, true},
                                {true, false , false, false, true},
                                {true, false , false, false, true},
                                {true, false , false, false, true},
                                {true, false , false, false, true}};


        int[][] result = {{1, 0 , 0, 0, 1},
                {0, 0 , 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0 , 0, 0, 0},
                {1, 0 , 0, 0, 1}};

        int width = 5;
        int height = 5;

        GameOfLife gol = new GameOfLife(startState, 5);

        int neigh = gol.getNeighbours(1, 2);

        Assert.assertEquals(0, neigh);
    }

    @Test
    public void inRangeTest() {

        boolean[][] startState = {{true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true}};


        GameOfLife gol = new GameOfLife(startState, 5);

        Assert.assertTrue(gol.inRange(1, 1));
        Assert.assertFalse(gol.inRange(-1, 7));
        Assert.assertFalse(gol.inRange(1, -1));
    }


    @Test
    public void isAliveTest() {

        boolean[][] startState = {{true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true}};


        GameOfLife gol = new GameOfLife(startState, 5);

        Assert.assertTrue(gol.isAlive(0, 0));
        Assert.assertFalse(gol.isAlive(1, 3));
        Assert.assertFalse(gol.isAlive(4, 3));
    }


    @Test
    public void systemTest1() {

        boolean[][] startState = {{true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true},
                {true, false , false, false, true}};


        boolean[][] expectedState = {{false, false , false, false, false},
                                    {true, true , false, true, true},
                                    {true, true , false, true, true},
                                    {true, true , false, true, true},
                                    {false, false , false, false, false}};


        GameOfLife gol = new GameOfLife(startState, 5);

        boolean[][] nextState = gol.getNextState();

        Assert.assertArrayEquals(expectedState, nextState);

    }

    @Test
    public void systemTest2() {
        int size = 5;
        //boolean[][] startState = new boolean[size][size];

        boolean[][] startState = {{true, false , false, false, true},
                {true, false , true, true, false},
                {true, true , false, false, false},
                {true, false , false, true, true},
                {true, true , false, false, true}};

        boolean[][] expectedState = {{false, true , false, true, false},
                {true, false , true, true, false},
                {true, false , false, false, true},
                {false, false , true, true, true},
                {true, true , false, true, true}};


        GameOfLife gol = new GameOfLife(startState, 5);

        boolean[][] nextState = gol.getNextState();

        Assert.assertArrayEquals(expectedState, nextState);

    }
}
