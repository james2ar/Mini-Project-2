/**
* this class describes the egg with color and contents
* @author Adam James, Najee Robinson, Anthony Hale
* @version 3/11/21
*/
import java.util.ArrayList;

class Player{
  /**
  * these are the instance variables
  * this is where the basket array list is initialized
  */
  private int eggNumber;
  private ArrayList<Egg> basket;

  /**
  * this is the player constructor that sets the amount of eggs in the basket to 0
  */
  Player() {
    eggNumber = 0;
    basket = new ArrayList<Egg>();
  }

  /**
  * @return the egg number
  */
  public int getNumEggs() {
    return eggNumber;
  }

  /**
  * @return the basket list array to see all the eggs in the basket
  */
  public ArrayList<Egg> getBasket() {
    return basket;
  }

  /**
  * this void prints out all the eggs in the basket and what their contents are for the user to see
  */
  public void printBasket() {
    for (int i = 0; i < basket.size(); i++) {
      basket.get(i).printEgg();
    }
  }

  /**
  * this method is what runs when you find an egg
  * this adds an egg to your basket and puts the egg information into the basket list array
  */
  public void foundEgg(Egg theEgg) {
    eggNumber = eggNumber + 1;
    basket.add(theEgg);
  }
}

