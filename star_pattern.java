// *
// **
// ***
// ****
// public class star_pattern {
//     public static void main(String[] args){
//         for(int i=1; i<=4; i++){
//             for (int j =1; j<=i ; j++){
//                 System.out.printf("*");
//             }
//             System.out.printf("\n");

//         }
        
//****
//***
//**
//*
// public class star_pattern {
//     public static void main(String[] args){
//         for(int i=1; i<=4; i++){
//             for (int j =4; j>=i ; j--){
//                 System.out.printf("*");
//             }
//             System.out.printf("\n");
//         }
//         }
//     }

//    *
//   * * 
//  * * *
// * * * *

// public class star_pattern {
//     public static void main(String[] args){
//         for(int i=1; i<=4; i++){
//             for (int j =4; j>=i ; j--){
//             System.out.print(" ");
//             }
//             for(int r=1; r<=i; r++){
//             System.out.print("* ");

//             }
//             System.out.printf("\n");
//         }
//         }
//     }


// * * * *
//  * * *
//   * *
//    *

 public class star_pattern {
    public static void main(String[] args){
        for(int i=4; i>=1; i--){
            for (int j =4; j>=i ; j--){
            System.out.print(" ");
            }
            for(int r=1; r<=i; r++){
            System.out.print("* ");

            }
            System.out.printf("\n");
        }
        }
    }