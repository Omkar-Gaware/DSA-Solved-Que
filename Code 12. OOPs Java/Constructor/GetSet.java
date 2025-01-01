
public class GetSet {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen{
    private String Color;
    private int tip;

    public String getColor() {
        return this.Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public int getTip() {
        return this.tip;
    }
    public void setTip(int tip) {
        this.tip = tip;
    }
}
