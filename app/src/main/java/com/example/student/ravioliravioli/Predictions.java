package com.example.student.ravioliravioli;

import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;
    private Random random = new Random();
    private int rnd;

    private Predictions() {
        answers = new String[] {
                "Cookies",
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
