package HWLesson7;

public class Primary {

    private int a;
    private int b;
    private String strangeValues;

    public void setA(int a) {

        if (a >= 0) {
            this.a = a;
        } else
            System.out.println("That's your bad, dude.");
    }

    public int getA(int a) {
        return a;
    }

    public void setB(int b) {

        if (b >= 0) {
            this.b = b;
        } else
            System.out.println("That's your bad, dude.");
    }

    public int getB(int b) {
        return b;
    }


    public void setStrangeValues(String strangeValues) {
        if (strangeValues != null) {
            this.strangeValues = strangeValues;
        } else
            System.out.println("That's your bad, dude.");
    }

    public String getStrangeValues() {
        return strangeValues;
    }


    Primary() {
    }

    Primary(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void select() {
        System.out.println("Element is selected");
    }

}