import java.util.Arrays;

public class Ticket {
    public static void main(String[] args) {
        // Задание 1: "Счастливый билет"
        /**Cоздаем массив ticketNumber, содержащий цифры шестизначного номера билета.
         *  Затем мы вычисляем сумму первых трех цифр (sumFirstHalf) и сумму последних трех цифр (sumSecondHalf).
         *  Если sumFirstHalf равно sumSecondHalf, то выводим сообщение о счастливом билете, иначе выводим сообщение об обычном билете.**/
        int[] ticketNumber = {1, 2, 3, 4, 5, 6}; // Шестизначный номер билета

        int sumFirstHalf = ticketNumber[0] + ticketNumber[1] + ticketNumber[2]; // Сумма первых трех цифр
        int sumSecondHalf = ticketNumber[3] + ticketNumber[4] + ticketNumber[5]; // Сумма последних трех цифр

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("У вас счастливый билет!");
        } else {
            System.out.println("У вас обычный билет.");
        }

        // Задание 2: Меняем элементы массива String в обратном порядке
        /** Cоздаем массив строк arr и выводим его исходное состояние на консоль.
         * Затем мы используем два указателя left и right, чтобы пройти по массиву с двух сторон
         * и поменять элементы местами. После завершения цикла меняем порядок элементов массива.
         * Затем мы выводим измененный массив на консоль.**/
        String[] arr = {"один", "два", "три", "четыре", "пять"};

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Массив в обратном порядке: " + Arrays.toString(arr));

        // Задание 3: Расчет среднего арифметического элементов массива
        /** Cоздаем массив чисел numbers и с помощью цикла for-each вычисляем их сумму (sum).
         * Затем делим сумму на количество элементов массива (numbers.length) и сохраняем результат в переменной
         * average. Затем выводим среднее арифметическое на консоль.**/
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Среднее арифметическое: " + average);

        // Задание 4: Вывод четных и нечетных чисел
        /**Oбъявляем два метода - printEvenNumbers и printOddNumbers, которые принимают массив чисел
         *  в качестве аргумента. В каждом методе мы используем цикл for-each для перебора всех элементов массива
         *  и проверку на четность или нечетность числа с помощью оператора %. В printEvenNumbers выводим
         *  четные числа, а в printOddNumbers выводим нечетные числа на консоль.**/
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа:");
        printEvenNumbers(nums);

        System.out.println("Нечетные числа:");
        printOddNumbers(nums);
    }

    public static void printEvenNumbers(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
