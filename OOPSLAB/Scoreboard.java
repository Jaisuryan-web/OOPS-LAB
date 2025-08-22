import java.util.Scanner;

public class Scoreboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = {150, 200, 175, 225, 190};
        
        System.out.print("Enter total score: ");
        int total = scanner.nextInt();
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        System.out.print("Enter top score index (0-4): ");
        int index = scanner.nextInt();
        
        try {
            double average = total / games;
            System.out.println("Average: " + average);
            System.out.println("Top score: " + scores[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of games cannot be zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid score index!");
        } finally {
            scanner.close();
        }
    }
}