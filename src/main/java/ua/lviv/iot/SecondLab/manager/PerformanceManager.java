package ua.lviv.iot.SecondLab.manager;

import ua.lviv.iot.SecondLab.models.AbstractPerformance;

import java.util.List;
import java.util.stream.Collectors;

public class PerformanceManager {
    private List<AbstractPerformance> list;

    public PerformanceManager(List<AbstractPerformance> list) {
        this.list = list;
    }

    public List<AbstractPerformance> sortByAscendingPrice(){
        List <AbstractPerformance> sortedList = this.list;
        sortedList.sort((o1, o2) -> Integer.compare(o1.getAverageTicketPrice(), o2.getAverageTicketPrice()));
        return sortedList;
    }

    public List<AbstractPerformance> sortByDescendingPrice(){
        List <AbstractPerformance> sortedList = this.list;
        sortedList.sort((o1, o2) -> -Integer.compare(o1.getAverageTicketPrice(), o2.getAverageTicketPrice()));
        return sortedList;
    }

    public List<AbstractPerformance> sortByAscendingAmountOfMusicians(){
        List<AbstractPerformance> sortedList = list.stream().filter(x -> x.getMusicians() != null).collect(Collectors.toList());
        sortedList.sort(((o1, o2) -> Integer.compare(o1.getMusicians().size(), o2.getMusicians().size())));
        return sortedList;
    }

    public List<AbstractPerformance> sortByDescendingAmountOfMusicians(){
        List<AbstractPerformance> sortedList = list.stream().filter(x -> x.getMusicians() != null).collect(Collectors.toList());
        sortedList.sort(((o1, o2) -> -Integer.compare(o1.getMusicians().size(), o2.getMusicians().size())));
        return sortedList;
    }
}
