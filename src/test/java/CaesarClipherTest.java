import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


    public class CaesarClipherTest {

        @Test
        public void runCaesarCliper_countUpToOne_ArrayList(){
            CaesarClipher testCaesarCliper = new CaesarClipher();
            List<Object> answer = new ArrayList<Object>();
            answer.add(1);
            assertEquals(answer, testCaesarCliper.runCaesarCliper(1));

        }
    }