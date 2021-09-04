import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MontyHallTest {

    @Test
    public void testExperiment() {
        final MontyHall montyHall = new MontyHall();
        final String result = "You stand a better change by choosing to change your choice.";

        montyHall.runExperiment();
        final Score score = montyHall.getScore();

        assertTrue(score.getChange() > score.getStick());
        assertEquals(score.getResult(), result);
    }
}