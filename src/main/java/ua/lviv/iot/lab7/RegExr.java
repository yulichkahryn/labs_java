package ua.lviv.iot.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExr {
    public static String text;
    public static String regex;

    public RegExr(String text, String regex) {
        RegExr.text = text;
        RegExr.regex = regex;
    }

    public List<String> missionChecker() {
        List<String> allMissionNumbers = new ArrayList<>();
        List<String> allMissionNames = new ArrayList<>();
        List<String> uniqueMissionNames = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            allMissionNames.add(matcher.group(1));
            allMissionNumbers.add(matcher.group(2));
        }

        for(int i = 0; i < allMissionNumbers.size(); i++){
            int counter = 0;

            for (String allMissionNumber : allMissionNumbers) {
                if (allMissionNumbers.get(i).equals(allMissionNumber)) {
                    counter++;
                }
            }

            if(counter == 1){
                uniqueMissionNames.add(allMissionNames.get(i));
            }
        }

        System.out.println(uniqueMissionNames);
        return uniqueMissionNames;
    }
}
