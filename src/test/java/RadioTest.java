import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shoudSetStation() { // вкл любую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinStation() { // вкл граничную мин станцию
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxStation() { // вкл граничную макс станцию
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinNoneStation() { // вкл несуществующую мин порога станцию
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxNoneStation() { // вкл несуществующую макс порога станцию
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetNextStation() { // след станция
        Radio radio = new Radio();
        radio.setCurrentNextStation(3);
        int expected = 4;
        int actual = radio.getCurrentNextStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetNextMinStation() { // след 0+1 станция
        Radio radio = new Radio();
        radio.setCurrentNextStation(0);
        int expected = 1;
        int actual = radio.getCurrentNextStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetNextMaxStation() { // след 8+1 станция
        Radio radio = new Radio();
        radio.setCurrentNextStation(8);
        int expected = 9;
        int actual = radio.getCurrentNextStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shoudSetPrevStation() { // предыдущ станция
        Radio radio = new Radio();
        radio.setCurrentPrevStation(3);
        int expected = 2;
        int actual = radio.getCurrentPrevStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetPrevMinStation() { // предыдущ 1-1 станция
        Radio radio = new Radio();
        radio.setCurrentPrevStation(1);
        int expected = 0;
        int actual = radio.getCurrentPrevStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetPrevMaxStation() { // предыдущ 9-1 станция
        Radio radio = new Radio();
        radio.setCurrentPrevStation(9);
        int expected = 8;
        int actual = radio.getCurrentPrevStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetAboveLimitStation() { // след станция после 9
        Radio radio = new Radio();
        radio.setCurrentAboveLimitStation(9);
        int expected = 0;
        int actual = radio.getCurrentAboveLimitStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetAboveLimitVnStation() { // внутри лимита
        Radio radio = new Radio();
        radio.setCurrentAboveLimitStation(7);
        int expected = 8;
        int actual = radio.getCurrentAboveLimitStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetAboveLimiNonetStation() { // след станция после несущ станции
        Radio radio = new Radio();
        radio.setCurrentAboveLimitStation(11);
        int expected = 0;
        int actual = radio.getCurrentAboveLimitStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetBolowLimitStation() { // предыдущ станция перед 0
        Radio radio = new Radio();
        radio.setCurrentBolowLimitStation(0);
        int expected = 9;
        int actual = radio.getCurrentBolowLimitStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetBolowLimitVnStation() { // внутри лимита
        Radio radio = new Radio();
        radio.setCurrentBolowLimitStation(7);
        int expected = 6;
        int actual = radio.getCurrentBolowLimitStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetVolume() { // вкл любой звук
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinVolume() { // вкл мин звук
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMinNoneVolume() { // вкл мин несущ звук
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxVolume() { // вкл макс звук
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetMaxNoneVolume() { // вкл несущ макс звук
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudSetNextVolume() { //след звук
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.nextVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetNextNoneVolume() { //след несущ звук
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetPrevVolume() { // предыдущ звук
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.prevVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudSetPrevNoneVolume() { // предыдущ несущ звук
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}