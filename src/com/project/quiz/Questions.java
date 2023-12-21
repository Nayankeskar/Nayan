package com.project.quiz;

import java.util.Scanner;

public class Questions {
	
	public static void displayQuestionsAndTakeAnswers() {
        // Display questions and options
		Scanner scanner=new Scanner(System.in);
        System.out.println("Answer the following questions:");

        // You can fetch questions from the database or use a predefined set
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "Who is the author of 'Romeo and Juliet'?",
                "What is the largest mammal on Earth?"
        };

        String[][] options = {
                {"A) Paris", "B) Berlin", "C) Madrid", "D) Rome"},
                {"A) Earth", "B) Mars", "C) Venus", "D) Jupiter"},
                {"A) Charles Dickens", "B) William Shakespeare", "C) Jane Austen", "D) Mark Twain"},
                {"A) Elephant", "B) Blue Whale", "C) Giraffe", "D) Lion"}
        };

        // Array to store correct answers
        String[] correctAnswers = {"A", "B", "B", "B"};

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user's answer
            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();
        }
    }
}

