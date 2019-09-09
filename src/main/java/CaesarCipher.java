import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher {
    public static String kiki (String answer, int koti){

        char text;
        String Ceasartext = " ";

        for(int i = 0; i < answer.length();++i){
            text=answer.charAt(i);

            if(text >= 'a' && text <= 'z'){
                text = (char)(text + koti);

                if(text > 'z'){
                    text = (char)(text - 'z' + 'a' - 1);
                    }

                    Ceasartext  += text;
                }
                else if(text >= 'A' && text <= 'Z'){
                    text = (char)(text + koti);

                    if(text > 'Z'){
                        text = (char)(text - 'Z' + 'A' - 1);
                    }

                    Ceasartext += text;
                }
            }

//            System.out.println("Encrypted Message is " + Ceasartext);
        return Ceasartext;
        }
    }
