// public class Function {
//      public static void main(String[] args) {
//         int ans = sum2 ();
//         System.out.println(ans);
//      }

//      static int sum2() {
//         int a = 10;
//         int b = 20;
//         return a + b;
//      }
// }

// ................................................................returning a string
// public class Function{

//    public static void main(String[] args) {
//       String ans = alpha ();

//       System.out.println(ans);
   
//    }

//    static String alpha() {
//       return "hello";
//    }

// }


//..................................................................arguments


//pass the value of nummbers when u are clling the method in main()


public class Function{

//    public static void main(String[] args) {
//       // System.out.println(sum(10, 20));

//       System.out.println(swap(4, 5));
      
//    } 


//    // static int sum(int a, int b) {
//    //    return a + b;
      
//    // }

//       static int swap(int a, int b) {
//          int temp = a;
//          a = b;   
//          b = temp;
         
         

//       }
// }


// to swap numbers using function we need to do with arrayas or objects because in java awap do not have any return type

public static void main(String[] args) {
   int[] nums = {4, 5};
   swap(nums);
   System.out.println(nums[0]);
   System.out.println(nums[1]);
}
static void swap(int[] nums){
   int temp = nums[0];
   nums[0] = nums[1];
   nums[1] = temp;
}

}
