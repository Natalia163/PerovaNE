//Массивы

//1. Дан массив целых чисел. Поменять местами первый и последний элемент и вывести полученный массив.
//
//ПРИМЕР
//На входе (в коде)
//[0, 1, 2, 3, 4, 5]
//На выходе (в консоли)
//[5, 1, 2, 3, 4, 0]
//
//Пояснение: вывести массив в консоль можно командой System.out.println(Arrays.toString(array));
//Если IDEA выделит Arrays красным, то поставить курсор на Array и нажать alt + enter

import java.util.Arrays;

public class HomeWork_4_1 {
    public static void main(String args[]) {
        int massiv1 []; //объявили массив целых чисел с именем massiv1
        massiv1 = new int[6]; // указали количество "ячеек" памяти
        for(int i = 0; i<massiv1.length; i++){     // инициилизировали (наполнили данными) все ячейки массива с помощью цикла for
             massiv1[i] = i*1;
        }
        System.out.println(massiv1[5]+", "+massiv1[1]+", "+massiv1[2]+", "+massiv1[3]+", "+massiv1[4]+", "+massiv1[0]);
    }
}

//        massiv1[0] = 0;  // пример заполнения каждой "ячейки" памяти без цикла
//        massiv1[1] = 1;
//        massiv1[2] = 2;
//        massiv1[3] = 3;
//        massiv1[4] = 4;
//        massiv1[5] = 5;

//        for(int i = 5; i<massiv1.length; i--){ // пример вывода на печать элементов массива с помошью цикла for
//        System.out.println(massiv1[i]);
//        }