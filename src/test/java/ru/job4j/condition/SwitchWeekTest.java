package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void whenDay1thenNameMonday() {
        int in = 1;
        String expected = "Понедельник";
        String result = SwitchWeek.nameOfDay(in);
        assertThat(result).isEqualTo(expected);
    }
}