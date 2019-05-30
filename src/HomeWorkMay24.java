public class HomeWorkMay24 {
    public static void main (String[] args){

        int x = 3;
        int y = 4;

        System.out.println(x + y);
        System.out.print(x + "" + y);

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        String[] array = {"я", "хочу", "есть"};
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }
}
