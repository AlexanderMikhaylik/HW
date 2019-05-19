public class HomeWorkMay14Task3 {
    public static void main(String[] args) {

        String example = new String(new char[]{'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'});
        char result = example.charAt(0);
        char result2 = example.charAt(9);
        System.out.println("Первый символ строки - " + result);
        System.out.println("Последний символ строки - " + result2);

        String example3 = new String(new char[]{'w', 'o', 'r', 'l', 'd'});
        System.out.println(example3);
        System.out.println(example3.charAt(example3.length() - 2));

        int num = 4;
        int num2 = 5;
        int res = num + ++num + num2 + num--;
        System.out.println(res);

        byte num3 = 127;
        num3--;
        System.out.println(num3);


    }
}
