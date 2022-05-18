package ua.lviv.iot.writer;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ua.lviv.iot.models.AbstractPerformance;

import java.io.FileWriter;
import java.util.List;

public class PerformanceWriter {

        @SuppressFBWarnings({"DM_DEFAULT_ENCODING", "DM_DEFAULT_ENCODING"})
        public void writeToFile(List<AbstractPerformance> list) {
            try (FileWriter writer = new FileWriter("result.csv")) {
                writer.write(list.get(0).getHeaders() + "\r\n");
                for (AbstractPerformance m: list) {
                    writer.write(m.toCSV() + "\r\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

