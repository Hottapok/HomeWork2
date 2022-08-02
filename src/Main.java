public class Main {
    public static void main(String[] args) {
        //task 1
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1L;
        float e = 1.0f;
        double f = 1;
        char g = 1;
        boolean h = true;

        // task 2
        float firstFighterWeight = 78.2f;
        float secondFighterWeight = 82.7f;
        System.out.println("Суммарный вес бойцов = " + (firstFighterWeight + secondFighterWeight) + "кг");
        System.out.println("Разница между весами бойцов = " + (firstFighterWeight - secondFighterWeight) + "кг");

        // task 3
        int babanas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;

        int weightBananas = babanas * 80;
        float weightMilk = milk * 1.05f;
        int weightIceCream = iceCream * 100;
        int weightEggs = eggs * 70;

        var sumWeight = weightBananas + weightMilk + weightIceCream + weightEggs;

        System.out.println("Общий вес спорт-завтрака в граммах " + sumWeight + "гр");
        System.out.println("Общий вес спорт-завтрака в килограммах " + sumWeight * 0.001f + "кг");

        //task 4
        int excessWeight = 7;
        float firstDiet = 7 / 0.250f;
        float secondDiet = 7 / 0.5f;
        System.out.println("Количество дней на первой диете " + firstDiet);
        System.out.println("Количество дней на второй диете " + secondDiet);
        System.out.println("Колиество дней в среднем " + (firstDiet + secondDiet) / 2);

        //task 5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int newSalaryMasha = salaryMasha + (salaryMasha / 10);
        int newSalaryDenis = salaryDenis + (salaryDenis / 10);
        int newSalaryKristina = salaryKristina + (salaryKristina / 10);
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей."+"Годовой доход вырос на "+((newSalaryMasha*12)-(salaryMasha*12))+" рублей");
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей."+"Годовой доход вырос на "+((newSalaryDenis*12)-(salaryDenis*12))+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryKristina+" рублей."+"Годовой доход вырос на "+((newSalaryKristina*12)-(salaryKristina*12))+" рублей");
    }
}