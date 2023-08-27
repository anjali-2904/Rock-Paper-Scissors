import java.util.Scanner;
import java.lang.Math;
public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t***************************************"); 
        System.out.println("\t\t\tRock Paper Scissor Game");  
        System.out.println("\t\t***************************************\n\n");

        System.out.println("***********************************"); 
        System.out.println("\t0 means Rock");
        System.out.println("\t1 means Paper");
        System.out.println("\t2 means Scissor");
        System.out.println("***********************************\n\n"); 

        System.out.println("\t\t***************************************"); 
        System.out.println("\t\t\tComputer vs Player(You)");  
        System.out.println("\t\t***************************************\n\n");

        int max=2;
        int min=1;
        int range=max-min+1;
        int numOfTime;
        int userChoice,randomNum,compScore=0,userScore=0;

        String ans;
        String userType="",compType="";
        do{
            System.out.print("How many time you want to play this game: ");
            numOfTime=sc.nextInt();
            
            while(numOfTime>0){
                
                System.out.println("\nchoose your type.GOOD Luck!!");

                System.out.print("Enter your choice: ");
                userChoice=sc.nextInt();
                switch(userChoice){
                    case 0:userType="rock";break;
                    case 1:userType="paper";break;
                    case 2:userType="scissor";break;
                    default:System.out.println("Choice you enter is invalid");  
                }

                randomNum=(int)(Math.random()*range)+min;
                switch(randomNum){
                    case 0:compType="rock";break;
                    case 1:compType="paper";break;
                    case 2:compType="scissor";break;
                }
                System.out.print("Computer choice is: "+randomNum+"\n");
                                
                if(userType==compType)
                System.out.println("There is a tie in this round"+numOfTime);
                else if(userType=="rock"&&compType=="paper" ||userType=="scissor"&&compType=="rock" ||userType=="paper"&&compType=="scissor" ){
                    System.out.println("Computer wins this round"+numOfTime);
                    compScore++;
                }
                else {
                    System.out.println("Player wins this round"+numOfTime);
                    userScore++;
                }
    
                numOfTime--;
            }
            System.out.println("\n\n***********************************"); 
            System.out.printf("Final result of all round");
            System.out.println("\n***********************************"); 
    
            if(compScore==userScore)
            System.out.println("Tie!!");
            else if(compScore>userScore)
            System.out.println("Computer wins this game :)");
            else
            System.out.println("Player wins this game :)");

            System.out.print("Do you want to play again(y/n): ");
            ans=sc.next();			
            System.out.println("\n\n");				

        }while(ans.equals("y")||ans.equals("Y"));
        
        
    }
    
}
