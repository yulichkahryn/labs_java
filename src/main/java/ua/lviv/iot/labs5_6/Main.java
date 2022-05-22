package ua.lviv.iot.labs5_6;

import ua.lviv.iot.labs5_6.manager.PerformanceManager;
import ua.lviv.iot.labs5_6.models.AbstractPerformance;
import ua.lviv.iot.labs5_6.models.CircusShow;
import ua.lviv.iot.labs5_6.models.RockBandShow;
import ua.lviv.iot.labs5_6.models.SymphonyOrchestra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... strings) {

        CircusShow circusShow = new CircusShow(150, 100, 200, null, 7);
        SymphonyOrchestra symphonyOrchestra = new SymphonyOrchestra(100, 250, 300, Arrays.asList("Stefania", "Oksana", "Nata", "Ksenia"), 26);
        RockBandShow rockBandShow = new RockBandShow(120, 125, 100, Arrays.asList("Voh", "Loh", "Anto"), 15, 60);
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(circusShow);
        list.add(symphonyOrchestra);
        list.add(rockBandShow);
        PerformanceManager manager = new PerformanceManager(list);

        System.out.println( manager.sortByDescendingAmountOfMusicians().get(0).getMusicians());
        System.out.println(manager.sortByDescendingAmountOfMusicians().get(1).getMusicians());
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . .");

        System.out.println(manager.sortByAscendingPrice().get(0).getAverageTicketPrice());
        System.out.println(manager.sortByAscendingPrice().get(1).getAverageTicketPrice());
        System.out.println(manager.sortByAscendingPrice().get(2).getAverageTicketPrice());
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . .");

        System.out.println(manager.sortByDescendingPrice().get(0).getAverageTicketPrice());
        System.out.println(manager.sortByDescendingPrice().get(1).getAverageTicketPrice());
        System.out.println(manager.sortByDescendingPrice().get(2).getAverageTicketPrice());
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . .");

        System.out.println(manager.findByPrice(200).get(0).getAverageTicketPrice());
    }

}
