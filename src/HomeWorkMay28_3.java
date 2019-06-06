public class HomeWorkMay28_3 {

    public static void main(String[] args) {


        HomeWorkMay28_2_ClassPoint[] cls = new HomeWorkMay28_2_ClassPoint[4];

        HomeWorkMay28_2_ClassPoint one = new HomeWorkMay28_2_ClassPoint(3);
        HomeWorkMay28_2_ClassPoint two = new HomeWorkMay28_2_ClassPoint;
        HomeWorkMay28_2_ClassPoint three = new HomeWorkMay28_2_ClassPoint;
        HomeWorkMay28_2_ClassPoint four = new HomeWorkMay28_2_ClassPoint;


        cls[0] = one;
        cls[1] = two;
        cls[2] = three;
        cls[3] = four;

        int[] myArray = new int[4];
        myArray[0] = 44;
        myArray[1] = 57;
        myArray[2] = 38;
        myArray[3] = 123;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println(myArray[i]);
            }

        }
}
