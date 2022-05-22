package ua.lviv.iot.labs5_6.models;

import java.util.List;

public class CircusShow extends AbstractPerformance {
    private int amountOfClowns;

    public CircusShow(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfClowns) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfClowns = amountOfClowns;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + " amountOfClowns";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + amountOfClowns;
    }
}
