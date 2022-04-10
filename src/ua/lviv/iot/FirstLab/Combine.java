package ua.lviv.iot.FirstLab;

public record Combine(int volumeOfTheGrainHopper, float fuelConsumption, int enginePower,
                      String color, String brand, int price) {

    public Combine(){
        this(14000, 13.1f, 500, "Purple", "John", 300);
    }

    public Combine(int volumeOfTheGrainHopper, float fuelConsumption, int enginePower){
        this(volumeOfTheGrainHopper, fuelConsumption, enginePower, "Yellow", "Den", 340);
    }

    private static final String countryOfOrigin = "Ukraine";

    public static String getCountryOfOrigin(){
            return "Country of origin is  " + countryOfOrigin;

   }

    @Override
    public String toString(){
        return String.format("Volume of the grain hopper is %d kilograms.\nFuel consumption - %f litres per hectare.\n" +
                "Engine power is %d hp.\nColor is %s.\nCombine's brand is %s.\nAnd the price is %d.", volumeOfTheGrainHopper,
                fuelConsumption, enginePower, color, brand, price);


    }

}

