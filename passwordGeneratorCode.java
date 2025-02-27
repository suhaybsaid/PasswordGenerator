import java.util.Random;
public class passwordGenerator {
        public static void main(String[] args) {
            Random rand = new Random();
            String cases = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_-+=~`,.:;/1234567890";
            int passLength = rand.nextInt(9) + 12; 
            String password = "";
    
            for (int i = 0; i < passLength; i++) {
                int index = rand.nextInt(cases.length());
                char passwordChar = cases.charAt(index);
                password += passwordChar; 
            }
    
            System.out.println("Here is your password: " + password);
        }
    }
