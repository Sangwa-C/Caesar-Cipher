import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


    public class CaesarCipherTest {

        @Test
        public void runCaesarCliper_countUpToOne_ArrayList(){
            CaesarCipher testCaesarCliper = new CaesarCipher();
            List<Object> answer = new ArrayList<Object>();
            answer.add(1);
//            assertEquals(answer, testCaesarCliper.runCaesarCliper(1));

        }
    }