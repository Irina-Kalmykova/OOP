package ru.netology.javaqa.oop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);  // установка номера радиостанции

        int expected = 5;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(-1);  // установка номера радиостанции ниже мин - не работает

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(2);  // установка мин номера радиостанции
        radio.setMinNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1); // установка номера радиостанции выше мин

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderLastNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8); // установка номера радиостанции ниже макс

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumber() {
        Radio radio = new Radio();
        radio.setMaxNumber();  // установка макс номера радиостанции

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10); // установка номера радиостанции после макс (не работает)

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.next();               // след номер радиостанции выше мин

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAfterMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1); // след номер радиостанции
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.next();               // след номер радиостанции ниже макс

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAfterMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next();              // след номер радиостанции после макс

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.setCurrentNumber(0);  // предыдущий номер радиостанции после мин
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUpperFirstBoundaryNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1); // предыдущий номер радиостанции
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUnderMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8); // предыдущий номер радиостанции ниже макс
        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9); // предыдущий номер радиостанции от макс
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);  // установка громкости

        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);  // установка громкости ниже минимального - не работает

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setMinVolume(); // установка мин громкости

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);  // установка громкости выше мин

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);  // установка громкости ниже макс

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume();  // установка макс громкости

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetUpperMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);  // установка громкости выше макс (не работает!)

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();    // увеличение минимальной громкости

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseFirstVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();    // увеличение громкости выше минимальной

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();     // увеличение громкости ниже максимальной

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();      // увеличение максимальной громкости

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();    // уменьшение громкости ниже минимальной

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUpperMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();    // уменьшение громкости до минимальной

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseUnderMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();     // уменьшение громкости ниже максимальной

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();      // уменьшение максимальной громкости

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}