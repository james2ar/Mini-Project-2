/**
* this class describes the egg with color and contents
* @author Adam James
* @version 3/8/21
*/
import java.util.ArrayList;

class Player{
  /**
  * these are the instance variables
  * this is where the basket array list is initialized
  */
  private int eggNumber;
  private ArrayList<String> basket = new ArrayList<String>();

  /**
  * this is the player constructor that sets the amount of eggs in the basket to 0
  */
  Player() {
    eggNumber = 0;
  }

  /**
  * @return the egg number
  */
  int getNumEggs() {
    return eggNumber;
  }

  /**
  * @return the basket list array to see all the eggs in the basket
  */
  String getBasket() {
    return basket;
  }

  /**
  * this void prints out all the eggs in the basket and what their contents are for the user to see
  */
  void printBasket() {
    for (int i = 0; i < basket.size(); i++) {
      System.out.println(basket.get(printEgg(i)));
    }
  }

  /**
  * this method is what runs when you find an egg
  * this adds an egg to your basket and puts the egg information into the basket list array
  */
  void foundEgg(String Egg) {
    eggNumber = eggNumber + 1;
    basket.add(Egg);
  }
}

