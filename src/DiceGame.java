import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) throws Exception {

        System.out.println("-----------******GAME BEGINS**********--------------");
        System.out.println("Creating a default d6....");

        Scanner sc = new Scanner(System.in);

       
        Die d6 = new Die();
        System.out.println("The current side up for d6 is "+d6.SideUp);
        System.out.println("-----------****************--------------");
        System.out.println("-----------****************--------------");



        // System.out.println("Please enter the number of sides of a die. ");
        // int sides = sc.nextInt();

        System.out.println("Creating a d10 with single arg constructor....");


        Die d10 = new Die(10);
        //System.out.println("Single argument constructor - Type: "+die2.Type);

        System.out.println("The current side up for d10 is "+d10.SideUp);
        System.out.println("-----------****************--------------");
        System.out.println("-----------****************--------------");



        System.out.println("Creating a KATANA having 8 sides using two arg constructor....");


        Die KATANA = new Die(8,"KATANA");
        System.out.println("The current side up for KATANA is: "+KATANA.SideUp);
        System.out.println("-----------****************--------------");
        System.out.println("-----------****************--------------");



       System.out.println("Setting d6 to show 6....");
       //Die d6 = new Die(6);
       boolean matched = d6.RollItTillGet(6, 6);
       if(matched){
       System.out.println("The side up is now 6. Finally.");
       System.out.println("It took "+d6.rollCount+" rolls");}     
       
       System.out.println("-----------****************--------------");
        System.out.println("-----------****************--------------");



       System.out.println("------BONUS------");   

       System.out.println("Creating 5 d6...");   

       //CREATE 5 d6 and roll till I get 5 of a kind
       Die d61 = new Die();
       Die d62 = new Die();
       Die d63 = new Die();
       Die d64 = new Die();
       Die d65 = new Die();

    //KEEP ROLLING TILL ALL SAME
    int d6Count=0;
       while(true)
       {
      int sideup61 = d61.RollTheDie(6);
      int sideup62 = d62.RollTheDie(6);
      int sideup63 = d63.RollTheDie(6);
      int sideup64 = d64.RollTheDie(6);
      int sideup65 = d65.RollTheDie(6);
      d6Count = d6Count+1;
      if((sideup61 == sideup62)&&(sideup62==sideup63)&&(sideup63==sideup64)&&(sideup64==sideup65))
      {
        
                    System.out.println("YAHTZEE! It took "+d6Count+" rolls.");
                    System.out.println("------BONUS------");   
                    System.out.println("-----------******END**********--------------");
                    


                    break;
       
      
      }
    }
     
    }
}
