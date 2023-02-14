// Adam Bruce 
// CMSC 150 Final Project W2023
// IHRTLUHC
// This is the original version before building classes.

import java.util.*;


public class GameCopy{

    public static String battleTutorial(){
        System.out.println("There are 4 types of moves, basic (B), medium (M), advanced (A), and healing (H).");
        System.out.println("For example, you might see: WaterGun (A) as a move.");
        System.out.println("The more advanced a move is, the more damage it CAN deliver");
        System.out.println("However, they can sometimes hit with lower damage, compared to more basic moves, so strength is not always the answer!");
        System.out.println("For Healing moves, the health will be added to your Pokemon, which can be extremely valuable!");
        System.out.println("To attack, simply type in the move you wish to use when prompted to in battle. You will get one attack per turn.");
        System.out.println("Note that you must spell the name of the move correctly to attack! The game is case sensitive.");
        System.out.println("Using WaterGun (A) as an example again, you would have to type WaterGun.");
        System.out.println("You DO NOT include the (A), (B), (M), or (H) when you type in a move.");
        return "Good luck, the game will restart now!";
    }

    public static void gameOn(String[] bulbasaurMoves, String[] charmanderMoves, String[] squirtleMoves, String[] darkraiMoves, String[] darkraiPossibleMoves){
        Scanner userInput = new Scanner(System.in);
        System.out.println("....");
        System.out.println("....");
        System.out.println("Oh, hello there! Allow me to introduce myself. My name is Professor Bruce, I am a Pokémon developer in the Appleton Region.");
        System.out.println("May I ask what your name is?");
        String usersName = userInput.nextLine();
        System.out.println(" ");
        System.out.println("Well, it is great to meet you " + usersName + ", I hope you are ready for your Pokemon adventure!");
        System.out.println("Below, I have three Pokemon for you to select from to start your journey!");
        System.out.println("I will warn you, the elite three will not go easy on you.");
        System.out.println("However, if you are persistent, I am confident you can one day become the Grand Master!");
        System.out.println("....");
        System.out.println("....");
        System.out.println(" ");
        System.out.println("Please select one of these Pokémon: ");
        String[] pokemonNames = {"Bulbasaur", "Charmander", "Squirtle"};
        for(String elem : pokemonNames){
            System.out.println(elem);
        }
        System.out.println(" ");
        String pokemonChoice = userInput.nextLine();
        String lowerPokemonChoice = pokemonChoice.toLowerCase();
        if(lowerPokemonChoice.equals("bulbasaur") || lowerPokemonChoice.equals("charmander") || lowerPokemonChoice.equals("squirtle")){
                System.out.println("Congratulations! You chose " + lowerPokemonChoice + " Good luck, and battle with heart!");
                System.out.println(" ");
                System.out.println(" ");
                String darkGymOutcome = darkGym(pokemonChoice, bulbasaurMoves, charmanderMoves, squirtleMoves, darkraiMoves, darkraiPossibleMoves);
                if(darkGymOutcome == "You were no match for the gym leader. Better luck next time."){
                    System.out.println("You were no match for the gym leader. Better luck next time.");
                    System.out.println("Would you like to play again? (Yes or No).");
                    while(true){
                        String playAgain = userInput.nextLine();
                        String lowerPlayAgain = playAgain.toLowerCase();
                        if(lowerPlayAgain.equals("no")){
                            System.out.println("Okay, better luck next time.");
                            break;
                        } else {
                            gameOn(bulbasaurMoves, charmanderMoves, squirtleMoves, darkraiMoves, darkraiPossibleMoves);
                        }
                    }
                } else if(darkGymOutcome == "Congrats, you won! You recieved the Darkness Badge from Cristian!"){
                    System.out.println("Congrats, you won! You recieved the Darkness Badge from Cristian!");
                    String[] ivysaurMoves = {"TailWhip (M)", "LeafBlade (A)", "FlowerPower (H)"};
                    String[] charmeleonMoves = {"Scratch (M)", "FlameThrower (A)", "DragonPulse (A)"};
                    String[] wartortleMoves = {"Heal (H)", "WaterGun (A)", "HydroPump (A)"};
                    String[] arcanineMoves = {"FireFang (A)", "Bite (A)", "ExtremeHeal (H)"};
                    String [] arcaninePossibleMoves = {"FireFang", "Bite", "ExtremeHeal"};
                    if(lowerPokemonChoice.equals("bulbasaur")){
                        System.out.println(" ");
                        System.out.println("What's this? " + lowerPokemonChoice + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String stageTwoIvysaur = "Ivysaur";
                        String lowerIvysaur = stageTwoIvysaur.toLowerCase();
                        System.out.println("Congratulations! Your " + lowerPokemonChoice + " evolved into " + lowerIvysaur + "!" );
                        System.out.println(lowerIvysaur + " forgot how to use tackle and learned " + ivysaurMoves[2] + "!");
                        System.out.println(" ");
                        System.out.println(lowerIvysaur + "'s current moves are: ");
                        for (String move : ivysaurMoves){
                            System.out.println(move);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(lowerIvysaur, ivysaurMoves, charmeleonMoves, wartortleMoves, arcanineMoves, arcaninePossibleMoves);
                        System.out.println(fireGymOutcome);
                        return;
                    } else if (lowerPokemonChoice.equals("charmander")){
                        System.out.println(" ");
                        System.out.println("What's this? " + lowerPokemonChoice + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String stageTwoCharmeleon = "Charmeleon";
                        String lowerCharmeleon = stageTwoCharmeleon.toLowerCase();
                        System.out.println("Congratulations! Your " + lowerPokemonChoice + " evolved into " + lowerCharmeleon + "!" );
                        System.out.println(lowerCharmeleon + " forgot how to use tackle and learned " + charmeleonMoves[2] + "!");
                        System.out.println(" ");
                        System.out.println(lowerCharmeleon + "'s current moves are: ");
                        for (String move : charmeleonMoves){
                            System.out.println(move);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(lowerCharmeleon, ivysaurMoves, charmeleonMoves, wartortleMoves, arcanineMoves, arcaninePossibleMoves);
                        System.out.println(fireGymOutcome);
                        return;
                    } else {
                        System.out.println(" ");
                        System.out.println("What's this? " + lowerPokemonChoice + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String stageTwoWartortle = "Wartortle";
                        String lowerWartortle = stageTwoWartortle.toLowerCase();
                        System.out.println("Congratulations! Your " + lowerPokemonChoice + " evolved into " + lowerWartortle + "!" );
                        System.out.println(lowerWartortle + " forgot how to use tackle and learned " + wartortleMoves[2] + "!");
                        System.out.println(" ");
                        System.out.println(lowerWartortle + "'s current moves are: ");
                        for (String move : wartortleMoves){
                            System.out.println(move);
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(lowerWartortle, ivysaurMoves, charmeleonMoves, wartortleMoves, arcanineMoves, arcaninePossibleMoves);
                        System.out.println(fireGymOutcome);
                        return;
                    }
                } else if(darkGymOutcome == "Okay, play again when you are ready to battle!"){
                    System.out.println("Okay, play again when you are ready to battle!");
                } else {
                    System.out.println("Please enter either Yes or No to make a decision next time.");
                }
        } else {
            System.out.println("Please enter a valid pokemon or spell the Pokemons name correctly to play. (Case Sensitive)");
            gameOn(bulbasaurMoves, charmanderMoves, squirtleMoves, darkraiMoves, darkraiPossibleMoves);
        }
    }







    public static String darkGym(String yourPokemon, String[] bulbasaurMoves, String[] charmanderMoves, String[] squirtleMoves, String[] darkraiMoves, String[] darkraiPossibleMoves){
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your first battle with the elite three!");
        System.out.println("Before you begin, allow me to introduce you to " + yourPokemon + "s current battle moves");
        System.out.println(" ");
        String lowerPokemon = yourPokemon.toLowerCase();
        if(lowerPokemon.equals("bulbasaur")){
            for(String bulbMoves : bulbasaurMoves){
                System.out.println(bulbMoves);
            }
        } else if(lowerPokemon.equals("charmander")){
            for(String charMoves : charmanderMoves){
                System.out.println(charMoves);
            }
        } else {
            for(String squirMoves : squirtleMoves){
                System.out.println(squirMoves); 
            }
        } 
        System.out.println(" ");
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        }
        if(lowerBattleTime.equals("yes")){
            System.out.println(" ");
            String gymLeader = "Cristian";
            String leadersPokemon = "Darkrai";
            int darkraiHealth = rand.nextInt(50,120);
            int usersPokemonHealth = rand.nextInt(50,99);
            System.out.println("Hello, my name is " + gymLeader + ", I am the leader of the dark type gym for the Elite Three!");
            System.out.println("My Pokemon is " + leadersPokemon + ". Good luck in battle, you will certainly need it!");
            System.out.println(" ");
            System.out.println("Beware, " + leadersPokemon + " is powerful, he has these moves: ");
            for(String battleMove : darkraiMoves){
                System.out.println(battleMove);
            }
            System.out.println(" ");
            while(usersPokemonHealth >= 0 && darkraiHealth >= 0){
                System.out.println("Your Moves: ");
                if(lowerPokemon.equals("bulbasaur")){
                    for(String bulbMoves : bulbasaurMoves){
                        System.out.println(bulbMoves);
                    }
                } else if(lowerPokemon.equals("charmander")){
                    for(String charMoves : charmanderMoves){
                        System.out.println(charMoves);
                    }
                } else {
                    for(String squirMoves : squirtleMoves){
                        System.out.println(squirMoves); 
                    }
                }
                System.out.println(" ");
                System.out.println(yourPokemon + "s current Health is: " + usersPokemonHealth);
                System.out.println(leadersPokemon + "s Pokemon's current health is: " + darkraiHealth);
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    int basicMove = rand.nextInt(7,15);
                    int mediumMove = rand.nextInt(15);
                    int advanceMove = rand.nextInt(30);
                    int healing = rand.nextInt(20);
                    if(i == 0){
                    System.out.println("What battle move would you like to use?");
                    String userAttack = userInput.nextLine();
                    String lowerUserAttack = userAttack.toLowerCase();
                    System.out.println(" ");
                        if(lowerUserAttack.equals("tackle")){
                            int darkraiNewHealth = darkraiHealth - basicMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + basicMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("tailwhip")){
                            int darkraiNewHealth = darkraiHealth - mediumMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + mediumMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("scratch")){
                            int darkraiNewHealth = darkraiHealth - mediumMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + mediumMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("heal")){
                            int userPokemonNewHealth = usersPokemonHealth + healing;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("You gained " + healing + " health. Your Pokemon now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("leafblade")){
                            int darkraiNewHealth = darkraiHealth - advanceMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("flamethrower")){
                            int darkraiNewHealth = darkraiHealth - advanceMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("watergun")) {
                            int darkraiNewHealth = darkraiHealth - advanceMove;
                            darkraiHealth = darkraiNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Darkrai now has " + darkraiHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("You did not enter a valid move. Your turn is skipped! Enter a valid move next turn.");
                        }
                    } 
                    if(i == 1) {
                        String moveChoice = darkraiPossibleMoves[(int) (Math.random() * darkraiPossibleMoves.length)];
                        if(moveChoice.equals("Nightmare")){
                            System.out.println("Darkrai used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - mediumMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Darkrai dealt " + mediumMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(moveChoice.equals("PlasmaBall")){
                            System.out.println("Darkrai used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Darkrai dealt " + advanceMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("Darkrai used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Darkrai dealt " + advanceMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        }
                    }
                }
            if(usersPokemonHealth <= 0) {
                return "You were no match for the gym leader. Better luck next time.";
            } 
            if (darkraiHealth <= 0){
                return "Congrats, you won! You recieved the Darkness Badge from Cristian!";
            }
            System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
            System.out.println(" ");
            }
        }
    return "Please enter either Yes or No to make a decision next time.";
}

    public static String fireGym(String userPokemon, String[] ivysaurMoves, String[] charmeleonMoves, String[] wartortleMoves, String[] arcanineMoves, String[] arcaninePossibleMoves){
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your second battle with the elite three!");
        System.out.println("Before battle comenses, would you like a refresher of " + userPokemon + "s current battle moves?");
        while(true){
            System.out.println(" ");
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            if(lowerMoveRefresher.equals("yes")){
                if(userPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move);
                    }
                    break;
                } else if(userPokemon.equals("charmeleon")){
                    for(String move : charmeleonMoves){
                        System.out.println(move);
                    }
                    break;
                } else {
                    for(String move : wartortleMoves){
                        System.out.println(move); 
                    }
                    break;
                } 
            } else if (lowerMoveRefresher.equals("no")) {
                System.out.print("Okay, get ready for battle then!");
                break;
            } else {
                System.out.println("Please enter a valid form of yes or no.");
            }
        }
        System.out.println(" ");
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        }
        if(lowerBattleTime.equals("yes")){
            System.out.println(" ");
            String gymLeader = "JP";
            String leadersPokemon = "Arcanine";
            int arcanineHealth = rand.nextInt(75,150);
            int usersPokemonHealth = rand.nextInt(75,140);
            System.out.println("Hello, my Name is " + gymLeader + " the fire gym leader!");
            System.out.println("Well, you made it past Cristian, but you will be no match for my Pokemon " + leadersPokemon + ".");
            System.out.println("I've spent my entire life training for these battles, and I do not intend to lose to you!");
            System.out.println(" ");
            System.out.println("Beware, " + leadersPokemon + " is powerful, he has these moves: ");
            for(String battleMove : arcanineMoves){
                System.out.println(battleMove);
            }
            System.out.println(" ");
            while(usersPokemonHealth >= 0 && arcanineHealth >= 0){
                System.out.println("Your Moves: ");
                if(userPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move); 
                    }
                } else if(userPokemon.equals("charmeleon")){
                    for(String move : charmeleonMoves){
                        System.out.println(move); 
                    }
                } else {
                    for(String move : wartortleMoves){
                        System.out.println(move); 
                    }
                }
                System.out.println(" ");
                System.out.println(userPokemon + "s current Health is: " + usersPokemonHealth);
                System.out.println(leadersPokemon + "s Pokemon's current health is: " + arcanineHealth);
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    int mediumMove = rand.nextInt(10, 30);
                    int advanceMove = rand.nextInt(2, 60);
                    int healing = rand.nextInt(25,50);
                    if(i == 0){
                    System.out.println("What battle move would you like to use?");
                    String userAttack = userInput.nextLine();
                    String lowerUserAttack = userAttack.toLowerCase();
                    System.out.println(" ");
                        if(lowerUserAttack.equals("dragonpulse")){
                            int arcanineNewHealth = arcanineHealth - advanceMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("tailwhip")){
                            int arcanineNewHealth = arcanineHealth - mediumMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + mediumMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("scratch")){
                            int arcanineNewHealth = arcanineHealth - mediumMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + mediumMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("heal") || lowerUserAttack.equals("flowerpower")){
                            int userPokemonNewHealth = usersPokemonHealth + healing;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("You gained " + healing + " health. Your Pokemon now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("leafblade")){
                            int arcanineNewHealth = arcanineHealth - advanceMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("flamethrower")){
                            int arcanineNewHealth = arcanineHealth - advanceMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("watergun")) {
                            int arcanineNewHealth = arcanineHealth - advanceMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("hydropump")) {
                            int arcanineNewHealth = arcanineHealth - advanceMove;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("You did not enter a valid move. Your turn is skipped! Enter a valid move next turn.");
                        }
                    } 
                    if(i == 1) {
                        String moveChoice = arcaninePossibleMoves[(int) (Math.random() * arcaninePossibleMoves.length)];
                        if(moveChoice.equals("FireFang")){
                            System.out.println("Arcanine used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - mediumMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Arcanine dealt " + mediumMove + " damage. " + userPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(moveChoice.equals("Bite")){
                            System.out.println("Arcanine used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Arcanine dealt " + advanceMove + " damage. " + userPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("Arcanine used " + moveChoice);
                            int arcanineNewHealth = arcanineHealth + healing;
                            arcanineHealth = arcanineNewHealth;
                            System.out.println("Arcanine gained " + healing + " health. Arcanine now has " + arcanineHealth + " health remaining.");
                            System.out.println(" ");
                        }
                    }
                }
            if(usersPokemonHealth <= 0) {
                return "You were no match for the gym leader. Better luck next time.";
            } 
            if (arcanineHealth <= 0){
                return "Congrats, you won! You recieved the Fire Badge from JP!";
            }
            System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
            System.out.println(" ");
            }
        }
    return "Please enter either Yes or No to make a decision next time.";
    }

//    public static String grandMaster(){

//    }

    public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    String[] bulbasaurMoves = {"TailWhip (M)", "LeafBlade (A)", "Tackle (B)"};
    String[] charmanderMoves = {"Scratch (M)", "FlameThrower (A)", "Tackle (B)"};
    String[] squirtleMoves = {"Heal (H)", "WaterGun (A)", "Tackle (B)"};
    String[] darkraiMoves = {"PlasmaBall (A)", "ShadowHunter (A)", "Nightmare (M)"};
    String [] darkraiPossibleMoves = {"PlasmaBall", "ShadowHunter", "Nightmare"};
    while(true){
    System.out.println("Welcome to Pokemon Lawrentian! Would you like an introduction to how battling works (Yes or No)? This is Recommended for first time players.");
    String tutorial = userInput.nextLine();
    String lowerTutorial = tutorial.toLowerCase();
    if(lowerTutorial.equals("yes")){
        System.out.println(battleTutorial());
        System.out.println(" ");
    } else if (lowerTutorial.equals("no")) {
        gameOn(bulbasaurMoves, charmanderMoves, squirtleMoves, darkraiMoves, darkraiPossibleMoves);
        break;
    } else {
        System.out.println("Please enter either yes or no next time to play the game.");
        break;
    }
    break;
    }
    }
}






