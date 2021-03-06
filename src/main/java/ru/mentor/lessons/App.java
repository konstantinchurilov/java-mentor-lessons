package ru.mentor.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    //============task1.01===============
//    1)Объяви переменные a, b типа int.
//    Сразу же в строке объявления присвой им разные значения.
//    Значениями могут быть любые целые числа.
//    Требования:
//1. Объяви две переменные типа int.
//2. Имена переменных должны быть a и b
//3. Переменным сразу должны быть присвоены значения.
//4. Переменные a и b должны иметь разные значения.
    private int a = 4;
    private int b = 12;

    //============task1.02===============
//    2)Объяви переменную name типа String.
//    Сразу же в строке объявления присвой ей какое-нибудь значение.
//    Выведи на экран переменную name.
//            Требования:
//            1. Объяви переменную типа String.
//            2. Имя переменной должно быть name
//            3. Переменной сразу должно быть присвоено значение.
//            4. Программа должна выводить текст на экран.
//            5. Выведенный текст должен быть значением переменной.
    public static class Task2 {
        public static void main(String[] args) {
            String name = "TestName";
            System.out.println(name);
        }
    }

    //============task1.03===============
//    3)Решить циклом!
//    Напиши программу, которая выводит на экран надпись: «Хочешь - решай задачи, не хочешь - решай нехотя» 16 раз.
//            Требования:
//            1. Программа должна выводить текст.
//            2. Текст должен начинаться с «Хочешь».
//            3. Текст должен заканчиваться на «нехотя».
//            4. Текст должен состоять из 16 строк.
//            5. Выводимый текст должен соответствовать заданию.
    public static class Task3 {
        public static void main(String[] args) {
            String phrase = "«Хочешь - решай задачи, не хочешь - решай нехотя»";
            for (int i = 0; i <= 15; i++) {
                System.out.println(phrase);
            }
        }
    }

    //    ============task1.04===============
//    4)Считаем длину окружности
//    Реализуй метод printCircleLength. Параметр метода - радиус окружности. Метод должен вывести на экран длину
//    окружности, рассчитанной по формуле: L = 2 * Pi * radius. Результат - дробное число (тип double).
//    В качестве значения Pi используй значение 3.14.
//    Требования:
//            1. В методе printCircleLength нужно вывести длину окружности, рассчитанной по формуле: 2 * Pi * radius.
//            2. Метод main должен вызывать метод printCircleLength с параметром 5.
//            3. Метод main не должен вызывать команду вывода текста на экран.
//            4. Программа должна выводить длину окружности с радиусом 5.
    public static class Task4 {
        public static void printCircleLength(int i) {
            System.out.println(2 * 3.14 * i);
        }

        public static void main(String[] args) {
            printCircleLength(5);
        }
    }

    //    ============task1.05===============
//    5)Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
//      Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
//      Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
//      TC = (TF – 32) * 5/9.
//    Пример:
//    В метод convertCelsiumToFahrenheit на вход подается значение 40.
//    Пример вывода:
//            104.0
//    Требования:
//            1. Метод convertCelsiumToFahrenheit(int) должен быть публичным и статическим.
//            2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
//            3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
//            4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия в
//              градусы Фаренгейта и возвращать это число.
//            @
    public static class Task5 {
        public static double convertCelsiumToFahrenheit(int celsius) {
            return celsius / (5.0 / 9.0) + 32;
        }
    }

    //    ============task1.06===============
//    6)Реализуй метод getCountSecondsPassedInCurrentHour(int seconds).
//      Метод на вход принимает целое число секунд, которые прошли с начала
//      текущих суток. Нужно найти количество секунд, прошедших с начала последнего часа,
//      и вернуть это число.
//            Пример:
//    Метод getCountSecondsPassedInCurrentHour вызывается с параметром 12345.
//    Пример вывода:
//            1545
//    Требования:
//            1. Метод getCountSecondsPassedInCurrentHour(int) должен быть публичным и статическим.
//            2. Метод getCountSecondsPassedInCurrentHour должен возвращать значение типа int.
//            3. Метод getCountSecondsPassedInCurrentHour не должен ничего выводить на экран.
//            4. Метод getCountSecondsPassedInCurrentHour должен правильно возвращать количество секунд, прошедших с начала последнего часа.

    public static class Task6 {
        public static int getCountSecondsPassedInCurrentHour(int seconds) {
            return seconds % 3600;
        }
    }
//    ============task1.07===============
//    7)Амиго, сегодня наша задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды
//      нужно для заполнения бассейна до бортов. Известно, что бассейн имеет линейные размеры a х b x c,
//      заданные в метрах.
//    Эти размеры передаются в метод getVolume. Метод должен вернуть количество литров воды, которое
//    нужно для наполнения бассейна.
//    Пример:
//    Метод getVolume вызывается с параметрами 25, 5, 2.
//    Пример вывода:
//            250000
//    Требования:
//            1. Метод getVolume(int, int, int) должен быть публичным и статическим.
//            2. Метод getVolume(int, int, int) должен возвращать значение типа long.
//            3. Метод getVolume(int, int, int) не должен ничего выводить на экран.
//            4. Метод
//    getVolume(int, int, int) должен правильно возвращать количество воды, которое необходимо для наполнения бассейна в литрах.

    public static class Task7 {
        public static long getVolume(int x, int y, int c) {
            return (long) x * y * c * 1000;
        }
    }

