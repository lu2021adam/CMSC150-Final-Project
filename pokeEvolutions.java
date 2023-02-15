import java.util.*;

public class pokeEvolutions {

    public static String stageTwoEvolutions(String userPokemon){
        String[] ivysaurMoves = {"TailWhip (M)", "LeafBlade (A)", "FlowerPower (H)"};
        String[] charmeleonMoves = {"Scratch (M)", "FlameThrower (A)", "DragonPulse (A)"};
        String[] wartortleMoves = {"Heal (H)", "WaterGun (A)", "HydroPump (A)"};
        if(userPokemon.equals("bulbasaur")){
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Muffled Yelps*");
            System.out.println("....");
            System.out.println("....");
            String stageTwoIvysaur = "Ivysaur";
            String lowerIvysaur = stageTwoIvysaur.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerIvysaur + "!" );
            System.out.println(lowerIvysaur + " forgot how to use tackle and learned " + ivysaurMoves[2] + "!");
            System.out.println(" ");
            System.out.println(lowerIvysaur + "'s current moves are: ");
            for (String move : ivysaurMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "ivysaur";
        } else if (userPokemon.equals("charmander")){
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Muffled Yelps*");
            System.out.println("....");
            System.out.println("....");
            String stageTwoCharmeleon = "Charmeleon";
            String lowerCharmeleon = stageTwoCharmeleon.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerCharmeleon + "!" );
            System.out.println(lowerCharmeleon + " forgot how to use tackle and learned " + charmeleonMoves[2] + "!");
            System.out.println(" ");
            System.out.println(lowerCharmeleon + "'s current moves are: ");
            for (String move : charmeleonMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "charmeleon";
        } else {
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Muffled Yelps*");
            System.out.println("....");
            System.out.println("....");
            String stageTwoWartortle = "Wartortle";
            String lowerWartortle = stageTwoWartortle.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerWartortle + "!" );
            System.out.println(lowerWartortle + " forgot how to use tackle and learned " + wartortleMoves[2] + "!");
            System.out.println(" ");
            System.out.println(lowerWartortle + "'s current moves are: ");
            for (String move : wartortleMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "wartortle";
        }
    }

    public static String stageThreeEvolutions(String userPokemon){
        String[] venusaurMoves = {"RazorLeaf (A)", "GigaDrain (H/A)", "FlowerPower (H)"};
        String[] charizardMoves = {"FireBlast (A)", "DragonBreath (H/A)", "DragonPulse (A)"};
        String[] blastoiseMoves = {"Surf (A)", "RainDance (H/A)", "HydroPump (A)"};
        if(userPokemon.equals("ivysaur")){
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Growls, Shrieks,  Yelps*");
            System.out.println("SAAUUUUURRR!!!");
            System.out.println("....");
            System.out.println("....");
            String stageThreeVenusaur = "Venusaur";
            String lowerVenusaur = stageThreeVenusaur.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerVenusaur + "!" );
            System.out.println("....");
            System.out.println(lowerVenusaur  + " forgot how to use TailWhip and learned " + venusaurMoves[0] + "!");
            System.out.println("....");
            System.out.println(lowerVenusaur  + " forgot how to use LeafBlade and learned " + venusaurMoves[1] + "!");
            System.out.println(venusaurMoves[1] + " is a hybrid healing and advanced attack move!");
            System.out.println("It will deal damage and heal " + lowerVenusaur + " the same amount as the damage done!");
            System.out.println(" ");
            System.out.println(lowerVenusaur  + "'s current moves are: ");
            for (String move : venusaurMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "venusaur";
        } else if (userPokemon.equals("charmander")){
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Growls, Shrieks,  Yelps*");
            System.out.println("ZAAAAAARRRRDDDDD!!!");
            System.out.println("....");
            System.out.println("....");
            String stageThreeCharizard = "Charizard";
            String lowerCharizard = stageThreeCharizard.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerCharizard + "!" );
            System.out.println("....");
            System.out.println(lowerCharizard + " forgot how to use Scratch and learned " + charizardMoves[0] + "!");
            System.out.println("....");
            System.out.println(lowerCharizard  + " forgot how to use FlameThrower and learned " + charizardMoves[1] + "!");
            System.out.println(charizardMoves[1] + " is a hybrid healing and advanced attack move!");
            System.out.println("It will deal damage and heal " + lowerCharizard + " the same amount as the damage done!");
            System.out.println(" ");
            System.out.println(lowerCharizard  + "'s current moves are: ");
            for (String move : charizardMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "charizard";
        } else {
            System.out.println(" ");
            System.out.println("What's this? " + userPokemon + " is evolving!");
            System.out.println("....");
            System.out.println("....");
            System.out.println("*Growls, Shrieks,  Yelps*");
            System.out.println("STOOOOIIIIISSSSSS!!!");
            System.out.println("....");
            System.out.println("....");
            String stageThreeBlastoise = "Charizard";
            String lowerBlastoise = stageThreeBlastoise.toLowerCase();
            System.out.println("Congratulations! Your " + userPokemon + " evolved into " + lowerBlastoise + "!" );
            System.out.println("....");
            System.out.println(lowerBlastoise + " forgot how to use Scratch and learned " + blastoiseMoves[0] + "!");
            System.out.println("....");
            System.out.println(lowerBlastoise  + " forgot how to use FlameThrower and learned " + blastoiseMoves[1] + "!");
            System.out.println(blastoiseMoves[1] + " is a hybrid healing and advanced attack move!");
            System.out.println("It will deal damage and heal " + lowerBlastoise + " the same amount as the damage done!");
            System.out.println(" ");
            System.out.println(lowerBlastoise  + "'s current moves are: ");
            for (String move : blastoiseMoves){
                System.out.println(move);
            }
            System.out.println(" ");
            return "blastoise";
        }
    }


    public static void main(String[] args){

    }
    
}
