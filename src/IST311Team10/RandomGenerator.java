/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311Team10;

import java.util.Random;

/**
 *
 * @author Harrison
 */
public class RandomGenerator {
    
    String generatePassword() {

        String randPassword = "";

        for (int i = 0; i < 6; i++) {
            int tempNum = generateNum();
            final int RADIX = 10;
            char tempChar = Character.forDigit(tempNum, RADIX);
            randPassword += tempChar;
        }

        return randPassword;
    }

    int generateNum() {

        Random rand = new Random();
        int n = rand.nextInt(9) + 1;

        return n;
    }
}
