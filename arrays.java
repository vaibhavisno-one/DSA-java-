import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // int a = 10;

        // String name ="vaibhav";

        // System.out.println(name + a);

        // //syntax 
        // // datatype [] name = new datatype[size];
        // int [] marks = new int[5];

        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;

        // //or
        // int [] roll = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(roll[0]);

//array of objects  

        Scanner in = new Scanner(System.in);
        String[] str =new String[4];
        
        for (int i =0; i<str.length; i++){
            str[i] = in.next();

        }

        System.out.println(Arrays.toString(str));

        
    }
}
