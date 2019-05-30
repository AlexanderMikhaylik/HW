import java.util.Scanner;

public class HomeWorkMay24_2 {
    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String sentens = scannerObj.nextLine();
        String[] array = sentens.split(" ", 0);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}