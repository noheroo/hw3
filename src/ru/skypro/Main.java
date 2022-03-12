package ru.skypro;

public class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
    }

    public static void exercise1() {
        int clientOS = 1;
        System.out.println("Задача 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке... \n");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...\n");
        }
    }

    public static void exercise2() {
        int clientOS = 0;
        int clientDeviceYear = 2015;
        System.out.println("Задача 2");

        // Что такое вложенноть больше двух этажей? не совсем понятно

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке...\n");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке...\n");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке...\n");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке...\n");
            }
        }
    }

    public static void exercise3() {
        int year = 1988;
        System.out.println("Задача 3");

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным\n");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным\n");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным\n");
        } else {
            System.out.println(year + " год не является високосным\n");
        }
    }

    public static void exercise4() {
        int deliveryDistance = 95;
        int deliveryDays = 0;
        System.out.println("Задача 4");

        //Добавил дополнительную переменную, вроде не запрещено условиями задачи))

        if (deliveryDistance <= 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 3;
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else {
            System.out.println("Слишком далеко!\n");
        }

    }

    public static void exercise5() {
        int monthNumber = 10;
        System.out.println("Задача 5");

        //IDEA предложила сделать вот так:
        //switch (monthNumber) {
        //    case 12, 1, 2  -> System.out.println(monthNumber + " месяц - это зима");
        //    case 3, 4, 5   -> System.out.println(monthNumber + " месяц - это весна");
        //    case 6, 7, 8   -> System.out.println(monthNumber + " месяц - это лето");
        //    case 9, 10, 11 -> System.out.println(monthNumber + " месяц - это осень");
        //    default -> System.out.println("Такого месяца нет");
        //  Я так понимаю это тоже самое, только короче? (почему-то в ваших прмерах не было такой формы записи)
        //  так как такого не было в ваших примерах - закомментил, работает и то, и то

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - это осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }

    public static void exercise6() {
        int age = 19;
        int salary = 58_000;
        float aux;
        int limit;
        int k1;
        float k2=1f;
        System.out.println("\n");
        System.out.println("Задача 6");

        if (age>=23){
            k1=3;
        } else
            k1=2;
        if (salary>=50_000 && salary<80_000){
            k2=1.2f;
        }else if (salary>=80_000){
            k2=1.5f;
        }
        aux=salary*k1*k2;
        limit=(int)aux;  //перевел в int, чтобы не показывалась дробная часть, почему-то иногда показывалась
                         // дробная часть не 0, а например 0,2. почему? не понятно))
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void exercise7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        float base = 1.1f;
        int time = 12;
        int maxPayment = salary / 2;
        float payment;
        System.out.println("\n");
        System.out.println("Задача 7");
        if (age < 23) {
            base = base + 0.01f;
        }
        if (age >= 23 && age < 30) {
            base = base + 0.005f;
        }
        if (salary>80_000){
            base=base-0.007f;
        }
        payment=wantedSum*base/time;
        //тот же вопрос про float, при некоторыхисходных данных выдается значение с лишними 0,002. почему и как с этим бороться?
        System.out.println("Максимальный платеж при зарплате "+salary+" рублей равен "+maxPayment+" рублей. Платеж по кредиту "+payment+" рублей в месяц");
        if (payment<maxPayment){
            System.out.println("Кредит одобрен");
        } else
            System.out.println("В кредите отказано");
    }
}