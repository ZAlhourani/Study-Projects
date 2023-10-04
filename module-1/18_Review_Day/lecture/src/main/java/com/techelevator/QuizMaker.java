package com.techelevator;

import java.util.Scanner;

public class QuizMaker {

	// Use this scanner for all user input. Don't create additional Scanners with System.in
	private final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		QuizMaker quizMaker = new QuizMaker();
		quizMaker.run();
	}

	public void run() {
		/* Your code goes here */

		System.out.println("Enter the name of the quiz.");
		String quizName = userInput.nextLine();

		QuizBuilder quizBuilder = new QuizBuilder();
		Quiz quiz =  quizBuilder.build(quizName);

		for (Question question : quiz.getQuestions()) {

			System.out.println(question.getQuestionText());

			int questionIndex = 1;
			for (String answerOption : question.getAnswerOptions()) {
				System.out.println(questionIndex + ". " + answerOption);
				questionIndex++;
			}

			System.out.println(question);

			System.out.println("Enter your answer: ");
			int userAnswer = Integer.parseInt(userInput.nextLine());

			if (question.isCorrectAnswer(userAnswer)) {
				System.out.println("RIGHT");
			}else {
				System.out.println("Sorry, Incorrect");
			}
		}

	}

}
