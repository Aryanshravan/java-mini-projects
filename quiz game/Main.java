



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] questions = {"Which is the largest planet in our solar system?",
                                                                       "Who wrote the national anthem of India?",
                                                                       "What is the capital of Japan?"};


        String[][] options = {{"1.Earth","2.Mars","3.Jupiter","4.Saturn"},
                {"1.Bankim Chandra Chatterjee","2.Rabindranath Tagore","3.Mahatma Gandhi","4.Jawaharlal Nehru"},
                {"1.Seoul","2.Beijing","3.Tokyo","4.Bangkok"}};

        int[] answers = {3,2,3};
        int score = 0;
        int guess;


        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************");
        System.out.println("welcome to the quiz game");
        System.out.println("*****************");

        for(int i = 0; i < questions.length;i++ ){
            System.out.println(questions[i]);

            for(String option :options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("*****************");
                System.out.println("Correct");
                System.out.println("*****************");
                score++;
            }
            else{
                System.out.println("*****************");
                System.out.println("Wrong");
                System.out.println("*****************");
            }
        }
        System.out.println("your score is: "+ score);

    }















}