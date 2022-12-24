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


    }

public static void task1() {

   int x = 10;
       System.out.println("значение переменной с типом int равно " + x );
   byte horses = 50;
       System.out.println("значение переменной с типом byte равно " + horses );
   short warriors = 10000;
       System.out.println("значение переменной с типом short равно " + warriors );
   long animals = 500000000;
       System.out.println("значение переменной с типом long равно " + animals );
    }
public static void task2() {

    float b = 27.12f;
       System.out.println(b);
    long e = 987678965549L;
       System.out.println(e);
    float r = 2.786f;
       System.out.println(r);
    short h = 569;
       System.out.println(h);
    short k = -159;
       System.out.println(k);
    short y = 27897;
       System.out.println(y);
    byte i = 67;
       System.out.println(i);
    }
    public static void task3() {

    byte lyudmila = 23;
    byte anna = 27;
    byte Ekaterina = 30;
    short paper = 480;
    byte totalStudents = (byte) (lyudmila + anna + Ekaterina);
    byte eachPapers = (byte) (paper / totalStudents);
        System.out.println("на каждого ученика расчитано " + eachPapers + " листов бумаги");
    }
    public static void task4() {

    byte products = 16;
    byte productsHour = 2;
    byte minutes = 20;
    byte day = 1;
    byte days = 3;
    byte month = 1;
    short bottlesHour = (short) (60 / productsHour * products);// бутылок изготовит за час
    short operationMachine1 = (short) (minutes / productsHour  * products);
        System.out.println("за " + minutes + " минут машина произвела " + operationMachine1 + " штук бутылок.");
    short operationMachine2 = (short) (day * 24 * bottlesHour);
        System.out.println("за " + day + " сутки машина произвела " + operationMachine2 + " штук бутылок.");
    int operationMachine3 = days * operationMachine2;
        System.out.println("за " + days + " дня машина произвела " + operationMachine3 + " штук бутылок.");
    int operationMachine4 = month * 31 * operationMachine2;
        System.out.println("за " + month + " месяц машина произвела " + operationMachine4 + " штук бутылок");
    }
    public static void task5() {

    byte whitePaint = 2;
    byte brownPaint = 4;
    byte totalCans = 120;
    byte forOneClass = (byte) ( whitePaint + brownPaint );
    byte totalClasses = (byte) ( totalCans / forOneClass ) ;
    byte needWhite = (byte) ( totalClasses * whitePaint );
    byte needBrown = (byte) ( totalClasses * brownPaint );
        System.out.println ("в школе, где " + totalClasses + " классов, нужно " + needWhite + " банок белой краски и " + needBrown + " банок коричневой краски");
    }
    public static void task6(){

    byte bananas80Gr = 80;
    short weightBananas =(short) (bananas80Gr * 5);
    byte milk105Gr = 105;
    short weightMilk = (short) (milk105Gr * 2);
    byte cream100Gr = 100;
    short weightCream = (short) (cream100Gr * 2);
    byte eggs70Gr = 70;
    short weightEggs = (short) (eggs70Gr * 4);
    short cocktailGr =(short) (weightBananas + weightMilk + weightCream + weightEggs);
        System.out.println ("спортсмен съедает за завтак " + cocktailGr + " грамм");
    short oneKg = 1000;
    double cocktailKg = (double) cocktailGr / oneKg;
        System.out.println ("спортсмен съедает за завтрак " + cocktailKg + " килограмм");}
    public static void task7(){

    byte loseKilo = 7;
    short droppedDay250 = 250;
    short droppedDay500 = 500;
    short oneGr = 1000;
    short resetGram = (short) (loseKilo * oneGr);
    byte days250 = (byte) (resetGram / droppedDay250);
        System.out.println ( days250 + " дней уйдет на похудение, если спортсмен будет терять по " + droppedDay250 + " грамм");
    byte days500 = (byte) (resetGram / droppedDay500);
        System.out.println (days500 + " дней уйдет на похудение, если спортсмен будет терять по " + droppedDay500 + " грамм");
    short averageValue = (short) ((droppedDay250 + droppedDay500) / 2);
    double losingWeight = (double) resetGram / averageValue;
        System.out.println (losingWeight + " дней в средем уйдет, чтобы добиться результата");}
    public static void task8(){

    int masha = 67760;
    int denis = 83690;
    int christina = 76230;
    byte percent = 10;
    byte month =12;
    short promotionMasha = (short) (masha * percent / 100);// повысили зарплату на
    double incomeMasha =  masha + (double) promotionMasha / month;
         System.out.println("Маша теперь получает " + incomeMasha + " рублей. Годовой доход вырос на " + promotionMasha + " рублей.");
    short promotionDenis = (short) (denis * percent / 100);// повысили зарплату на
    double incomeDenis = denis + (double) promotionDenis / month;
         System.out.println("Денис теперь получает " + incomeDenis + " рублей. Годовой доход вырос на " + promotionDenis + " рублей.");
    short promotionChristina = (short) (christina * percent / 100);// повысили зарплату
    double incomeChristina = christina + (double) promotionChristina / month;
        System.out.println("Кристина теперь получает " + incomeChristina + " рублей. Годовой доход вырос на " + promotionChristina + " рублей.");
    }
}

