// Adam Bruce 
// CMSC 150 Final Project W2023
// IHRTLUHC

import java.util.*;


public class BRUCEA_FINALPROJECT{

    public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    while(true){
    System.out.println("Welcome to Pokemon Lawrentian! Would you like an introduction to how battling works (Yes or No)? This is Recommended for first time players.");
    String tutorial = userInput.nextLine();
    String lowerTutorial = tutorial.toLowerCase();
    if(lowerTutorial.equals("yes")){
        String userTutorial = introTutorial.tutorial();
        System.out.println(userTutorial);
        System.out.println(" ");
    } else if (lowerTutorial.equals("no")) {
        introTutorial.introduction();
        break;
    } else {
        System.out.println("Please enter either yes or no next time to play the game.");
        break;
    }
    }
    }
}
