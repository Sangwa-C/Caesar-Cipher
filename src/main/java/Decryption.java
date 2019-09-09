import java.util.Scanner;

public class Decryption {
    public static String kuku (String answer, int koti) {

        char text;
        String Normaltext = " ";

        for(int i = 0; i < answer.length();++i){
            text=answer.charAt(i);

            if(text >= 'a' && text <= 'z'){
                text = (char)(text - koti);

                if(text < 'a'){
                    text = (char)(text + 'z' - 'a' + 1);
                }

                Normaltext  += text;
            }
            else if(text >= 'A' && text <= 'Z'){
                text = (char)(text - koti);

                if(text > 'Z'){
                    text = (char)(text - 'Z' + 'A' - 1);
                }

                Normaltext += text;
            }
        }

//        System.out.println("Decrepted Message is  = " + Normaltext);

        return Normaltext;
    }
}

