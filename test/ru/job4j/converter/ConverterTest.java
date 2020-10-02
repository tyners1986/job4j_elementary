package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRub(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 3;
        int expected = 180;
        int out = Converter.dollarToRub(in);
        Assert.assertEquals(expected, out);
    }
}