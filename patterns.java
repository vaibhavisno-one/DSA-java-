// public class patterns {
//     public static void main (String[] args){
        
//         // for (int i = 0; i < 4; i++) {
//         //     for (int j=0; j<4; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }

//         // for (int i = 0; i < 5; i++) {
//         //     for (int j=0;j<i+1;j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
//         int  n = 5;
//         for (int i = 1; i <=n; i++) {
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// using functions
import java.util.*;
public class patterns {
    public static void main(String[] args) {
        // patt3(5);
        // patt4(5);
        // patt5(5);
        // patt6(5);
        // patt7(4);
        // isprime(7);
        GCD(6,4);
        // LCM(6,4);

    }

    static void patt3(int n) {
        for (int i =1 ; i <=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patt4(int n) {
        for (int i =1 ; i <=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    static void patt5(int n) {
        for (int i =1 ; i <=n; i++) {
            for (int j=0; j<n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void patt6(int n) {
        for (int i =1 ; i <=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    static void patt7(int n) {
        int m = 0;
        for (int i=1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

    }}

    static void isprime(int n){
        int store[] = new int[n];

        for (int i = 1; i <=n; i++) {
            if (n%i==0){
                store[i-1] = i;
            }


        }
        if (store.length==2){
            System.out.println("prime");//humesha galat dega ans kyunki array ka size n set kiya hua hai to  agar 7 enter karunga to fir 7 length ban jayga na ki 2
            // return true;
        }
        else {
            System.out.println("not prime");
        }
    }

    static int GCD(int n1,int n2){
        int gcd = 1;
        for (int i = 1; i <=Math.min(n1,n2); i++) {

            if (n1%i==0 && n2%i==0){
                gcd = i;
            }

        }
        return gcd;
    }


}
 