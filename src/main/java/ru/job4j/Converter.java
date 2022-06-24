package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;

    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result :  " + passed);
        float in2 = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected == out;
        System.out.println("180 rubles are 3. Test result :  " + passed2);

    }

}