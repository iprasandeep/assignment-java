import java.util.*;
public class PerfectNumber {
    
    public static boolean isPerfect(int n) {
        
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (sum == n);
    }
    public static void main(String[] args) {
        // taking user input 
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
