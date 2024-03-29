package Lesson_1;


public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int minNum = -10;
        int maxNum = 21;
        int count = minNum;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if (count % 2 == 0) {
                sumEven += count;
            } else if (Math.abs(count) % 2!= 0) {
                sumOdd += count;
            }
            count++;
        } while (count <= maxNum);
        System.out.println("Четные числа: " + sumEven + "\nНечетные числа: " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int max = num1;
        int min = num1;

        if (num2 > max) { //Если второе число больше max => оно становится max
            max = num2;
        } else if (num2 < min) { //Если второе число < min => оно становится min
            min = num2;
        }
        if (num3 > max) { //Если третье число > max => третье число max
            max = num3;
        } else if (num3 < min) { //Если третье число < min => третье число min
            min = num3;
        }
        System.out.println("Максимальное число: " + max); //Вывод максимального числа
        System.out.println("Минимальное число: " + min);//Вывод минимального числа
        System.out.print("Числа в интервале (min, max) в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");//Вивод чисел в интервале (min,max) в обратном порядке
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int number = 1234;
        int reversedNumber = 0;
        int sumOfDigits = 0;

        while (number !=0) {
            int digits = number % 10;//Последняя цифра
            reversedNumber = reversedNumber * 10 + digits;// Формируем обратное число
            sumOfDigits += digits;//Сумма цифр
            number /=10; //Уменьшаем число на один разряд
        }
        System.out.println("Сумма цифр: " + sumOfDigits);
        System.out.println("Число в обратном порядке " + reversedNumber);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int number1 = 1;
        int number2 = 24;
        int counter = 0;

        for (int i = number1; i < number2; i++) {
            System.out.printf("%5d", i); //Вывод числа
            counter++;
            if (counter % 5 == 0 ) {// если 5 символов, начинаем с новой строки
                System.out.println();
            } else if (i == number2 - 1 && counter % 10 <= 5) { //Добавление нулей если остаток <= 5
                System.out.print("    0".repeat(5 - counter % 10));
            } else if (i == number2 - 1 && counter % 10 > 5 && counter % 10 <= 9) { //Добавление нулей если остаток от 5 до 10
                System.out.print("    0".repeat(10 - counter % 10 ));
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int numer = 3242592;
        int chetnSum = 0;
        while (numer > 0) {
            if (numer % 10 == 2) //Проверка крайнего
                chetnSum++;
            numer /= 10;
        }
        String parity = (chetnSum % 2 == 0) ? "четное" : "нечетное";
        System.out.println("В 3242592 " + parity + " количество двоек - " + chetnSum);

        System.out.println("\n6. Отображение геометрических фигур\n");

        int f = 9;
        int f2 = 5;
        for (int j = 0; j < f2; j++) { //цикл в цикле выводит 9 элементов '*' для каждой строчки
            for (int i = 0; i < f  ; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        int k = 5;
        while (k > 0) {
            System.out.println("#".repeat(k)); //цикл повторяет элемент '#' k раз
            k--;// и с каждый последующем шагом цикла уменьшается на 1
        }
        System.out.println("\n");

        int m = 5;
        int rep = 0;
        String str = "$";
        do {
            System.out.println(str.repeat(rep + 1)); // первый цикл записывает '$' по возрастающий до половины m
            rep++;
        } while (rep < (m + 1) / 2 );
        do {
            if (rep == 0) //чтобы не выходить за границы условия while добавляем условие
                break;
            rep--;
            System.out.println(str.repeat(rep));// и выводим в обратном порядке

        }while (rep >= 0);
    }
}