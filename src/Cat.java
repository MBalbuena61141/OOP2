public abstract class Cat extends Animal {

   private String Meow;

    public String getMeow() {
        return Meow;
    }

    public void setMeow(String meow) {
        Meow = meow;
    }

    public Cat(String colour, int limbs, String meow) {
        super(colour, limbs);
        Meow = meow;
    }
}


}
