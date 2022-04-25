import java.util.Scanner;
public class Game {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Mars Launcher, what is your name?");

        String name = input.nextLine();
        System.out.println("Not what I would've guess but, okay " + name + "." + " Anyways, what color do you want your spacesuit to be?");

        String suitColor = input.nextLine();
        System.out.println("I'll have to double check if we have " + suitColor + " in stock, but " + suitColor + " it is.");
        System.out.println("Next everyone is issued a pet, but first must pick a pet name.. also picking name is an agreement that you won't let your pet die.. What is your pets name?");

        String petName = input.nextLine();
        System.out.println("Interesting choice..." + petName + " it is. Now that's everything are you ready to head out?");

        String answer = input.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Don't be too eager or you might die.");
        } else if (answer.equals("no")) {
            System.out.println("I was just asking to be nice");
        }


        System.out.println("Spacers choice, force- I mean loves their future cadets and wishes to learn more about you.. did you enjoy this intro? y/n");
        String yes = input.nextLine();
        if (yes.length() > 2) {
            System.out.println("I SAID Y/N!!! YOU KNOW WHAT JUST LEAVE");
        } else if (yes.equals("y")) {
            System.out.println("Ayyy");
        } else  if (yes.equals("n")){
            System.out.println("IM NOT CRYING YOU ARE.");
        } else {
            System.out.println("sigh it's y or n... nvm");
        }
    }
}