public class Apple extends Frukty {
    private Vitamin vitamin;

    public Apple(String color, int price, String flavor, Vitamin vitamin) {
        super(color, price, flavor);
        this.vitamin = vitamin;
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return getColor()+" "+getPrice()+" " +getFlavor()+" " + vitamin;
    }
}
