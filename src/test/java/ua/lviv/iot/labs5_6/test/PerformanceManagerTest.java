package ua.lviv.iot.labs5_6.test;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs5_6.manager.PerformanceManager;
import ua.lviv.iot.labs5_6.models.AbstractPerformance;
import ua.lviv.iot.labs5_6.models.CircusShow;
import ua.lviv.iot.labs5_6.models.RockBandShow;
import ua.lviv.iot.labs5_6.models.SymphonyOrchestra;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceManagerTest {

    @Test
    void sortByAscendingPriceTest() {
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240,15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zak", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        PerformanceManager manager = new PerformanceManager(list);
        List<AbstractPerformance> sortedByPrice = manager.sortByAscendingPrice();
        for (int i = 1; i < sortedByPrice.size(); i++) {
            if (sortedByPrice.get(i).getAverageTicketPrice() < sortedByPrice.get(i - 1).getAverageTicketPrice())
                fail("List isn`t sorted");
        }

    }

    @Test
    void sortByDescendingPriceTest() {
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240, 15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zak", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        PerformanceManager manager = new PerformanceManager(list);
        List<AbstractPerformance> sortedByPrice = manager.sortByDescendingPrice();
        for (int i = 1; i < sortedByPrice.size(); i++) {
            if (sortedByPrice.get(i).getAverageTicketPrice() > sortedByPrice.get(i - 1).getAverageTicketPrice())
                fail("List isn`t sorted");
        }

    }

    @Test
    void sortByAscendingAmountOfMusiciansTest() {
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240,15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zak", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        PerformanceManager manager = new PerformanceManager(list);
        List<AbstractPerformance> sortedByAmountOfMusicians = manager.sortByAscendingAmountOfMusicians();
        for (int i = 1; i < sortedByAmountOfMusicians.size(); i++) {
            if (sortedByAmountOfMusicians.get(i).getMusicians().size() < (sortedByAmountOfMusicians.get(i - 1).getMusicians().size()))
                fail("List isn`t sorted");

        }
    }

    @Test
    void sortByDescendingAmountOfMusiciansTest() {
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240, 15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zak", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        PerformanceManager manager = new PerformanceManager(list);
        List<AbstractPerformance> sortedByAmountOfMusicians = manager.sortByDescendingAmountOfMusicians();
        for (int i = 1; i < sortedByAmountOfMusicians.size(); i++) {
            if (sortedByAmountOfMusicians.get(i).getMusicians().size() > (sortedByAmountOfMusicians.get(i - 1).getMusicians().size()))
                fail("List isn`t sorted");
        }
    }

    @Test
    void findByPriceTest() {
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240, 15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zak", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        PerformanceManager manager = new PerformanceManager(list);
        List<AbstractPerformance> findByPrice = manager.findByPrice(200);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAverageTicketPrice() == 200 && !findByPrice.contains(list.get(i)))
                fail("Fail");
            if (list.get(i).getAverageTicketPrice() != 200 && findByPrice.contains(list.get(i)))
                fail("Fail");
        }
    }

}