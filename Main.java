/*
Mini Project 2
Group #2: Adam James, Anthony Hale, Najee Robinson
Date: 3/12/21
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int playerNum; //this will hold the number of players

    System.out.println("How many players are in this egg hunt? Enter a positive whole number: ");
    playerNum = s.nextInt(); //this sets the user input as the number of players

    /* 
    * this if statement will turn a negative input for players into the equivalent positive number
    */
    if (playerNum < 0) {
      playerNum = playerNum * (-1);
    }

    ArrayList<Player> players = new ArrayList<Player>();

    /*
    * this populates the player array with the number of players the user inputs
    */
    for (int i = 0; i < playerNum; i++) {
      players.add(new Player());
    }

    System.out.println("We have added " + playerNum + " players to this hunt. Let's find some eggs!");

    hunt(players);

    recap(players);

    stats(players);
  }

  /*
  * this method randomly adds a number of eggs - eggsfound - to the player in the player array
  */
  public static void hunt(ArrayList<Player> thePlayer){
    Random r = new Random();

    int eggsFound;

    /* this for loop runs through each player in the player array and assigns them a random eggs count from 0 to 10 */
    for (int i = 0; i < thePlayer.size(); i++) {
      eggsFound = r.nextInt(11);

      /* this nested for loop will run through each egg that a player has from the outer for loop and assign it a random color and random contents through the Egg class, then add it to the players basket array */
      for (int k = 0; k < eggsFound; k++) {
        thePlayer.get(i).foundEgg(new Egg());
      }
    }
  }

  /*
  * this method will count the number of eggs each player has found and print out the results 
  * the printBasket() method is also used from the player class to show the color and contents of each egg that the different players collect
  */
  public static void recap(ArrayList<Player> thePlayer) {
    for (int i = 0; i < thePlayer.size(); i++) {
      System.out.println("\nPlayer " + i + " found " + thePlayer.get(i).getNumEggs() + " eggs");
      thePlayer.get(i).printBasket();
    }
  }

  /*
  * this final method is used to find the player who found the most eggs and display how many eggs of each color are found
  */
  public static void stats(ArrayList<Player> thePlayer) {
    int mostEggs = 0; //this will hold the player number who found the most eggs
    int highestNumber = 0; //this will hold the number of eggs that the "mostEggs" player collected

    /*
    * the for loop runs through each player and compares the number of eggs they found, keeping track of the highest one
    */
    for (int i=0; i < thePlayer.size(); i++) {
      if (thePlayer.get(i).getNumEggs() > highestNumber) {
        highestNumber = thePlayer.get(i).getNumEggs();
        mostEggs = i;
      }
    }

    System.out.println("\nPlayer " + mostEggs + " found the most eggs, with " + highestNumber + " eggs!"); //this prints out the player with the most eggs and how many they collected

    int[] colors = new int[4]; //this new array holds a count of how many eggs of each color were found

    /*
    * this nested for loop runs through each players eggs and adds 1 to each corresponding color in the color array for each egg they found of each color
    */
    for(int i = 0; i < thePlayer.size(); i++) {
      for(int k = 0; k < thePlayer.get(i).getNumEggs(); k++){
          if (thePlayer.get(i).getBasket().get(k).getColor().equals("blue")) {
          colors[0] = colors[0] + 1; //color "0" in the color array corresponds to blue
          }
          else if (thePlayer.get(i).getBasket().get(k).getColor().equals("pink")) {
          colors[1] = colors[1] + 1; //color "1" in the color array corresponds to pink
          }
          else if (thePlayer.get(i).getBasket().get(k).getColor().equals("yellow")) {
          colors[2] = colors[2] + 1; //color "2" in the color array corresponds to yellow
          }
          else if (thePlayer.get(i).getBasket().get(k).getColor().equals("green")) {
          colors[3] = colors[3] + 1; //color "3" in the color array corresponds to green
          }
        }
      }

      /*
      * these print statements give the totals for each color of eggs found which are stored in the colors array
      */
      System.out.println("\nTotal eggs found: ");
      System.out.println("Blue eggs: " + colors[0]);
      System.out.println("Pink eggs: " + colors[1]);
      System.out.println("Yellow eggs: " + colors[2]);
      System.out.println("Green eggs: " + colors[3]);

  }

}