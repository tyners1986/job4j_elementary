package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when12to4then4() {
        int expected = 4;
        int p = 12;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when30to12then12() {
        int expected = 12;
        int p = 30;
        int k = 12;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}