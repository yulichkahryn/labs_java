package ua.lviv.iot.SecondLab.models;

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
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
}