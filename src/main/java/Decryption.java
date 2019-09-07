import java.util.Scanner;

public class Decryption {
    public static void main(String [] args) {

        String answer;
        int koti;
        char text;
        String Normaltext = " ";

        Scanner cece= new Scanner(System.in);

        System.out.println(" Write your message here ....");
        answer= cece.nextLine();

        System.out.println("Write a shift value...... ");
        koti = cece.nextInt();


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

        System.out.println("Decrepted Message is  = " + Normaltext);
    }
}

