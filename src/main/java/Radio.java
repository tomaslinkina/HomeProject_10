public class Radio {
    private int currentStation;
    private int currentVolume;

    private int maxStation = 9;

    private int maxVolume = 99;

    public Radio() {

    }

    public Radio(int stationCount, int volumeLevel) {
        maxStation = stationCount - 1;
        maxVolume = volumeLevel - 1;

    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
}


