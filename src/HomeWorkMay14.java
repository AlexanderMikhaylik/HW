public class HomeWorkMay14 {
    static public void main (String[] args){

        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        System.out.println(array[9]);

        double[] array2 = new double[5];
        array2[0] = .4;
        array2[1] = 4.44;
        array2[2] = 4.;
        array2[3] = 4e10;
        array2[4] = 4.444;
        System.out.println(array2[4]);


        byte veriable = -127;
        int veriable2 = 1357911;
        long veriable3 = -8990423;

        /*
        int[] array3 = new int[3];
        array3[0] = veriable;
        array3[1] = veriable2;
        array3[2] = veriable3; не можем вложить переменную Long в массив int, слишком много для него.
        по этому я создам массив double.
        */

        double[] array3 = new double[3];
        array3[0] = veriable;
        array3[1] = veriable2;
        array3[2] = veriable3;
        System.out.println(array3[0]);

        float[][] array4 = {{1, 5, 7}, {6, 8, 9}};
        array4[0][0] = 1.00f;
        array4[0][1] = 7.5f;
        array4[0][2] = 50f;
        array4[1][0] = 25.33f;
        array4[1][1] = 15.909f;
        array4[1][2] = 10f;
        System.out.println(array4[0][0]);










    }
}
