// Adam Bruce 
// CMSC 150 Final Project W2023
// IHRTLUHC

import java.util.*;


public class BRUCEA_FINALPROJECT{

    public static void gameOn(){
    Scanner userInput = new Scanner(System.in);
    while(true){
    System.out.println(" ");
    System.out.println("Welcome to Pokemon Lawrentian! Would you like an introduction to how battling works (Yes or No)? This is Recommended for first time players.");
    String tutorial = userInput.nextLine();
    String lowerTutorial = tutorial.toLowerCase();
    if(lowerTutorial.equals("yes")){
        String userTutorial = gameMaterials.tutorial();
        System.out.println(userTutorial);
        System.out.println(" ");
    } else if (lowerTutorial.equals("no")) {
        gameMaterials.introduction();
        String pokeChoiceOutcome = gameMaterials.chooseStarterPokemon();
        if(pokeChoiceOutcome.equals("squirtle") || pokeChoiceOutcome.equals("charmander") || pokeChoiceOutcome.equals("bulbasaur")){
            String darkOutcome = pokemonGyms.darkGym(pokeChoiceOutcome);
            if(darkOutcome.equals("Congrats, you won! You recieved the Darkness Badge from Cristian!")){
                System.out.println(darkOutcome);
                String stageTwoPokemon = pokeEvolutions.stageTwoEvolutions(pokeChoiceOutcome);
                String fireOutcome = pokemonGyms.fireGym(stageTwoPokemon);
                if(fireOutcome.equals("Okay, play again when you are ready to battle!")){
                    System.out.println(fireOutcome);
                    break;
                } else if(fireOutcome.equals("You were no match for gym leader JP. Better luck next time.")){
                    System.out.println(fireOutcome);
                    String playOrNot = gameMaterials.playAgain();
                    if(playOrNot.equals("yes")){
                        System.out.println("Okay, the game will reset now");
                    } else if(playOrNot.equals("no")){
                        System.out.println("Okay, better luck next time.");
                        break;
                    } else {
                        System.out.println(playOrNot);
                        break;
                    }
                } else if(fireOutcome.equals("Congrats, you won! You recieved the Fire Badge from JP!")){
                    System.out.println(fireOutcome);
                    String stageThreePokemon = pokeEvolutions.stageThreeEvolutions(stageTwoPokemon);
                    String grandMasterOutcome = pokemonGyms.grandMaster(stageThreePokemon);
                    if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!")){
                        System.out.println(darkOutcome);
                        break;
                    } else if(grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                        System.out.println(grandMasterOutcome);
                        String playOrNot = gameMaterials.playAgain();
                        if(playOrNot.equals("yes")){
                            System.out.println("Okay, the game will reset now");
                        } else if(playOrNot.equals("no")){
                            System.out.println("Okay, better luck next time.");
                            break;
                        } else {
                            System.out.println(playOrNot);
                            break;
                        }
                    } else if(grandMasterOutcome.equals("Congrats, you won! You were crowned Grand Master by Professor Ackles!")){
                        System.out.println(grandMasterOutcome);
                        System.out.println("DONE");

                    } else {
                        System.out.println(grandMasterOutcome + " The game will reset now.");
                    }
                    break;
                } else {
                    System.out.println(fireOutcome + " The game will reset now.");
                }
            } else if(darkOutcome.equals("Okay, play again when you are ready to battle!")){
                System.out.println(darkOutcome);
                break;
            } else if(darkOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                System.out.println(darkOutcome);
                String playOrNot = gameMaterials.playAgain();
                if(playOrNot.equals("yes")){
                    System.out.println("Okay, the game will reset now");
                } else if(playOrNot.equals("no")){
                    System.out.println("Okay, better luck next time.");
                    break;
                } else {
                    System.out.println(playOrNot);
                    break;
                }
            } else{
                System.out.println(darkOutcome + " The game will reset now.");
            }
        } else {
            System.out.println(pokeChoiceOutcome);
        }
    } else {
        System.out.println("Please enter either yes or no next time to play the game.");
        break;
    }
    }
    }

    public static void main(String [] args){
    gameOn();
    }
}
