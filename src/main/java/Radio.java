public class Radio {
    private int currentNumber;
    private int currentVolume;

    public void next() {
        if (currentNumber != 9) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber--;
        } else {
            currentNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}