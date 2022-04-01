import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class vowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, vowels.countVowels("abracadabra"));
    }

}



