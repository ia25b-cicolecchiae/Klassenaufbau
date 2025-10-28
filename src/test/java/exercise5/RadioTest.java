package exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio;

    @BeforeEach
    void setUp() {
        radio = new Radio(true, 20, 10.5);
    }


    @Test
    void on() {
        radio.on();
        assertTrue(radio.isOn());
    }

    @Test
    void off() {
        radio.off();
        assertFalse(radio.isOn());
    }

    @Test
    void increaseVolume() {
        radio.increaseVolume();
        assertEquals(21, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.decreaseVolume();
        assertEquals(19, radio.getVolume());
    }

    @Test
    void selectChannel() {
        radio.selectChannel(10);
        assertEquals(10, radio.getFrequency());
    }
}