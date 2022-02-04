import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void multiplicationTester() {
        assertEquals(10, SkillDemo.multiplication(5,3)); //10 != 15
    }
}
