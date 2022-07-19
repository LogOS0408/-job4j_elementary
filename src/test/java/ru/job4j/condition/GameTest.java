package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void wenTanksThenStartTanks() {
        String in = "tanks";
        String result = Game.menu(in);
        String expected = "Start - tanks";
        assertThat(result).isEqualto(expected);
    }
}