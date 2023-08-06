package ru.javamv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setStation(3);
        rad.nextStation();

        int expected = 4;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldNextStationIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(5);
        rad.nextStation();

        int expected = 6;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifCurrentStationIsLast() {
        Radio rad = new Radio();
        rad.setStation(9);
        rad.nextStation();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifCurrentStationIsLastIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(29);
        rad.nextStation();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setStation(3);
        rad.prevStation();

        int expected = 2;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldPrevStationIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(5);
        rad.prevStation();

        int expected = 4;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifCurrentStationIsFirst() {
        Radio rad = new Radio();
        rad.setStation(0);
        rad.prevStation();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifCurrentStationIsFirstIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(0);
        rad.prevStation();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();
        rad.setStation(5);

        int expected = 5;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(7);

        int expected = 7;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifSetStationBelowMin() {
        Radio rad = new Radio();
        rad.setStation(-1);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifSetStationBelowMinIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(-1);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifSetStationAboveMax() {
        Radio rad = new Radio();
        rad.setStation(10);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ifSetStationAboveMaxIfSet() {
        Radio rad = new Radio(30);
        rad.setStation(30);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(67);

        int expected = 67;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ifSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(105);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ifSetVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-3);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(65);
        rad.increaseVolume();

        int expected = 66;

        Assertions.assertEquals(expected, rad.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(57);
        rad.decreaseVolume();

        int expected = 56;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ifIncreaseVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ifDecreaseVolumeBelowMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }
}