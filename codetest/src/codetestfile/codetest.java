package codetestfile;

import java.util.Random;

public class codetest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Random r = new Random();
            int data = r.nextInt(10);
            System.out.println(data);
        }
    }
}