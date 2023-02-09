public class Orange extends Frukty{
   private Vitamin vitamin;

    public Orange() {
    }

    public Orange(String color, int price, String flavor, Vitamin vitamin) {
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
