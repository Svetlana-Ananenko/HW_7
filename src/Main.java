public class Main {
    public static void main(String[] args) {

        System.out.println("___Задача №1___");
        int monthlyContribution = 15000;
        int amountOfSavings = 0;
        int month = 0;

        while (amountOfSavings <= 2459000) {
            month ++;
            amountOfSavings = amountOfSavings + monthlyContribution; // сумма накоплений + ежемесячный вклад
            amountOfSavings = amountOfSavings + amountOfSavings/100; // сумма накоплений учитывая процент

            System.out.println("Месяц " + month + " , сумма накоплений равна " + amountOfSavings + " рублей");
        }



        System.out.println("___Задача №2___");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number ++;
        }
        System.out.println(" ");

        int number2 = 10;
       for (; number2 > 0; ) {

            System.out.print( number2 + " ");
            number2 --;
        }
        System.out.println(" ");




        System.out.println("___Задача №3___");
        long population = 12_000_000;
        long fertility = 17;
        long mortality = 8;
        int year = 1;

        while (year <= 10) {
            population = population + ((fertility*population)/1000) - ((mortality*population)/1000);
            System.out.println("Год " + year + " , численность населения составляет " + population );
            year ++;
        }




        System.out.println("___Задача №4___");
        long contribution = 15_000;
        long accumulation = contribution;
        int numberMonth = 1;

        while (accumulation <= 12_000_000) {
            accumulation = accumulation + ((accumulation*7)/100);
            System.out.println("Месяц " + numberMonth + " , сумма накоплений составляет: " + accumulation + " руб. ");
            numberMonth ++;
        }




        System.out.println("___Задача №5___");
        long depositAmount = 15_000;
        long amountOfSavingsNew = depositAmount;
        int numberMonthNew = 1;

        while (amountOfSavingsNew <= 12_000_000) {
            amountOfSavingsNew = amountOfSavingsNew + ((amountOfSavingsNew*7)/100);
            if (numberMonthNew % 6 == 0) {
                System.out.println("Месяц " + numberMonthNew + " , сумма накоплений составляет: " + amountOfSavingsNew + " руб. ");
            }
            numberMonthNew ++;
        }



        System.out.println("___Задача №6___");
        long depositAmountNew = 15_000;
        long accumulationNew = depositAmountNew;
        int monthNew = 1;
        int quantityYears = 9;
        int term = quantityYears * 12;

        while (monthNew <= term) {
            accumulationNew = accumulationNew + ((accumulationNew*7)/100);

            if (monthNew % 6 == 0) {
                System.out.println("Месяц " + monthNew + " , сумма накоплений составляет: " + accumulationNew + " руб. ");
            }
            monthNew ++;
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
        int period200YearsAgo = 200;
        int period100YearsAhead = 100;
        int beginningOfReviewPeriod = startingPoint - period200YearsAgo;
        int endOfReviewPeriod = startingPoint + period100YearsAhead;

        for (int i=0; i <= endOfReviewPeriod; i=i+79) {
            if (i >= beginningOfReviewPeriod && i <= endOfReviewPeriod) {
                System.out.println(i);
            }
        }


    }
}