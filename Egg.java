/**
* this class describes the egg with color and contents
* @author Adam James
* @version 3/8/21
*/

import java.util.Random;

class Egg{
  /* These are the instance variables */
  private String eggColor;
  private String eggContents;

  /* these set the egg colors and contents something random choosen by the methods below */
  Egg () {
    eggColor = randomColor();
    eggContents = randomContents();
  }

  /**
  * this picks a random color from the array of 4 colors
  * @return the random egg color selected
  */
  String randomColor() {
    String colors[] = {"blue","pink","yellow","green"};
    Random r = new Random();
    String eggColor = (colors[r.nextInt(colors.length)]);
    return eggColor;
  }

  /**
  * this picks random contents for the egg out of the array of contents 
  * @return the random egg contents selected
  */
  String randomContents() {
    String contents[] = {"Cadbury Egg", "Reese’s Egg", "pink Starburst", "yellow Peep", "25 cents", "50 cents", "one dollar"};
    Random r = new Random();
    String eggContents = (contents[r.nextInt(contents.length)]);
    return eggContents;
  }

  /**
  * this lets you see the egg color 
  * @return the egg color
  */
  String getColor() {
    return eggColor;
  }

  /**
  * this lets you see the egg contents 
  * @return the egg contents
  */
  String getContents() {
    return eggContents;
  }

  /* this diplays the statement of what color the egg is and what its contents are */
  void printEgg() {
    System.out.println(eggColor + " egg contains " + eggContents);
  }
}