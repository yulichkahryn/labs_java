package ua.lviv.iot.models;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.List;

public abstract class AbstractPerformance {

    protected int duration;
    protected int numberOfSits;
    protected int averageTicketPrice;
    protected List <String> musicians;

    public AbstractPerformance(int duration, int numberOfSits, int averageTicketPrice, List<String> musicians) {
        this.duration = duration;
        this.numberOfSits = numberOfSits;
        this.averageTicketPrice = averageTicketPrice;
        this.musicians = musicians;
    }

    public int getAverageTicketPrice() {
        return averageTicketPrice;
    }

    public void setAverageTicketPrice(int averageTicketPrice) {
        this.averageTicketPrice = averageTicketPrice;
    }

    public List<String> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<String> musicians) {
        this.musicians = musicians;
    }

    public String getHeaders() {
        return "duration, numberOfSits, averageTicketPrice, musicians";
    }
    public String toCSV() {
        return duration + "," + numberOfSits + "," + averageTicketPrice + "," + musicians;
    }
}