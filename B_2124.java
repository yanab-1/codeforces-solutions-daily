
import java.util.Scanner;

public class B_2124 {
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Math.min((long)a[0]+a[1], (long)a[0]*2));
    }
}
