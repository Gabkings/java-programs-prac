package foodrating;

import java.util.Random;

public class FoodRating {

    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
            2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for (int i = 0; i < responses.length; i++) {
            try {
                ++frequency[responses[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("responses[ % d] =  % d\n\n", i, responses[i]);
            }
        }
        System.out.printf("%s%10s\n", "Rating", "Frequency");
        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
    }

}
