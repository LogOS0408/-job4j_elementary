package ru.job4j.condition;
public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник.";
                break;
            case 2:
                name = "Вторник.";
            case 3:
                name = "Среда.";
                break;
            case 4:
                name = "Четверг.";
                break;
            case 5:
                name = "Пятница.";
                break;
            case 6:
                name = "Суббота.";
                break;
            case 7:
                name = "Воскресенье.";
            default:
                name = "Ошибка ввода данных. Выберите число от 1-го до 7-ми.";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(1));
    }
}