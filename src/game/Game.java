/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import java.util.Scanner;

/**
 *
 * @author arkir7294
 */
public class Game {
    private static Scanner player = new Scanner (System.in);
    private static int rounds;
    private static int computerRandom;
    public static int [] playerChoice = new int [3];
    public static  int [] computerChoice = new int [3];
    private static String computerName;
    private static String computerName1;
    private static String computerName2;
    private static String playerName;
    private static String playerName1;
    private static String playerName2;
   
    public static void playerInput(){
//        int [] playerChoice = new int [3];
        System.out.println("Enter your choices \n1-Rock, 2-Paper, 3-Scissors");
        playerChoice [0] = player.nextInt();
        playerChoice [1] = player.nextInt();
        playerChoice [2] = player.nextInt();
        
        if (playerChoice [0] > 3 || playerChoice [1] > 3 || playerChoice [2] > 3){
            System.out.println("Invalid Choice. \n Restarting program...");
            
        }
    }
    
    public static void computerInput(){
//        int [] computerChoice = new int [3];
        
        for (int i = 0; i < 3; i++){
            computerRandom = (int) Math.round(Math.random()*2+1);
            computerChoice [i] = computerRandom;
        }
//        System.out.println(computerChoice [0]);
//        System.out.println(computerChoice [1]);
//        System.out.println(computerChoice [2]);
    }
    
    public static void compare(){
         //Computer choice name change
        if (computerChoice [0] == 1){
            computerName = "Rock";
        }else if (computerChoice [0] == 2){
            computerName = "Paper";
        }else if (computerChoice [0] == 3){
            computerName = "Scissors";
        }
        
        if (computerChoice [1] == 1){
            computerName1 = "Rock";
        }else if (computerChoice [1] == 2){
            computerName1 = "Paper";
        }else if (computerChoice [1] == 3){
            computerName1 = "Scissors";
        }
        
        if (computerChoice [2] == 1){
            computerName2 = "Rock";
        }else if (computerChoice [2] == 2){
            computerName2 = "Paper";
        }else if (computerChoice [2] == 3){
            computerName2 = "Scissors";
        }
        
        //Player choice name change 
        if (playerChoice [0] == 1){
            playerName = "Rock";
        }else if (playerChoice [0] == 2){
            playerName = "Paper";
        }else if (playerChoice [0] == 3){
            playerName = "Scissors";
        }
        
        if (playerChoice [1] == 1){
            playerName1 = "Rock";
        }else if (playerChoice [1] == 2){
            playerName1 = "Paper";
        }else if (playerChoice [1] == 3){
            playerName1 = "Scissors";
        }
        
        if (playerChoice [2] == 1){
            playerName2 = "Rock";
        }else if (playerChoice [2] == 2){
            playerName2 = "Paper";
        }else if (playerChoice [2] == 3){
            playerName2 = "Scissors";
        }
        //Round 1
        if (computerChoice [0] == playerChoice [0]){
            System.out.println("");
            System.out.println("You tied round 1");
            System.out.println("Computer: " + computerName + " Player: " + playerName);
        }else if ((computerChoice [0] == 1 && playerChoice [0] == 3) || (computerChoice [0] == 2 && playerChoice [0] == 1)|| (computerChoice [0] == 3 && playerChoice [0] == 2)){
            System.out.println("");
            System.out.println("You lose round 1");
            System.out.println("Computer: " + computerName + " Player: " + playerName);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("You win round 1");
            System.out.println("Computer: " + computerName + " Player: " + playerName);
            System.out.println("");
        }
        
        //Round 2
        if (computerChoice [1] == playerChoice [1]){
            System.out.println("");
            System.out.println("You tied round 2");
            System.out.println("Computer: " + computerName1 + " Player: " + playerName1);
        }else if ((computerChoice [1] == 1 && playerChoice [1] == 3) || (computerChoice [1] == 2 && playerChoice [1] == 1)|| (computerChoice [1] == 3 && playerChoice [1] == 2)){
            System.out.println("");
            System.out.println("You lose round 2");
            System.out.println("Computer: " + computerName1 + " Player: " + playerName1);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("You win round 2");
            System.out.println("Computer: " + computerName1 + " Player: " + playerName1);
            System.out.println("");
        }
         
        //Round 3
        if (computerChoice [2] == playerChoice [2]){
            System.out.println("");
            System.out.println("You tied round 3");
            System.out.println("Computer: " + computerName2 + " Player: " + playerName2);
        }else if ((computerChoice [2] == 1 && playerChoice [2] == 3) || (computerChoice [2] == 2 && playerChoice [2] == 1)|| (computerChoice [2] == 3 && playerChoice [2] == 2)){
            System.out.println("");
            System.out.println("You lose round 3");
            System.out.println("Computer: " + computerName2 + " Player: " + playerName2);
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("You win round 3");
            System.out.println("Computer: " + computerName2 + " Player: " + playerName2);
            System.out.println("");
        } 
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean choice = true;
        int exitChoice;
        while (choice == true){    
        System.out.println("---------Welcome to Rock, Paper, Scissors---------");
        System.out.println("This is best out of three.");
        System.out.println("Enter 1 to play");
        System.out.println("Enter 2 to exit");
        exitChoice = player.nextInt();
        switch(exitChoice){
            case 1:
                playerInput();
                computerInput();
                compare();
                break;
            case 2:
                System.out.println("Leaving program");
                choice = false;
                break;
        }
       }
    }
    
}
