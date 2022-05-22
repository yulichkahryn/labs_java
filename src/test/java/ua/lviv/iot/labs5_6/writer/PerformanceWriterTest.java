package ua.lviv.iot.labs5_6.writer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.labs5_6.models.AbstractPerformance;
import ua.lviv.iot.labs5_6.models.CircusShow;
import ua.lviv.iot.labs5_6.models.RockBandShow;
import ua.lviv.iot.labs5_6.models.SymphonyOrchestra;
import ua.lviv.iot.labs5_6.writer.PerformanceWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerformanceWriterTest {

    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    @Test
    void testWriteToFile() {
        PerformanceWriter pw = new PerformanceWriter();
        List<AbstractPerformance> list = new LinkedList<>();
        list.add(new CircusShow(300, 240,15, null, 23));
        list.add(new RockBandShow(30, 20, 300, Arrays.asList("Zahar", "Taras"), 6, 40));
        list.add(new SymphonyOrchestra(200, 40, 400, Arrays.asList("Oleg", "Tymothy", "Iryna", "Roman", "Petro"), 12));
        pw.writeToFile(list);
        try (
                FileReader expectedFR = new FileReader("expected.csv");
                BufferedReader expectedBR = new BufferedReader(expectedFR);
                FileReader actualFR = new FileReader("result.csv");
                BufferedReader actualBR = new BufferedReader(actualFR);
        ) {
            assertEquals(expectedBR.readLine(), actualBR.readLine());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}