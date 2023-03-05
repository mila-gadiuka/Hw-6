import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Первая задача");
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Вторая задача");
        for (int i = 10; i>0; i--) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Третья задача");
        for (int i = 0; i<=17; i+=2){
            System.out.println(i);
        }
    }
    public static void task4() {
        System.out.println("Четвертая задача");
        for (int i = 10; i>=-10; i--){
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Пятая задача");
        for (int year = 1904; year<=2096; year+=4){
            System.out.println(year + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println("Шестая задача");
        for (int i = 7; i<=98; i+=7){
            System.out.println(i);
        }
    }
    public static void task7() {
        System.out.println("Седьмая задача");
        for (int i = 1; i<=512; i*=2){
            System.out.println(i);
        }
    }
    public static void task8() {
        System.out.println("Восьмая задача");
        int salary = 29000;
        int bank = 0;
        for (int i = 1; i<=12; i++){
            bank=bank+salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank);
        }
    }
    public static void task9() {
        System.out.println("Девятая задача");
        int salary = 29000;
        int bank = 0;
        for (int i = 1; i<=12; i++) {
            bank = bank + bank/100;
            bank = bank + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + bank);
        }
    }
    public static void task10() {
        System.out.println("Десятая задача");
        byte thatWeMultiply = 2;
        int decisionAnswer = 0;
        for (int i = 1; i<=10; i++){
            decisionAnswer = thatWeMultiply * i;
            System.out.println(thatWeMultiply + "*" + i + "=" + decisionAnswer);
        }
    }
}