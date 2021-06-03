package oop.example;

import java.util.Scanner;

public class Car {
   Scanner input = new Scanner(System.in);
   private String question;
   private String silent;
   private String terminals;
   private String sNoise;
   private String crankNoStart;
   private String fuelInjection;

   public String getYesNo(String q){
      String answer;
      int loop = 0;

      do {
         System.out.println(q);
         answer = input.next();
         if(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No")
                 ||answer.equalsIgnoreCase("Y")||answer.equalsIgnoreCase("N")){
            loop = 1;
         }else {
            System.out.println("Response not recognized. Please type \"yes\" or \"no\".");
         }

      } while (loop<1);

    return answer;
   }

   public void diagnose(){
      question = "Is the car silent when you turn the key?";
      silent = getYesNo(question);
      System.out.println(silent);
   }
}
