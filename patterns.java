public class patterns {
    public static void main (String[] args){
        
        // for (int i = 0; i < 4; i++) {
        //     for (int j=0; j<4; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j=0;j<i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int  n = 5;
        for (int i = 1; i <=5; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
 