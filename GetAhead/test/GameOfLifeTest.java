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

    
}
