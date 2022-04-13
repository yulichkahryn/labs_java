package ua.lviv.iot.SecondLab.models;

import java.util.List;

public class SymphonyOrchestra extends AbstractPerformance{
    private int amountOfMusicInstruments;


    public SymphonyOrchestra(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfMusicInstruments) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfMusicInstruments = amountOfMusicInstruments;
    }

    public int getAmountOfMusicInstruments() {
        return amountOfMusicInstruments;
    }

    public void setAmountOfMusicInstruments(int amountOfMusicInstruments) {
        this.amountOfMusicInstruments = amountOfMusicInstruments;
    }
}
