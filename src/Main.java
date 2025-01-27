//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание1
        byte a = 111;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 22222;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 3333333;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 44444444L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5.55f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 66.666666;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задание2
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte n = 67;


        // Задание3
        byte ludmilaPetrovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int paper = 480 / (ludmilaPetrovna + annaSergeevna + ekaterinaAndreevna);
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
        int masha = 67760;
        long masha10 = masha + ((masha / 100) * 10);
        long mashaYear = (masha10 * 12) - (masha * 12);
        System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на " + mashaYear + " рублей.");
        int denis = 83690;
        int denis10 = denis + (denis / 100 * 10);
        long denisYear = (denis10 * 12) - (denis * 12);
        System.out.println("Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на " + denisYear + " рублей.");
        int kristina = 76230;
        int kristina10 = kristina + (kristina / 100 * 10);
        long kristinaYear = (kristina10 * 12) - (kristina * 12);
        System.out.println("kristina теперь получает " + kristina10 + " рублей. Годовой доход вырос на " + kristinaYear + " рублей.");
    }
}
