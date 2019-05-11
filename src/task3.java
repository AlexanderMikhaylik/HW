public class task3 {

    public static void main (String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("int a: " + 5);
        System.out.println("int b: " + 3);

        a = a+b-(b=a);

        System.out.println();
        System.out.println("modified variable a: " +a);
        System.out.println("modified variable b: " +b);

    }
}
