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
                System.out.println(sumEven + "   " +count);
            } else if (Math.abs(count) % 2!= 0) {
                sumOdd += count;
            }
            count++;
        } while (count <= maxNum);
        System.out.println("Четные числа: " + sumEven + "\nНечетные числа: " + sumOdd);
    }
}
