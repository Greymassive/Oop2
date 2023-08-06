package ru.javamv;

public class Radio {
    private int stationCount;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentStation;

    public Radio(int size) {
        stationCount = stationCount + size;
    }

    public Radio() {
        stationCount = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentStation >= stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = 0;
        } else {
            currentStation--;
        }
    }

    public void setStation(int newStation) {
        if (newStation > stationCount - 1) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        currentStation = newStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
