import java.util.*;

public class introTutorial {

    public static String tutorial(){
        System.out.println(" ");
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

    public static void introduction(){
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
    }

    public static void main(String[] args){
    }
}
