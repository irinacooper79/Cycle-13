public class Main {
    public static void main(String[] args) {

        System.out.println("Cycle-1");

        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i <= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i <= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");

        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }

        System.out.println("Задание 9");
        int part = 29000;
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц" + i + "сумма накоплений равна" + sumWithPercent + "рублей");
        }

        System.out.println("Задание 10");
        int cash = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2459000) {
            totalSum += totalSum / 100;
            totalSum += cash;
            i++;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }

        System.out.println("Задание 11");
        int num = 1;
        while (i <= 10) {
            i++;
            System.out.println(i + "");
        }
        for (int k = 10; k <= 1; k--) {
            System.out.println(i);
        }


        System.out.println("Задание 12");
        int people = 12000000;
        int newpeople = 17;
        int dadpeople = 8;
        int different = newpeople - dadpeople;
        for (int year = 1; year <= 10; year++) {
            people += people * different / 1000;
            System.out.println("Год" + i + "Численность населения состава" + people + "людей");
        }


        System.out.println("Задание 13");
        int bak = 15000;
        int allSumme = 12000000;
        i = 0;
        while (allSumme <= 12000000) {
            allSumme += allSumme * 0.07;
            allSumme += bak;
            i++;
            System.out.println("Месяц" + i + "Суммв накоплений равна" + allSumme + "рублей");
        }

        System.out.println("Задание 14");
        while (allSumme <= 12000000) {
            allSumme += allSumme * 0.07;
            i++;
        }
        if (i % 6 == 0) {
            System.out.println("Месяц" + i + "Сумма накоплений равна" + allSumme + "рублей");
        }

        System.out.println("Задание 15");
        while (allSumme <= 12000000) {
            allSumme += allSumme * 0.07;
            allSumme += bak;
            i++;
        }
        for (i = 0; i <= 9; i = i + 6) {
            System.out.println("Месяц" + i + "Сумма накоплений равна" + allSumme + "рублей");
        }

        System.out.println("Задание 16");
        int daysInseptember = 31;
        int firstfriday = 5;
        for (int k = firstfriday; k >= daysInseptember; k = i + 7) {
            if (firstfriday % 6 == 0) {
            }
            System.out.println("Сегодня пятница" + firstfriday + "Число необходимо подготовить отчет");
        }

        System.out.println("Задание 16");
            for (int k = 1822; k <= 2122; k= k+79) {
            if (k % 79 == 0 && k % 100 !=0 || k % 400==0) {
            }
                System.out.println("Комета прилетела в этот год" + k );
            }

            System.out.println("Задание 17");
            int x = 2;
            for (int a = 1; a <= 10; a++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println(a + "х" + j + "=" + (a * j));
                }
            }
        }
    }


