//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание1
        byte sweets = 111;
        System.out.println("Значение переменной sweets с типом byte равно " + sweets);
        short cake = 22222;
        System.out.println("Значение переменной cake с типом short равно " + cake);
        int candies = 3333333;
        System.out.println("Значение переменной candies с типом int равно " + candies);
        long lolipop = 44444444L;
        System.out.println("Значение переменной lolipop с типом long равно " + lolipop);
        float pie = 5.55f;
        System.out.println("Значение переменной pie с типом float равно " + pie);
        double pieHalf = 66.666666;
        System.out.println("Значение переменной pieHalf с типом double равно " + pieHalf);

        // Задание2
        float pen = 27.12f;
        long pencil = 987678965549L;
        float stapler = 2.786f;
        short ruler = 569;
        short clips = -159;
        short notebook = 27897;
        byte calendar = 67;


        // Задание3
        byte ЛюдмилаПавловна = 23;
        byte АннаСергеевна = 27;
        byte ЕкатеринаАндреевна = 30;
        int paper = 480 / (ЛюдмилаПавловна + АннаСергеевна + ЕкатеринаАндреевна);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги.");


        // Задание4
        byte time2 = 2;
        byte bootle = 16;
        int productivity = bootle / time2;
        int time20 = 20;
        int productivity20 = productivity * time20;
        System.out.println("За 20 минут машина произвела " + productivity20 + " штук бутылок.");
        int timeDay = 60 * 24;
        int productivityDay = productivity * timeDay;
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок.");
        int time3Day = 60 * 24 * 3;
        int productivity3Day = productivity * time3Day;
        System.out.println("За 3 суток машина произвела " + productivity3Day + " штук бутылок.");
        int timeMonthJanuary = 60 * 24 * 31;
        int productivityMonthJanuary = productivity * timeMonthJanuary;
        System.out.println("За январь месяц машина произвела " + productivityMonthJanuary + " штук бутылок.");


        // Задание5
        byte jars = 120;
        byte white = 2;
        byte brown = 4;
        int cabinet = jars / (white + brown);
        int white20 = white * cabinet;
        int brown20 = brown * cabinet;
        System.out.println("В школе, где " + cabinet + " классов, нужно " + white20 + " банок белой краски и " + brown20 + " банок коричневой краски.");


        // Задание6
        int banana5 = 80;
        int milk2 = 105;
        int iceCream2 = 100;
        int egg4 = 70;
        int breakfast = (banana5 * 5 + milk2 * 2 + iceCream2 * 2 + egg4 * 4);
        System.out.println(breakfast);
        float kg = breakfast / 1000f;
        System.out.println(kg);


        // Задание7
        byte weight = 7;
        int weightKg = weight * 1000;
        short loseWeight = 250;
        short loseWeight2 = 500;
        int lose250 = weightKg / loseWeight;
        System.out.println(lose250);
        int lose500 = weightKg / loseWeight2;
        System.out.println(lose500);
        int loseAverage = (lose250 + lose500) / 2;
        System.out.println(loseAverage);


        //Задание8
        int Маша = 67760;
        long Маша10 = Маша + ((Маша / 100) * 10);
        long МашаРазницаГодовая = (Маша10 * 12) - (Маша * 12);
        System.out.println("Маша теперь получает " + Маша10 + " рублей. Годовой доход вырос на " + МашаРазницаГодовая + " рублей.");
        int Денис = 83690;
        int Денис10 = Денис + (Денис / 100 * 10);
        long ДенисРазницаГодовая = (Денис10 * 12) - (Денис * 12);
        System.out.println("Денис теперь получает " + Денис10 + " рублей. Годовой доход вырос на " + ДенисРазницаГодовая + " рублей.");
        int Кристина = 76230;
        int Кристина10 = Кристина + (Кристина / 100 * 10);
        long КристинаРазницаГодовая = (Кристина10 * 12) - (Кристина * 12);
        System.out.println("Кристина теперь получает " + Кристина10 + " рублей. Годовой доход вырос на " + КристинаРазницаГодовая + " рублей.");
    }
}
