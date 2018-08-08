/**
 * Created by macarie on 04/08/2018.
 */
import com.company.Main;
import org.junit.Assert;
import org.junit.Test;
public class MyTest {
    @Test
    public void firstTest() {

        Main m = new Main();

        int result = m.add(5, 3);
        Assert.assertEquals(8, result);
    }
}
