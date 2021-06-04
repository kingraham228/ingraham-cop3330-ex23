package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Car {
   Scanner input = new Scanner(System.in);

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
      String question = "Is the car silent when you turn the key?";
      String silent = getYesNo(question);
      if(silent.equalsIgnoreCase("Yes")|| silent.equalsIgnoreCase("Y")){
            question = "Are the battery terminals corroded?";
         String terminals = getYesNo(question);
            if(terminals.equalsIgnoreCase("Yes")|| terminals.equalsIgnoreCase("y")){
               System.out.println("Clean terminals and try starting again.");
            }else {
               System.out.println("Replace cables and try again.");
            }
      }else{
         question = "Does the car make a slicking noise?";
         String sNoise = getYesNo(question);
         if(sNoise.equalsIgnoreCase("Yes")|| sNoise.equalsIgnoreCase("y")){
            System.out.println("Replace the battery");
         }else{
            question = "Does the car crank up but fail to start?";
            String crankNoStart = getYesNo(question);
            if(crankNoStart.equalsIgnoreCase("Yes")|| crankNoStart.equalsIgnoreCase("y")){
               System.out.println("Check spark plug connections.");
            }else{
               question = "Does the engine start and then die?";
               String startDie = getYesNo(question);
               if(startDie.equalsIgnoreCase("Yes")|| startDie.equalsIgnoreCase("Y")){
                  question = "Does your car have fuel injection?";
                  String fuelInjection = getYesNo(question);
                  if(fuelInjection.equalsIgnoreCase("Yes")|| fuelInjection.equalsIgnoreCase("Y")){
                     System.out.println("Get it in for service.");
                  }else{
                     System.out.println("Check to ensure the choke is opening and closing.");
                  }
               }else{
                  System.out.println("This should not be possible.");
               }
               
            }
         }
      }
   }
}
