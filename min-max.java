import java.util.*;

public class Main{
   
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
      
        for (int i = 0; i < a.length; i++) {
				if (b[i] < a[i]) {
					int temp = b[i];
					b[i] = a[i];
					a[i] = temp;
				}
			}
			int max1 = 0;
			int max2 = 0;
			for (int i = 0; i < a.length;i++) {
				max1 = Math.max(max1, a[i]);
				max2 = Math.max(max2, b[i]);
			}
			System.out.println(max1*max2);
    }
        
}