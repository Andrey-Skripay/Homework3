public class Main {
    public static void main(String[] args) {

        int aInt = 27897;
        byte bByte = 67;
        short cShort = -159;
        long dLong = 987678965549L;
        float eFloat = 2.786f;
        double iDouble = 27.12;
        short fShort = 569;

        byte Lyudmila_Palovna = 23;
        byte Anna_Sergeyevna = 27;
        byte Ekaterina_Andreevna = 30;
        int total_students = Lyudmila_Palovna + Anna_Sergeyevna + Ekaterina_Andreevna;
        int total_lists_students  = 480/total_students;
        System.out.println("На каждого ученика рассчитано " + total_lists_students + " листов бумаги." );

        byte machinePerformance1 =16/2; // Производительность машины за 1 минуту
        byte min20 = 20;
        int machinePerformance20 = machinePerformance1 * min20;
        System.out.println("За " + min20 + " минут" + " машина произвела " + machinePerformance20 + " штук бутылок");
        short day = 1440; //количество минут в 1 дне
        long machinePerformanceDay = machinePerformance1 * day;
        System.out.println("За " + day + " минут" + " машина произвела " + machinePerformanceDay + " штук бутылок");
        short day3 = 4320; // количество минут в 3х днях
        long machinePerformanceDay3 = machinePerformance1 * day3;
        System.out.println("За " + day3 + " минут" + " машина произвела " + machinePerformanceDay3 + " штук бутылок");
        long month31day = 44640; //количество минут в 1 месяце
        long machinePerformanceMonth = machinePerformance1 * month31day;
        System.out.println("За " + month31day + " минут" + " машина произвела " + machinePerformanceMonth+ " штук бутылок");



        byte totalCans= 120;
        byte totalCansOfClass = 2+4;
        int totalClasses = totalCans / totalCansOfClass;
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses +" классов, нужно " +  whitePaint + "  банок белой краски и " + brownPaint + " банок коричневой краски.");


        double gramBananas = 0.080 * 5;
        double gramMilk = 0.105 * 2;
        double gramIceCreamSundae = 0.100 * 2;
        double gramEggsRaw = 0.070 * 4;
        double totalWeightInKg = gramBananas + gramMilk + gramIceCreamSundae + gramEggsRaw;
        System.out.println("Вес спортзавтрака " + totalWeightInKg + " в кг");


        int AthleteLosesGram1 = 250;
        int AthleteLosesGram2 = 500;
        int target = 7000;
        int days1 =  target / AthleteLosesGram1;
        int days2 =  target / AthleteLosesGram2;
        int daysOnAverage = (days1 + days2) / 2;
        System.out.println("Чтобы добиться результата похудения, потребуется спортсмену в среднем " + daysOnAverage + " день.");


         int masha = 67760 * 12;// Зарплата за год
         int denis = 83690 * 12;
         int christina = 76230 * 12;

         int salaryIncreaseMasha = masha / 10;//Надбавка за год
         int salaryIncreaseDenis = denis / 10 ;
         int salaryIncreaseChristina = christina / 10;

         int annualncIomeWithASurchargeMasha = masha + salaryIncreaseMasha; // ЗП после повышения за год
         int annualncIomeWithASurchargeDenis = denis + salaryIncreaseDenis;
         int annualncIomeWithASurchargeChristina = christina + salaryIncreaseChristina;

         int differenceMasha = annualncIomeWithASurchargeMasha - masha ;
         int differenceDenis = annualncIomeWithASurchargeDenis - denis ;
         int differenceChristina = annualncIomeWithASurchargeChristina - christina ;

         System.out.println("Маша теперь получает " + annualncIomeWithASurchargeMasha + " рублей в год. Годовой доход вырос на " + differenceMasha + " рублей." );
         System.out.println("Денис теперь получает " + annualncIomeWithASurchargeDenis + " рублей в год. Годовой доход вырос на " + differenceDenis + " рублей." );
         System.out.println("Кристина теперь получает " + annualncIomeWithASurchargeChristina + " рублей в год. Годовой доход вырос на " + differenceChristina + " рублей." );



    }
}