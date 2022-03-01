public class Meat {
    //attributes
    private final String name;
    private String colour;
    private double weight;
    private boolean hasBone;
    private String texture;


    //constructor
    public Meat(String name, String colour, double weight, boolean hasBone, String texture) {
        this.name = name;
        this.colour = colour;
        this.hasBone = hasBone;
        this.texture = texture;

        //set restrictions
        if(weight > 0){
            this.weight = weight;
        }else{
            //default weight if someone enters the wrong weight
            this.weight = 1;
        }

    }

    //getter
    /**
     * Gets the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the weight
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets the color
     * @return colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Get if meat has bone
     * @return if meat has bone
     */
    public boolean isHasBone() {
        return hasBone;
    }

    /**
     * Gets the texture
     * @return texture of the meat
     */
    public String getTexture() {
        return texture;
    }

    //setters
    /**
     * Allows the user to change meat weight
     * @param weight
     */
    public void setWeight(double weight) {

        if (weight > 0){
            this.weight = weight;
        }else{
            //nothing happens
        }

    }

    /**
     * Allows user to change if meat has bone
     * @param hasBone boolean value for if weight has bone
     */
    public void setHasBone(boolean hasBone) {
        this.hasBone = hasBone;
    }

    /**
     * Allows user to change the color of the meat
     * @param colour color of the meat
     */
    public void setColour(String colour) {
        this.colour = colour;
    }


    /**
     * Allows user to change the texture of the meat
     * @param texture texture of the meat
     */
    public void setTexture(String texture) {
        this.texture = texture;
    }
}
