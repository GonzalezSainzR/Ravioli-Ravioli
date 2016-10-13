package com.example.student.ravioliravioli;

import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "Chocolate Chip Cookies - \n" +
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
                "Baked Stuffed Ravioli -\n" +
                        "1 (24 ounce) package frozen large round cheese-filled ravioli\n" +
                        "1 (26 ounce) can Hunt's® Garlic & Herb Pasta Sauce\n" +
                        "8 ounces frozen cooked meatballs, quartered \n" +
                        "Nonstick cooking spray \n" +
                        "1 cup shredded part-skim mozzarella cheese \n" +
                        "Chopped fresh basil (optional)\n" +
                        "Preheat oven to 350 degrees F. Cook ravioli according to package directions. Meanwhile, combine pasta sauce and meatball pieces in medium saucepan; cook over medium heat 8 minutes, or until heated through, stirring occasionally.\n" +
                        "Spray 13x9-inch baking dish with cooking spray. Drain ravioli; spread onto bottom of prepared dish. Top with the spaghetti sauce mixture; sprinkle with cheese. Cover with aluminum foil.\n" +
                        "Bake 20 minutes, or until ravioli mixture is heated through and cheese is melted. Garnish with basil, if desired.",
                "Pepperoni Pizza - \n" +
                        "1/2 (12 ounce) can CONTADINA® Tomato Paste\n" +
                        "1 teaspoon dried oregano, crushed \n" +
                        "1 teaspoon dried basil, crushed \n" +
                        "1/2 teaspoon garlic powder \n" +
                        "1/2 teaspoon onion powder \n" +
                        "1/2 teaspoon sugar \n" +
                        "1/2 teaspoon salt \n" +
                        "1/4 teaspoon black pepper \n" +
                        "3 1/4 cups all-purpose flour, or more as needed \n" +
                        "2 (.25 ounce) envelopes FLEISCHMANN'S® Pizza Crust Yeast or RapidRise® Yeast \n" +
                        "1 tablespoon sugar \n" +
                        "1 1/2 teaspoons salt \n" +
                        "1 1/3 cups very warm water (120 degrees F to 130 degrees F) \n" +
                        "1/3 cup oil \n" +
                        "Toppings: \n" +
                        " 1 (6 ounce) package HORMEL® Pepperoni \n" +
                        "1 cup shredded mozzarella cheese, or more to taste\n" +
                        "For sauce: Combine all sauce ingredients with 1/2 cup water in a medium bowl; set aside for flavors to develop while making crust. Freeze remaining paste .\n" +
                        "For crusts: Combine 2 cups of flour with the dry yeast, sugar and salt. Add the water and oil and mix until well blended (about 1 minute). Gradually add enough remaining flour slowly, until a soft, sticky dough ball is formed.\n" +
                        "Knead for about 4 minutes, on a floured surface, until dough is smooth and elastic. Add more flour, if needed. (If using RapidRise(R) Yeast, let dough rest, covered, for 10 minutes.)\n" +
                        "Divide dough in half. Pat each half (with floured hands) into a 12-inch greased pizza pan OR roll dough to fit pans.\n" +
                        "For pizzas: Preheat oven to 425 degrees F. Top crusts with sauce, pepperoni and cheese.\n" +
                        "Bake for 18 to 20 minutes until crusts are browned and cheese is bubbly. For best results, rotate pizza pans between top and bottom oven racks halfway through baking."
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
