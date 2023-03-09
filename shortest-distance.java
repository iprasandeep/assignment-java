import java.util.*;
import java.io.*;
import java.lang.*;

public class ShortestDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] start = new int[2];

        // Take the starting point as input from the user
        System.out.print("Enter the starting point coordinates (x, y): ");
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();

        // Take the string as input from the user
        System.out.print("Enter the string: ");
        String inputString = sc.next();

        // Calculate the endpoint's coordinates
        int[] end = calculateEndpoint(start, inputString);

        // Calculate the shortest distance between the starting point and the endpoint
        double distance = calculateDistance(start, end);

        // Print the shortest distance
        System.out.println("Shortest distance: "+ String.format("%.1f", distance));
        
    }

    // Method to calculate the endpoint's coordinates
    public static int[] calculateEndpoint(int[] start, String inputString) {
        int[] end = new int[2];
        end[0] = start[0];
        end[1] = start[1];

        for (int i = 0; i < inputString.length(); i++) {
            char direction = inputString.charAt(i);
            switch (direction) {
                case 'N':
                    end[1]++;
                    break;
                case 'S':
                    end[1]--;
                    break;
                case 'E':
                    end[0]++;
                    break;
                case 'W':
                    end[0]--;
                    break;
            }
        }

        return end;
    }

    // Method to calculate the shortest distance between two points
    public static double calculateDistance(int[] start, int[] end) {
        int X = end[0] - start[0];
        int Y = end[1] - start[1];
        return Math.sqrt(X*X + Y*Y);
    }
}
