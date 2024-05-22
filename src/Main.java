public class Main {
    public static void main(String[] args) {

        System.out.println("___Задача №1___");
        int summa = 15000;
        int sediments = 0;
        int month = 0;

        while (sediments <= 2459000) {
            month ++;
            sediments = sediments + summa;
            sediments = sediments + sediments/100;

            System.out.println("Месяц " + month + " , сумма накоплений равна " + sediments + " рублей");
        }



        System.out.println("___Задача №2___");
        int chislo = 1;
        while (chislo <= 10) {
            System.out.print(chislo + " ");
            chislo ++;
        }
        System.out.println(" ");

        int chislo2 = 10;
        while (chislo2 > 0) {

            System.out.print( chislo2 + " ");
            chislo2 --;
        }
        System.out.println(" ");




        System.out.println("___Задача №3___");
        long population = 12_000_000;
        long fertility = 17;
        long mortality = 8;
        int year = 1;

        while (year <= 10) {
            long populationAfterYears = population + ((fertility - mortality) * year);
            System.out.println("Год " + year + " , численность населения составляет " + populationAfterYears );
            year ++;
        }




        System.out.println("___Задача №4___");
        long contribution = 15_000;
        long accumulation = contribution;
        int month5 = 1;

        while (accumulation <= 12_000_000) {
            accumulation = accumulation + ((accumulation*7)/100);
            System.out.println("Месяц " + month5 + " , сумма накоплений составляет: " + accumulation + " руб. ");
            month5 ++;
        }




        System.out.println("___Задача №5___");
        long contribution2 = 15_000;
        long accumulation2 = contribution2;
        int month2 = 1;

        while (accumulation2 <= 12_000_000) {
            accumulation2 = accumulation2 + ((accumulation2*7)/100);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " , сумма накоплений составляет: " + accumulation2 + " руб. ");
            }
            month2 ++;
        }



        System.out.println("___Задача №6___");
        long contribution3 = 15_000;
        long accumulation3 = contribution3;
        int month3 = 1;
        int kol_voYears = 9;
        int kol_voMonthInYear = 12;
        int term = kol_voYears * kol_voMonthInYear;

        while (month3 <= term) {
            accumulation3 = accumulation3 + ((accumulation3*7)/100);

            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " , сумма накоплений составляет: " + accumulation3 + " руб. ");
            }
            month3 ++;
        }




        System.out.println("___Задача №7___");
        int firstFriday = 5;
        int maxDayOfMonth = 31;

        while (firstFriday <= maxDayOfMonth) {
            System.out.println("Сегодня пятница, " + firstFriday + " -е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }




        System.out.println("___Задача №8___");
        int startingPoint = 2024;
        int period200 = 200;
        int period100 = 100;
        int beginningOfReviewPeriod = startingPoint - period200;
        int endOfReviewPeriod = startingPoint + period100;

        for (int i=0; i <= endOfReviewPeriod; i=i+79) {
            if (i >= beginningOfReviewPeriod && i <= endOfReviewPeriod) {
                System.out.println(i);
            }
        }


    }
}