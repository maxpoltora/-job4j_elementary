package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot2ThenMinus1() {
        int[] data = new int[] {1, 6, 8, 10};
        int el = 2;
        int res = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(res).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas6Then1() {
        int[] data = new int[] {1, 6, 8, 10};
        int el = 6;
        int res = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(res).isEqualTo(expected);
    }
}