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




    }
}