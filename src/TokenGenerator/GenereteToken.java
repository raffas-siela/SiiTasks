package TokenGenerator;

import java.security.SecureRandom;
import java.util.Random;

class Program {
    public static void main (String args[]) {
        Random generator = new Random();
        for(int i = 0; i < 100; i++) {
            System.out.println(generator.nextInt());
        }
        String source = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        SecureRandom random = new SecureRandom();
        byte[] values = new byte[20];
        random.nextBytes(values);

    }
}