//    ============task1.08===============
//    8)Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат
//    этого числа (a * a).
//    Внимательно просмотри лекцию. Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.
//    Требования:
//            1. Программа должна выводить текст.
//            2. В программе необходимо создать объект типа Scanner.
//            3. Программа должна считывать данные с клавиатуры.
//            4. Программа должна выводить квадрат считанного числа.

    public static class Task8 {
        public static void showSquareOfNumber() {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println(calculateSquareNumber(i));
        }

        private static int calculateSquareNumber(int number) {
            return number * number;
        }

        public static void main(String[] args) {
            showSquareOfNumber();
        }
    }

    //    ============task1.09===============
//    9)Напиши программу, которая считывает с клавиатуры строку и выводит её на экран.
//     Для этого воспользуйтесь классом Scanner (для чтение данных с клавиатуры).
    public static class Task9 {
        public static void readShowLine() {
            Scanner scanner = new Scanner(System.in);
            String line;
            while ((line = scanner.nextLine()) != null) {
                System.out.println(line);
            }
        }
    }

    //    ============task2.01===============
//1) Прочитайте из консоли Scanner’ом строку, определите кол-во символов в строке,
//    выведите на экран кол-во символов.
//    И добавьте в строку слово “java” и выведете её на экран.

    public static class Task11 {
        public static void readStringToConsole() {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            System.out.println("Number of characters: " + countStringLength(line));
            System.out.println(line + "java");
        }

        private static int countStringLength(String str) {
            return str.length();
        }

        public static void main(String[] args) {
            readStringToConsole();
        }
    }

    //    ============task2.02===============
//    2) Создай-те класс Human в котором опишите основные свойства человека.
//    А так же реализуйте метод sayHello у человека, который выводит “Привет” на экран.
//    Создайте 10 экземпляров человека, добавьте их в массив. И с помощью цикла у каждого
//    экземпляра человека вызовите метод sayHello
//    @

    public static class Task12 {
        public static class Human {
            private String name;
            private int age;
            private Sex sex;

            public Human(String name, int age, Sex sex) {
                this.name = name;
                this.age = age;
                this.sex = sex;
            }

            public void sayHello() {
                System.out.println("Привет");
            }
        }

        public enum Sex {
            MALE, FEMALE
        }

        public static void main(String[] args) {
            Human[] humans = {
                    new Human("Fedor", 21, Sex.MALE),
                    new Human("Svetlana", 22, Sex.FEMALE),
                    new Human("Stepan", 21, Sex.MALE),
                    new Human("Rita", 22, Sex.FEMALE),
                    new Human("Ivan", 21, Sex.MALE),
                    new Human("Irina", 22, Sex.FEMALE),
                    new Human("Fedor", 21, Sex.MALE),
                    new Human("Svetlana", 22, Sex.FEMALE),
                    new Human("Max", 21, Sex.MALE),
                    new Human("Elena", 22, Sex.FEMALE)
            };
            for (Human human : humans) {
                human.sayHello();
            }
        }
    }
    //    ============task2.03===============
    //3) Прочитайте из консоли BuffereReader’ом массив чисел переданных через запятую в одну строку.
    // Из этого массива выведете только чётный.

    public static class Task1301{
        public static void printEvenNumber() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] strings = br.readLine().split(",");
            int[] numbers = convertStringToIntArr(strings);
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }

        private static int[] convertStringToIntArr(String[] strings) {
            int[] integers = new int[strings.length];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = Integer.parseInt(strings[i]);
            }
            return integers;
        }

        public static void main(String[] args) throws IOException {
            Task1301.printEvenNumber();
        }
    }

    public static class Task13 {
        public static void start() throws IOException {
            int[] integers = convertStringToInt(parseString(readFromConsole()));
            printEvenNumber(integers);
        }

        private static String readFromConsole() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }

        private static String[] parseString(String str) {
            return str.split(",");
        }

        private static int[] convertStringToInt(String[] strings) {
            int[] integers = new int[strings.length];
            for (int i = 0; i < integers.length; i++) {
                integers[i] = Integer.parseInt(strings[i]);
            }
            return integers;
        }

        private static void printEvenNumber(int[] numbers) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }

        public static void main(String[] args) throws IOException {
            Task13.start();
        }
    }
    //    ============task2.04===============
//        4) Реализуйте метод, который находит минимум из 4-ёх чисел (для этого он должен использовать
//          другой метод, написанный вами, который находит минимум из двух чисел)

    public static class Task14 {
        public static int findMinOfFourNumber(int n1, int n2, int n3, int n4) {
            int min1 = findMin(n1, n2);
            int min2 = findMin(n3, n4);
            return min1 < min2 ? min1 : min2;
        }

        private static int findMin(int n1, int n2) {
            return n1 < n2 ? n1 : n2;
        }

        public static void main(String[] args) {
            System.out.println(findMinOfFourNumber(22, 6, 22211, 7));
        }
    }


}
