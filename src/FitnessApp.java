import java.util.Scanner;

public class FitnessApp {

    public static void main(String[] args) {

        final int DAILY_STEP_GOAL = 10000;
        final double CALORIES_PER_STEP = 0.04;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("How many steps did you take today?");
        int stepsTaken = Integer.parseInt(scanner.nextLine());

        double caloriesBurned = stepsTaken * CALORIES_PER_STEP;

        if (stepsTaken >= DAILY_STEP_GOAL) {
            System.out.println("Great job, " + name + "! You reached your goal with " + stepsTaken + " steps.");
        } else {
            System.out.println("Keep going, " + name + ". You need " + (DAILY_STEP_GOAL - stepsTaken) + " more steps to reach your goal.");
        }

        System.out.println("You burned " + caloriesBurned + " calories today.");
    }
}
