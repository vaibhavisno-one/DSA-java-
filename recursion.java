import java.util.*;
public class recursion {
    static void func(int i, int N) {//print the name N number of times
        if (i > N) {
            return;
        }
        System.out.print("vaibhav ");
        func(i+1,N);
    }

    // static void func2(int i,int n){//print 1 to N with recursion
    //     if(i>n){
    //         return;
    //     }
    //     System.out.println(i);
    //     func2(i+1,n);
    // }
// using backtracking
    static void func2(int i,int n){
        if(i<1){
            return;
        }
        func2(i-1,n);
        System.out.print(i+" ");
    }

    static void func3(int n){//print N to 1 with recursion
        if(n==0) return;
        System.out.println(n);
        func3(n-1);



    }

    

//drivers code.......................................................
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        // func(1,N);
        // func2(n,n);
        // func3(n);
        
    }
}
