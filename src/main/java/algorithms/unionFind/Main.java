package algorithms.unionFind;

import java.security.SecureRandom;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        int height = 100;
        int width = 100;
        int iterations = 0;
        PercolationBoard board = new PercolationBoard(height, width);

        while(!board.endsConnect()){
            iterations++;
            int randomHeight = generateRandomInteger(1, height);
            int randomWidth = generateRandomInteger(1, width);
            if(randomHeight > 0 && randomWidth > 0){
                board.set(randomWidth, randomHeight);
            } else {
                iterations--;
            }

        }
        System.out.println(iterations);
    }

    public static int generateRandomInteger(int min, int max) {
        SecureRandom rand = new SecureRandom();
        rand.setSeed(new Date().getTime());
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
