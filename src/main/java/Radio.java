public class Radio {
    private int currentStation;
    private int currentVolume;

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        }
        else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        }
        else {
            currentStation = 9;
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

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
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
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
}


