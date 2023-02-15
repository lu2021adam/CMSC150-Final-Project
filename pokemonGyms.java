import java.util.*;

public class pokemonGyms{

    public static String darkGym(String yourPokemon){
        String[] bulbasaurMoves = {"TailWhip (M)", "LeafBlade (A)", "Tackle (B)"};
        String[] charmanderMoves = {"Scratch (M)", "FlameThrower (A)", "Tackle (B)"};
        String[] squirtleMoves = {"Heal (H)", "WaterGun (A)", "Tackle (B)"};
        String[] darkraiMoves = {"PlasmaBall (A)", "ShadowHunter (A)", "Nightmare (M)"};
        String[] darkraiPossibleMoves = {"PlasmaBall", "ShadowHunter", "Nightmare"};
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your first battle with the elite three!");
        System.out.println("Before you begin, allow me to introduce you to " + yourPokemon + "s current battle moves");
        System.out.println(" ");
        if(yourPokemon.equals("bulbasaur")){
            for(String bulbMoves : bulbasaurMoves){
                System.out.println(bulbMoves);
            }
        } else if(yourPokemon.equals("charmander")){
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
                if(yourPokemon.equals("bulbasaur")){
                    for(String bulbMoves : bulbasaurMoves){
                        System.out.println(bulbMoves);
                    }
                } else if(yourPokemon.equals("charmander")){
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

    public static String fireGym(String yourPokemon){
        String[] ivysaurMoves = {"TailWhip (M)", "LeafBlade (A)", "FlowerPower (H)"};
        String[] charmeleonMoves = {"Scratch (M)", "FlameThrower (A)", "DragonPulse (A)"};
        String[] wartortleMoves = {"Heal (H)", "WaterGun (A)", "HydroPump (A)"};
        String[] arcanineMoves = {"FireFang (A)", "Bite (A)", "ExtremeHeal (H)"};
        String [] arcaninePossibleMoves = {"FireFang", "Bite", "ExtremeHeal"};
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your second battle with the elite three!");
        System.out.println("Before battle comenses, would you like a refresher of " + yourPokemon + "s current battle moves?");
        while(true){
            System.out.println(" ");
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            if(lowerMoveRefresher.equals("yes")){
                if(yourPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move);
                    }
                    break;
                } else if(yourPokemon.equals("charmeleon")){
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
                if(yourPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move); 
                    }
                } else if(yourPokemon.equals("charmeleon")){
                    for(String move : charmeleonMoves){
                        System.out.println(move); 
                    }
                } else {
                    for(String move : wartortleMoves){
                        System.out.println(move); 
                    }
                }
                System.out.println(" ");
                System.out.println(yourPokemon + "s current Health is: " + usersPokemonHealth);
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
                            System.out.println("Arcanine dealt " + mediumMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(moveChoice.equals("Bite")){
                            System.out.println("Arcanine used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Arcanine dealt " + advanceMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
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
                return "You were no match for gym leader JP. Better luck next time.";
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


    public static String grandMaster(String yourPokemon){
        String[] venusaurMoves = {"RazorLeaf (A)", "GigaDrain (H/A)", "FlowerPower (H)"};
        String[] charizardMoves = {"FireBlast (A)", "DragonBreath (H/A)", "DragonPulse (A)"};
        String[] blastoiseMoves = {"Surf (A)", "RainDance (H/A)", "HydroPump (A)"};
        String[] arceusMoves = {"HyperBeam (A)", "CosmicPower (H/A)", "PerishSong (H/A)"};
        String [] arceusPossibleMoves = {"HyperBeam", "CosmicPower", "PerishSong"};
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Grand Master battle!!");
        System.out.println("Before battle comenses, would you like a refresher of " + yourPokemon + "s current battle moves?");
        while(true){
            System.out.println(" ");
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            if(lowerMoveRefresher.equals("yes")){
                if(yourPokemon.equals("venusaur")){
                    for(String move : venusaurMoves){
                        System.out.println(move);
                    }
                    break;
                } else if(yourPokemon.equals("charizard")){
                    for(String move : charizardMoves){
                        System.out.println(move);
                    }
                    break;
                } else {
                    for(String move : blastoiseMoves){
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
        System.out.println("......");
        System.out.println("*Eerie Music*");
        System.out.println("......");
        System.out.println("So much power in one computer. One diverse core of languages.");
        System.out.println("Harness the power.... Knowledge is power....");
        System.out.println("......");
        System.out.println(" ");
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        }
        if(lowerBattleTime.equals("yes")){
            System.out.println(" ");
            String gymLeader = "Professor Ackles";
            String leadersPokemon = "Arceus";
            int arceusHealth = rand.nextInt(200,400);
            int usersPokemonHealth = rand.nextInt(200,375);
            System.out.println("Welcome trainer, my name is " + gymLeader + " the Grand Master of the Elite Three.");
            System.out.println("Professor Bruce believed you had the pois to come this far, and here you are.");
            System.out.println("Well, my " + leadersPokemon + " has been waiting for a noble challenger like you.");
            System.out.println("In learning you will teach, and in teaching I shall learn.");
            System.out.println(" ");
            System.out.println("Beware, " + leadersPokemon + " is extremely powerful. " + leadersPokemon  + " has these moves: ");
            for(String battleMove : arceusMoves){
                System.out.println(battleMove);
            }
            System.out.println(" ");
            while(usersPokemonHealth >= 0 && arceusHealth >= 0){
                System.out.println("Your Moves: ");
                if(yourPokemon.equals("venusaur")){
                    for(String move : venusaurMoves){
                        System.out.println(move); 
                    }
                } else if(yourPokemon.equals("charizard")){
                    for(String move : charizardMoves){
                        System.out.println(move); 
                    }
                } else {
                    for(String move : blastoiseMoves){
                        System.out.println(move); 
                    }
                }
                System.out.println(" ");
                System.out.println(yourPokemon + "s current Health is: " + usersPokemonHealth);
                System.out.println(leadersPokemon + "s Pokemon's current health is: " + arceusHealth);
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    int advanceMove = rand.nextInt(50, 100);
                    int healing = rand.nextInt(30,80);
                    if(i == 0){
                    System.out.println("What battle move would you like to use?");
                    String userAttack = userInput.nextLine();
                    String lowerUserAttack = userAttack.toLowerCase();
                    System.out.println(" ");
                        if(lowerUserAttack.equals("dragonpulse") || lowerUserAttack.equals("razorleaf") || lowerUserAttack.equals("fireblast") || lowerUserAttack.equals("surf") || lowerUserAttack.equals("hydropump")){
                            int arceusNewHealth = arceusHealth - advanceMove;
                            arceusHealth = arceusNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arceus now has " + arceusHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("dragonbreath") || lowerUserAttack.equals("gigadrain") || lowerUserAttack.equals("raindance")){
                            int arceusNewHealth = arceusHealth - advanceMove;
                            arceusHealth = arceusNewHealth;
                            int userPokemonNewHealth = usersPokemonHealth + advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("You dealt " + advanceMove + " damage. Arceus now has " + arceusHealth + " health remaining.");
                            System.out.println(" ");
                            System.out.println("You gained " + advanceMove + " health. Your Pokemon now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(lowerUserAttack.equals("flowerpower")){
                            int userPokemonNewHealth = usersPokemonHealth + healing;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("You gained " + healing + " health. Your Pokemon now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("You did not enter a valid move. Your turn is skipped! Enter a valid move next turn.");
                        }
                    } 
                    if(i == 1) {
                        String moveChoice = arceusPossibleMoves[(int) (Math.random() * arceusPossibleMoves.length)];
                        if(moveChoice.equals("HyperBeam")){
                            System.out.println("Arceus used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Arceus dealt " + advanceMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else {
                            System.out.println("Arcues used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            int arceusNewHealth = arceusHealth + advanceMove;
                            arceusHealth = arceusNewHealth;
                            System.out.println("Arceus dealt " + advanceMove + " damage." + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                            System.out.println("Arceus gained " + advanceMove + " health. Arceus now has " + arceusHealth + " health remaining.");
                            System.out.println(" ");
                        }
                    }
                }
            if(usersPokemonHealth <= 0) {
                return "You were no match for the Grand Master. Better luck next time.";
            } 
            if (arceusHealth <= 0){
                return "Congrats, you won! You were crowned Grand Master by Professor Ackles!";
            }
            System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
            System.out.println(" ");
            }
        }
    return "Please enter either Yes or No to make a decision next time.";




















        System.out.println("Welcome to your second battle with the elite three!");
        System.out.println("Before battle comenses, would you like a refresher of " + yourPokemon + "s current battle moves?");
        while(true){
            System.out.println(" ");
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            if(lowerMoveRefresher.equals("yes")){
                if(yourPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move);
                    }
                    break;
                } else if(yourPokemon.equals("charmeleon")){
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
                if(yourPokemon.equals("ivysaur")){
                    for(String move : ivysaurMoves){
                        System.out.println(move); 
                    }
                } else if(yourPokemon.equals("charmeleon")){
                    for(String move : charmeleonMoves){
                        System.out.println(move); 
                    }
                } else {
                    for(String move : wartortleMoves){
                        System.out.println(move); 
                    }
                }
                System.out.println(" ");
                System.out.println(yourPokemon + "s current Health is: " + usersPokemonHealth);
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
                            System.out.println("Arcanine dealt " + mediumMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
                            System.out.println(" ");
                        } else if(moveChoice.equals("Bite")){
                            System.out.println("Arcanine used " + moveChoice);
                            int userPokemonNewHealth = usersPokemonHealth - advanceMove;
                            usersPokemonHealth = userPokemonNewHealth;
                            System.out.println("Arcanine dealt " + advanceMove + " damage. " + yourPokemon + " now has " + usersPokemonHealth + " health remaining.");
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
                return "You were no match for gym leader JP. Better luck next time.";
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

    public static void main(String [] args){

    }
}