import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class vowelsTest {
    @Test
    public void countOnlyOneVowel() {
        assertEquals("Nope!", 5, vowels.countVowels("abracadabra"));
    }
    @Test
    public void countAllVowels() {
        assertEquals("Nope!", 5, vowels.countVowels("murcielago"));
    }
    @Test
    public void dontCountVowels() {
        assertEquals("Nope!", 0, vowels.countVowels("try"));
    }

}



