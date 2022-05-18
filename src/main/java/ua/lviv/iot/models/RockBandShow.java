package ua.lviv.iot.models;

import java.util.List;

public class RockBandShow extends AbstractPerformance{
    private int amountOfMusicInstruments;
    private int amountOfSongs;


    public RockBandShow(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfMusicInstruments, int amountOfSongs) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfMusicInstruments = amountOfMusicInstruments;
        this.amountOfSongs = amountOfSongs;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "amountOfMusicInstruments,amountOfSongs";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + amountOfMusicInstruments + "," + amountOfSongs;
    }
}