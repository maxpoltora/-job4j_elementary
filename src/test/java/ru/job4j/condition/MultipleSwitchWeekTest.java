package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void whenMondayThen1() {
        String in = "Понедельник";
        int expected = 1;
        int result = MultipleSwitchWeek.numberOfDay(in);
        assertThat(result).isEqualTo(expected);
    }
}