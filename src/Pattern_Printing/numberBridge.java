package Pattern_Printing;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the any number : ");
        int n = sc.nextInt();

        for(int i=1; i<n*2; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i=1; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }

            for (int j=i-1; j>=1; j-- ){
                System.out.print("  ");
            }

            for (int j=n-i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}