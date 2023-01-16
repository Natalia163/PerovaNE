//Массивы
//3. Дан массив из 5 символов. Сформировать из данного массива строку, начиная с конца и вывести её в консоль.
//
//ПРИМЕР
//На входе (в коде)
//[‘H’, ‘e’, ‘l’, ‘l’, ‘o’]
//На выходе (в консоле)
//olleH

import java.util.Arrays;

public class HomeWork_4_1_3 {
    public static void main(String args[]) {
        char massiv3[] = {'H', 'e', 'l', 'l', 'o'};
        for (int i = 4; i >= 0; i--) { // пример вывода на печать элементов массива с помошью цикла for
            System.out.println(massiv3[i]);
        }
    }
}
//    char massiv3 [];
//        massiv3 = new char[5];
//                massiv3[0] = 'H';
//                massiv3[1] = 'e';
//                massiv3[2] = 'l';
//                massiv3[3] = 'l';
//                massiv3[4] = 'o';
//        System.out.println(massiv3[4]+","+massiv3[3]+","+massiv3[2]+","+massiv3[1]+","+massiv3[0]);