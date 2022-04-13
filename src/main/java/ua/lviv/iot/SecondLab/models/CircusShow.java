package ua.lviv.iot.SecondLab.models;

import java.util.List;

public class CircusShow extends AbstractPerformance {
    private int amountOfClowns;


    public CircusShow(int durationInMinutes, int numberOfSits, int averageTicketPrice, List<String> musicians, int amountOfClowns) {
        super(durationInMinutes, numberOfSits, averageTicketPrice, musicians);
        this.amountOfClowns = amountOfClowns;
    }

    public int getAmountOfClowns() {
        return amountOfClowns;
    }

    public void setAmountOfClowns(int amountOfClowns) {
        this.amountOfClowns = amountOfClowns;
    }
}

