package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizBuilder {

    public Quiz build(String quizName) {

        Quiz quiz = new Quiz(quizName);

        File quizFile = new File(quizName);

        try (Scanner fileReader = new Scanner(quizFile)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine(); // What color is the sky?|yellow|blue*|green|red

                String[] lineParts = line.split("\\|"); // ["What color is the sky?", "yellow", "blue*", "green", "red" ]

                String questionText = lineParts[0];

                String[] answerOptions = new String[lineParts.length - 1];

                for (int i = 1; i < lineParts.length; i++) {

                    String linePart = lineParts[i];

                    if (linePart.endsWith("*")) {
                        answerOptions[i - 1] = linePart.substring(0, linePart.length() - 1);
                        correctAnswerIndex = i - 1;

                    } else {
                        answerOptions[i - 1] = lineParts[i];
                    }

                }

            Question question = new Question(questionText, answerOptions, correctAnswerIndex);
        }

        }catch (FileNotFoundException e) {
            // TODO: come back to this

        }
            return quiz;
        }

        private Question parseLine(String line);

    }

