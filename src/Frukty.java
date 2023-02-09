public class Frukty {
private String color;
private int price;
private String flavor;

    public Frukty() {
    }

    public Frukty(String color, int price, String flavor) {
        this.color = color;
        this.price = price;
        this.flavor = flavor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
