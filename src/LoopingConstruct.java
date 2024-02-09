import java.util.Scanner;
//Write a program that utilizes a while-loop to read a set of five floating-point values from user input.
// Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:
//
//Total
//Average
//Maximum
//Minimum
//Interest on total at 20%
public class LoopingConstruct {
    public static void main(String[]args){
        Scanner scn= new Scanner(System.in);
        float val; // asks the user input
        float tot  ;   //total of all 5 values
        float avg ;   //average- total / 5
        float interest; //interest on total 20% or total * .2
        float max ;   //maximum
        float min ;   //minimum
        int numInputs =1;
        float sumTot =0;
        //collect the 5 values from user //
        System.out.println("Please enter your five values: ");
        val =scn.nextFloat();
        max =val;
        min =val;
        while(true){
            sumTot +=val;
            val = scn.nextFloat();
            ++numInputs;
            if(val >max){
                max =val;
            } else if (val < min) {
                min =val;
            }
            if(numInputs ==5){    //if statement to limit the amount of inputs
               break;
            }
        }
        tot = sumTot + val;
        avg = tot / 5;
        interest = (float) (tot * .2);
        System.out.println("Your total is: " +tot);
        System.out.println("Your average value is: " + avg);
        System.out.println("Your maximum value is: "+max);
        System.out.println("Your minimum value is: "+min);
        System.out.println("Your interest is: " + interest);
    }
}


