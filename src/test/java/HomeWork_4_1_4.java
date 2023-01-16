//Массивы
//4. Дан массив из 5 целых чисел. Вывести в консоль результат деления суммы элементов массива на их количество.
//
//ПРИМЕР
//На входе (в коде)
//[1, 2, 3, 4, 5]
//На выходе (в консоле)
//3
public class HomeWork_4_1_4 {
    public static void main(String args[]) {
        int massiv4 [] = {1,2,3,4,5};
        int sum = 0;
        for(int x:massiv4){
            sum = sum+x;
        }
        System.out.println(sum/massiv4.length);
    }
}

//    int massiv4 [];
//        massiv4 = new int[5];
//                massiv4[0] = 1;
//                massiv4[1] = 2;
//                massiv4[2] = 3;
//                massiv4[3] = 4;
//                massiv4[4] = 5;
//                System.out.println((massiv4[0]+massiv4[1]+massiv4[2]+massiv4[3]+massiv4[4])/massiv4.length);