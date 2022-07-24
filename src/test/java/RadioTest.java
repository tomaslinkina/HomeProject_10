import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(21, 9);
        radio.setCurrentStation(20);
        assertEquals(radio.getCurrentStation(), 20);

    }

    @Test
    public void shouldNotSetOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.nextStation();


        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNextStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetPrevStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume() + 1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationInTheRange() {
        Radio radio = new Radio(10, 99);
        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());

    }

    @Test

    public void shouldSetCorrectMaxStation() {
        Radio radio = new Radio(20, 76);

        int expected = 19;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }


}

