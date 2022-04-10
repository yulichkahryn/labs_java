package ua.lviv.iot.SecondLab.models;

import java.util.List;

public class RockBandShow extends AbstractPerformance{
    private int amountOfMusicInstruments;
    private int amountOfSongs;


    public RockBandShow(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfMusicInstruments, int amountOfSongs) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfMusicInstruments = amountOfMusicInstruments;
        this.amountOfSongs = amountOfSongs;
    }

    public int getAmountOfMusicInstruments() {
        return amountOfMusicInstruments;
    }

    public void setAmountOfMusicInstruments(int amountOfMusicInstruments) {
        this.amountOfMusicInstruments = amountOfMusicInstruments;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
    }

    public void setAmountOfSongs(int amountOfSongs) {
        this.amountOfSongs = amountOfSongs;
    }
}
