package ua.lviv.iot.lab7.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab7.RegExr;

import java.util.Arrays;
import java.util.List;

public class RegExrTest {
    public static final String text = "Mission 1 was /shuttle/missions/Columbia_1" +
            "Mission 2 was /shuttle/missions/SecretMission_100" +
            "Mission 3 was /shuttle/missions/SecretMission_100" +
            "Mission 4 was  /shuttle/missions/Destroyer_3000" +
            "Mission 5 was /shuttle/missions/Challenger_23" +
            "Mission 6 was /shuttle/missions/NameOfMission_84" +
            "Mission 7 was /shuttle/missions/Atlantis_135";

    public static final String regex = "/shuttle/missions/(\\w+)_(\\d+)";

    public static final List<String> expectedList = Arrays.asList("Columbia", "Destroyer",
            "Challenger", "NameOfMission", "Atlantis");

    @Test
    void missionCheckerTest(){
        RegExr finder = new RegExr(text, regex);
        List<String> actualList;
        actualList = finder.missionChecker();
        for(int i = 0; i < expectedList.size(); i++){
            Assertions.assertEquals(expectedList.get(i),actualList.get(i));
        }
    }
}