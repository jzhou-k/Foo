public class Vegetable {

    //attributes
    private final String name;
    private String smell;
    private double weight;
    private boolean hasPeel;
    private int calories;


    //constructor
    public Vegetable(String name, String smell, double weight, boolean hasPeel, int calories) {
        this.name = name;
        this.smell = smell;
        this.hasPeel = hasPeel;
        this.calories = calories;

        if (weight > 0){
            this.weight = weight;
        }else {
            this.weight = 1;
        }

    }


    //getter
    /**
     * Returns the name of the vegetable
     * @return name of the vegetable
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the smell of the vegetable
     * @return the smell of the vegetable
     */
    public String getSmell() {
        return smell;
    }

    /**
     * Returns the weight of the vegetable
     * @return the weight of the of vegetable
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns boolean if vegetable has peel
     * @return if vegetable has peel
     */
    public boolean isHasPeel() {
        return hasPeel;
    }

    /**
     * Returns the calories of vegetable
     * @return calories of the vegetable
     */
    public int getCalories() {
        return calories;
    }


    //setter
    /**
     * changes the smell of the vegetable
     * @param smell smell of the vegetable
     */
    public void setSmell(String smell) {
        this.smell = smell;
    }

    /**
     * changes the weight of the vegetable
     * @param weight weight of the vegetable
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * changes if vegetable has peel
     * @param hasPeel if vegetable has peel
     */
    public void setHasPeel(boolean hasPeel) {
        this.hasPeel = hasPeel;
    }

    /**
     * Changes the calories of the vegetable
     * @param calories calories of the vegetable
     */
    public void setCalories(int calories) {

        if (calories > 0){
            this.calories = calories;
        }else {
            //nothing
        }

    }
}
