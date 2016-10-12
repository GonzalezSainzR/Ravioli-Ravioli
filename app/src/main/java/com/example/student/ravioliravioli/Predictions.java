package com.example.student.ravioliravioli;

import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "Cookies - \n" +
                        "1 cup butter, softened\n" +
                        " 1 cup white sugar\n" +
                        " 1 cup packed brown sugar\n" +
                        " 2 eggs\n" +
                        " 2 teaspoons vanilla extract\n" +
                        " 3 cups all-purpose flour\n" +
                        " 1 teaspoon baking soda\n" +
                        " 2 teaspoons hot water\n" +
                        " 1/2 teaspoon salt\n" +
                        " 2 cups semisweet chocolate chips\n" +
                        " 1 cup chopped walnuts\n" +
                        "Preheat oven to 350 degrees F (175 degrees C).\n" +
                        "Cream together the butter, white sugar, and brown sugar until smooth. Beat in the eggs one at a time, then stir in the vanilla. Dissolve baking soda in hot water. Add to batter along with salt. Stir in flour, chocolate chips, and nuts. Drop by large spoonfuls onto ungreased pans.\n" +
                        "Bake for about 10 minutes in the preheated oven, or until edges are nicely browned.",
                "Ravioli",
                "Pizza"
        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        rnd = random.nextInt(answers.length);
        return answers[rnd];
    }
}
