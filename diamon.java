// Program to print hollow diamond in JAVA
package diamond;
import java.util.*;
public class diamon {
    public static void printHollowDiamond(int n){
        for(int i=1;i<n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<=2*i-3;j++){
                System.out.print("*");
            }
            if (i!=1){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=1;j<=2*i-3;j++){
                System.out.print("*");
            }
            if (i!=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows;");
        int n=sc.nextInt();
        printHollowDiamond(n);
    }
}
