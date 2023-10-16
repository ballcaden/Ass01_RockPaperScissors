import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerAMove = "";
        String playerBMove = "";
        String cont = "";
        boolean validInput1 = false;
        boolean validInput2 = false;
        boolean continueYN = false;

            do {
                do {
                    System.out.println("Enter player A's move: ");
                    if (scan.hasNextLine()) {
                        playerAMove = scan.nextLine();
                        if (playerAMove.equalsIgnoreCase("R")) {
                            validInput1 = true;
                        } else if (playerAMove.equalsIgnoreCase("P")) {
                            validInput1 = true;
                        } else if (playerAMove.equalsIgnoreCase("S")) {
                            validInput1 = true;
                        } else {
                            System.out.println("You've entered an invalid value. Please try again");
                            scan.nextLine();
                        }
                    } else {
                        System.out.println("You've entered an invalid value. Please try again");
                        scan.nextLine();
                    }
                } while (!validInput1);

                do {
                    System.out.println("Enter player B's move: ");
                    if (scan.hasNextLine()) {
                        playerBMove = scan.nextLine();
                        if (playerBMove.equalsIgnoreCase("R")) {
                            validInput2 = true;
                        } else if (playerBMove.equalsIgnoreCase("P")) {
                            validInput2 = true;
                        } else if (playerBMove.equalsIgnoreCase("S")) {
                            validInput2 = true;
                        } else {
                            System.out.println("You've entered an invalid value. Please try again");
                            scan.nextLine();
                        }
                    } else {
                        System.out.println("You've entered an invalid value. Please try again");
                        scan.nextLine();
                    }
                } while (!validInput2);

                if (playerAMove.equals(playerBMove)) {
                    System.out.println("Both players chose the same thing. Tie!");
                } else if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock beats Scissors. Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("R") && playerAMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock beats Scissors. Player B wins!");
                } else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats Paper. Player A wins");
                } else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats Paper. Player B wins");
                } else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats Rock. Player A wins!");
                } else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats Rock. Player B wins!");
                }
                System.out.println("Do you want to play again[Y/N]?");
                cont = scan.nextLine();
                if(cont.equalsIgnoreCase("Y")) {
                    continueYN = true;
                } else if(cont.equalsIgnoreCase("N")) {
                    continueYN = false;
                }
            }  while(continueYN);
    }
}