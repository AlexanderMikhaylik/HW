public class LessonMay14 {

    public static void main(String[] args) {

        char c1 = 'n';

        char letterO = '\u004f'; // Буква '0' в 16 системе (hex)

        char letter_a = '\141'; // Буква 'а' в восьмиричной


        String str2 = "first line\nsecond line";

        String str3 = "\"This is in quotes\"";

        String str4 = "\u004F letter";

        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        int a = 3;
        int b = 5;
        int c = 5;

        boolean result = false;

        // == возвращает true  если переменные равны

        System.out.println();
        result = a == b;
        System.out.println(a + "==" + b + " " + result);
        result = b == c;
        System.out.println(b + "==" + c + " " + result);

        System.out.println();
        result = a != b;
        System.out.println(a + "!=" + b + " " + result);
        result = b !=c;
        System.out.println(b + "!=" + c + " " + result);

        System.out.println();
        result = a >= b;
        System.out.println(a + ">=" + b + " " + result);
        result = b >= c;
        System.out.println(b + ">=" + c + " " + result);

        System.out.println();
        int d = 3;
        System.out.println("d=" + d);

        d++; // инкремент, увелечение на 1, аналогично d = d + 1
        System.out.println("d=" + d);

        d--; // денкремент, уменьшение на 1, аналогично d = d - 1
        System.out.println("d=" + d);

        int i = 55;
        boolean isEven = i % 2 == 0;
        System.out.println("Число " + i + " Четное? " + isEven);

        System.out.println();
        int a1 = i % 2;
        System.out.println(a1);


        System.out.println();
        double res = (double) i / (double) 2;
        System.out.println(res);

        System.out.println();
        double i2 = 55;
        double a2 = 2;
        double res1 = i2 / 2;
        System.out.println(res1);

        System.out.println();
        boolean bool1 = true;
        boolean bool2 = false;
        boolean boolRes = bool1 && bool2;
        System.out.println("Логическое и bool1 = " + bool1 + ", bool2 = " + bool2 + "Результат = " + boolRes);

        System.out.println();
        boolRes = bool1 || bool2;

        System.out.println();
        int[] nums = new int[5]; //выделяет память под 5 элементов массива.


        int[] nums2 = new int[] { 1, 2, 3, 5 }; //инициализация


        System.out.println(nums);
        System.out.println(nums2);

        System.out.println();
        int[] nums3 = new int[4];
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 4;
        nums3[3] = 100;
        System.out.println(nums3[2]); // покажет 4.

        System.out.println();
        short[] example = new short[3];
        example[0] = 100;
        example[1] = 500;
        example[2] = 700;

        System.out.println();
        String[] strArr = new String[4];

        System.out.println(nums3.length); //вывести длину массива.


        //Многомерные массивы
        System.out.println();
        // int[][] nums7 = {{ 0, 1, 2}, {3, 4, 5}}; // двумернный
        int[][] nums7 = {{ 0, 1, 2}, {3, 4, 5}};
        nums7[1][0]=44;

        System.out.println(nums7[1][0]);
//        nums7[2][2]=55;
        System.out.println(nums7[1][2]);

        //Создание строк //array - массив
        System.out.println();

        String strArr1 = "Java";
        String strArr2 = new String(); // empty
        String strArr3 = new String(new char[]
        {'h', 'e', 'l', 'l', 'o'  }); // строка со значением
        String strArr4 = new String("string");
        System.out.println(strArr2);
        System.out.println(strArr3);

        System.out.println();
        String strRes = strArr3 + strArr1;
        System.out.println(strRes);

        System.out.println(strArr3.length());

        //Извлечение символов.
        System.out.println();

        //Вывод последнего символа.
        System.out.println(str3);
        System.out.println("Всего символа: " + str3.length());
        System.out.println(str3.charAt(str3.length()-1)); //символ по индексу
        String subStr = str3.substring(1, str3.length()-1);
        System.out.println(str3);


        System.out.println();
        String s1 = new String ("123") ;
        String s2 = new String ("123") ;

        System.out.println(s1 == s2); //не надо так
        System.out.println(s1.equals(s2)); // вот так сравнивать


        System.out.println();
        String s7 = "abc";
        String s8 = "ABc";
        System.out.println(s7.equalsIgnoreCase(s8)); //сравнение с игнорированием

        System.out.println();
        String uahStr = "17 UAH";
        System.out.println(uahStr.endsWith("UAH"));
        System.out.println(uahStr.endsWith("U"));


        System.out.println();

        int[] mas = new int[3];





















    }


}
