import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test1() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-4);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();
        radio.setCurrentNumber(12);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);

        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);

        radio.next();
        int expected = 2;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);

        radio.next();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test15() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test16() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test17() {
        Radio radio = new Radio();
        radio.setCurrentVolume(80);
        radio.increaseVolume();
        int expected = 81;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test18() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test19() {
        Radio radio = new Radio();
        radio.setCurrentVolume(90);
        radio.decreaseVolume();
        int expected = 89;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}