public class Main {
    public static void main(String[] args) {

        System.out.println("ЗАДАНИЕ 1");
        int salary = 29000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i ++;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей!");
        }

        System.out.println("ЗАДАНИЕ 2");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(i1 + " ");
            i1++;
        }
        System.out.println();
        for (i1 = 10; i1 >= 1; i1--){
            System.out.print(i1+ " ");
        }

        System.out.println();
        System.out.println("ЗАДАНИЕ 3");
        int population = 12_000_000;
        int year = 1;
        while (year <= 10) {
            population = population + 17_000 - 8_000;
            System.out.println("Год " + year +" численность населения составляет " + population + " человек!");
            year++;
        }

        System.out.println("ЗАДАНИЕ 4");
        int total1 = 15_000;
        int month = 0;
        while (total1 <= 12_000_000) {
            total1 = total1 + total1/100*7;
            month++;
            System.out.println("Сумма накопления " + total1 + " за " + month + " месяц(ев)!");
        }

        System.out.println("ЗАДАНИЕ 5");
        int total2 = 15_000;
        int month1 = 0;
        while (total2 <= 12_000_000) {
            total2 = total2 + total2/100*7;
            month1++;
            if (month1 % 6 == 0)
            System.out.println("Сумма накопления " + total2 + " за " + month1 + " месяц(ев)!");
        }

        System.out.println("ЗАДАНИЕ 6");
        int total3 = 15_000;
        int month2 = 0;
        while (month2 <= 108) {
            total3 = total3 + total3/100*7;
            month2++;
            if (month2 % 6 == 0)
                System.out.println("Сумма накопления " + total3 + " за " + month2 + " месяц(ев)!");
        }

        System.out.println("ЗАДАНИЕ 7");
        for (int friday = 3; friday <= 31; friday++) {
            if (friday % 7 == 3)
                System.out.println("Сегодня пятница," +friday+ "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("ЗАДАНИЕ 8");
        int yearComet = 1896;
        while (yearComet <= 2054) {
            if (yearComet % 79 == 0)
                System.out.println(yearComet);
            yearComet++;
        }

        System.out.println("ЗАДАНИЕ 9");
        int total4 = 0;
        for (int n = 1; n <= 10; n++) {
            total4 = 2 * n;
            System.out.println("2 * " + n + " = " + total4);
        }
        System.out.println("КОНЕЦ!");










    }
}