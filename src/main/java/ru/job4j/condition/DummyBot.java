package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rls = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rls = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rls = "До скорой встречи.";
        }
        return rls;
    }

    public static void main(String[] args) {
        String rls = DummyBot.answer("Привет, Бот.");
        System.out.println(rls);
        rls = DummyBot.answer("Пока.");
        System.out.println(rls);
        rls = DummyBot.answer("Сколько будет 2+2 ?");
        System.out.println(rls);

    }
}
