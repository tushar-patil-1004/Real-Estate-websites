import java.util.Scanner;

public class loopsYog{
    public static void main(String[] args){
        // int jio=1;
        // int jioRecharge= 299;
        // Scanner sc = new Scanner(System.in);
        // int price = sc.nextInt();

        // while(jio <= 30){

        //     if(price==299){
        //         System.out.println("    You got a free subscription :-  Hotstar ");
        //     }else{
        //         System.out.println("You have no Subscription");
        //     }
        //     System.out.println("Service is active");
        //     jio++;
        //     break;
        // }

//       while(jio <= 30){
//           while(price<=299){
//             System.out.println("Youer deliy data is 2GB");
//             price++;
//           }
//           System.out.println("Service is Active");
//       }
    
//    Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Your Pin:-");
//          int pin = sc.nextInt();
//         System.out.println("Enter your Ammoount:-");
//        int ammount = sc.nextInt();
  
//      do { 
//         if(ammount<=100){
//          System.out.println(ammount);
        
//       }else{
//         System.out.println("Youer amount is Insuficient");
//       }
//      } while (ammount <= 100);

//     }
// }




Scanner sc = new Scanner(System.in);
int pin;
Double amount;
boolean inValid = false;
 for (int i=0;i<4;i++) {
  System.out.println("Your attemt is:"+i);
     do { 
    System.out.println("Enter your Pin:-");
    pin =sc.nextInt();
    System.out.println("Enter your Ammount:-");
    amount=sc.nextDouble();
   
    if(amount >0 && amount<=1000){
      System.out.println("Valid balance....transaction processing...");
      inValid=true;
    }
    else{
      System.out.println("Invalid amount....plz try again..");
    }
} while (!inValid);
if(!inValid){
  System.out.println("Your attem is ended...");
}

    }
 }

  }


