package ie.tudublin;

public class Cat extends Animal {

    private int numLives;

    public void speak() {
        System.out.println("Meow! " + name);
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
        this.numLives = 9;
        this.name = "poosay cat";
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public void kill() {
        if (numLives > 0) {
            numLives--;
            System.out.println("Ouch!");
        } 
        else if(numLives == 0){
            System.out.println("Dead");
        }
    }

}
