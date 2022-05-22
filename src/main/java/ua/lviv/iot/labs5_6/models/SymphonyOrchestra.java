package ua.lviv.iot.labs5_6.models;

import java.util.List;

public class SymphonyOrchestra extends AbstractPerformance{
    private int amountOfMusicInstruments;


    public SymphonyOrchestra(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfMusicInstruments) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfMusicInstruments = amountOfMusicInstruments;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "amountOfMusicInstruments";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + amountOfMusicInstruments;
    }
}