package RandomGame;

import java.util.*;

public class BallsNumbers {
    public static void main(String[] args) {
        int[] values = new int[100];
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (Math.random() * 100); // Generate random numbers
        }
        Collections.shuffle(Arrays.asList(values));

        for (int i = 0; i < 10; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
