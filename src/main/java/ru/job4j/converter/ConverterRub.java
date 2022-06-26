package ru.job4j.converter;

public class ConverterRub {
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
            float euro = ru.job4j.converter.Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro ");
            float dollar = ru.job4j.converter.Converter.rubleToDollar(180);
            System.out.println("180 rubles are " + dollar + " dollar");
        }
    }
}