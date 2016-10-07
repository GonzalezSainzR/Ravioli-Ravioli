package com.example.student.ravioliravioli;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;

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
        return answers[0];
    }
}
