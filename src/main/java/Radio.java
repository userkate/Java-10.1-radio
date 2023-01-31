public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int currentNextStation;

    public int getCurrentNextStation() {
        return currentNextStation;
    }

    public void setCurrentNextStation(int newCurrentNextStation) {
        if (newCurrentNextStation < 9) {
            newCurrentNextStation = newCurrentNextStation + 1;
        }
        currentNextStation = newCurrentNextStation;
    }

    public int currentPrevStation;

    public int getCurrentPrevStation() {
        return currentPrevStation;
    }

    public void setCurrentPrevStation(int newCurrentPrevStation) {
        if (newCurrentPrevStation > 0) {
            newCurrentPrevStation = newCurrentPrevStation - 1;
        }
        currentPrevStation = newCurrentPrevStation;
    }

    public int currentAboveLimitStation;

    public int getCurrentAboveLimitStation() {
        return currentAboveLimitStation;
    }

    public void setCurrentAboveLimitStation(int newCurrentAboveLimitStation) {
        if (newCurrentAboveLimitStation < 9) {
            newCurrentAboveLimitStation = newCurrentAboveLimitStation + 1;
        } else {
            newCurrentAboveLimitStation = 0;
        }
        currentAboveLimitStation = newCurrentAboveLimitStation;
    }

    public int currentBolowLimitStation;

    public int getCurrentBolowLimitStation() {
        return currentBolowLimitStation;
    }

    public void setCurrentBolowLimitStation(int newCurrentBolowLimitStation) {
        if (newCurrentBolowLimitStation > 0) {
            newCurrentBolowLimitStation = newCurrentBolowLimitStation - 1;
        } else {
            newCurrentBolowLimitStation = 9;
        }
        currentBolowLimitStation = newCurrentBolowLimitStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextVolume() {
        int plusVolume = currentVolume + 1;
        setCurrentVolume(plusVolume);
    }

    public void prevVolume() {
        int minusVolume = currentVolume - 1;
        setCurrentVolume(minusVolume);

    }
}








