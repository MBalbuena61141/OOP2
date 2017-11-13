   public abstract class Animal {

    private  String colour;
    private int limbs;


    public Animal(String colour, int limbs) {
        this.colour = colour;
        this.limbs = limbs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }


       public abstract void breath();
}

