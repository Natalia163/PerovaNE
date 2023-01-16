//Массивы
//2. Дан массив из 3 чисел с плавающей точкой. Вывести в консоль сумму, произведение и среднее этих чисел.
//
//ПРИМЕР
//На входе (в коде)
//[1.5, 2.0, 3.5]
//На выходе (в консоле)
//Сумма - 7.0
//Произведение - 10.5
//Среднее -  2.33

public class HomeWork_4_1_2 {
    public static void main(String args[]) {
        double massiv2 [] = {1.5,2.0,3.5};
        double sum = 0;
        for(double x:massiv2) {
            sum = sum + x;
        }
        System.out.println("Сумма - "+sum);

        double mul = 1;
        for(double x:massiv2) {
            mul = mul * x;
        }
        System.out.println("Произведение - "+mul);
        System.out.println("Среднее - "+sum/massiv2.length);

//        System.out.println("Сумма - "+(massiv2[0]+massiv2[1]+massiv2[2]));
//        System.out.println("Произведение - "+massiv2[0]*massiv2[1]*massiv2[2]);
//        System.out.println("Среднее - "+(massiv2[0]+massiv2[1]+massiv2[2])/massiv2.length);
    }
}

//        double massiv2 [];
//        massiv2 = new double[3];
//        massiv2[0] = 1.5;
//        massiv2[1] = 2.0;
//        massiv2[2] = 3.5;
