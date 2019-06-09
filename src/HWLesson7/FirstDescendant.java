package HWLesson7;

public class FirstDescendant extends Primary {
    public static void main(String[] args) {

        Primary first = new Primary(10, 15);
        ThirdDescendant third = new ThirdDescendant(30, 300, 3000);
        SecondDescendant second = new SecondDescendant();
        second.setA(100);
        second.setB(1000);

        Primary[] concerns = {first, second, third};

        for (int i = 0; i < concerns.length; i++) {
            concerns[i].select();
        }
    }
}
