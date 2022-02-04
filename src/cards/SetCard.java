/**
 * author: Xavier Denson
 * 2/2/2022
 * SetCard.java
 * represents a card in a set card game
 */
package cards;

/**
 * This class represents a card in a Set card game
 */
public class SetCard extends Card {
    private String shape;
    private int number;
    private String shading;
    private String color;

    /**
     * creats a new card for the Set Game given a number, shape, shade, and color
     * @param shape
     * @param number
     * @param shading
     * @param color
     */
    public SetCard(String shape, int number, String shading, String color){
        super(shading + "-" + color + " " + shape + " " + number);
        this.shape = shape;
        this.number = number;
        this.color = color;
        this.shading = shading;
    }

    /**
     * getter for shape attribute
     * @return shape on card
     */
    public String getShape() {
        return shape;
    }

    /**
     *  getter for number attribute
     * @return number on Card
     */
    public int getNumber() {
        return number;
    }

    /**
     *  getter for shading attriubte
     * @return shading on card
     */
    public String getShading() {
        return shading;
    }

    /**
     * getter for color attribute
     * @return card color
     */
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SetCard{" +
                "shape='" + shape + '\'' +
                ", number=" + number +
                ", shading='" + shading + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
