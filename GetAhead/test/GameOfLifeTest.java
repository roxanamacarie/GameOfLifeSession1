/**
 * Created by macarie on 08/08/2018.
 */

import com.company.GameOfLife;
import com.company.Main;
import org.junit.Assert;
import org.junit.Test;
public class GameOfLifeTest {

    @Test
    public void firstTest() {

        int[][] startState = {{1, 0 , 0, 0, 1},
                {0, 0 , 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0 , 0, 0, 0},
                {1, 0 , 0, 0, 1}};


        int[][] result = {{1, 0 , 0, 0, 1},
                {0, 0 , 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0 , 0, 0, 0},
                {1, 0 , 0, 0, 1}};

        int width = 5;
        int height = 5;

        GameOfLife gol = new GameOfLife();

        int neigh = gol.getNeighbours(1, 1);

        Assert.assertEquals(neigh, 2);
    }
}
