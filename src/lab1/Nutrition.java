package lab1;

import support.cse131.ArgsProcessor;

public class Nutrition {
    public static void main(String[] args) {
        // prompting the user for all of the information about their food item //
        ArgsProcessor ap = new ArgsProcessor(args);
        String name = ap.nextString("What is the name of the food?");
        double carbs = ap.nextDouble("How many carbohydrates are in your food");
        double fat = ap.nextDouble("How many grams of fat are in you food");
        double protein = ap.nextDouble("How many grams of protein are in your food?");
        int statedCals = ap.nextInt("How many calories are in your food");

        // Converting from grams to calories and calculating grams of fiber//
        double caloriesCarbs = 4 * carbs;
        double roundingCarbCal = caloriesCarbs * 10;
        double roundedCarbCal = Math.round(roundingCarbCal)/(double)10;
        double caloriesProtein = 4 * protein;
        double roundingProteinCal = caloriesProtein * 10;
        double roundedProteinCal = Math.round(roundingProteinCal)/(double)10;
        double caloriesFat = 9 * fat;
        double roundingFatCal = caloriesFat * 10;
        double roundedFatCal = Math.round(roundingFatCal)/(double)10;
        double calculateCalories = caloriesCarbs + caloriesProtein + caloriesFat;

        //Fiber Calculations and rounding//
        double caloriesFiber = calculateCalories - statedCals;
        double roundingFiber = caloriesFiber * 10;
        double roundedFiber = Math.round(roundingFiber)/(double)10;
        double gramsFiber = caloriesFiber/4;
        double roundingGrams = gramsFiber * 100;
        double roundedGrams = Math.round(roundingGrams)/(double)100;


        //Calculating percentages of carbs, fats, and protein I then rounded by math.round after multiplying by one thousand//
        double percentCarbs = (caloriesCarbs/statedCals) * 1000;
        double roundedCarbs = Math.round(percentCarbs);
        double percentCarbsRounded = roundedCarbs/10;
        double percentFats = (caloriesFat/statedCals) * 1000;
        double roundedFats = Math.round(percentFats);
        double percentFatsRounded = roundedFats/10;
        double percentProtein = (caloriesProtein/statedCals * 1000);
        double roundedProtein = Math.round(percentProtein);
        double percentProteinsRounded = roundedProtein/10;

        //Boolean is the food low carb or low fat
        boolean lowCarb = percentCarbs <= 25;
        boolean lowFat = percentFats <= 15;

        // Random number and coin flip//
        double random = Math.random();
        boolean heads = random >= .5;

        //Outputting results//
        System.out.println("Snickers has");
        System.out.println(carbs + " grams of carbohydrates = " + roundedCarbCal + " Calories");
        System.out.println(fat + " grams of fat = " + roundedFatCal + " Calories");
        System.out.println(protein + " grams of protein = " + roundedProteinCal + " Calories");
        System.out.println("This food is said to have " + statedCals + " (available) Calories.");
        System.out.println("With " + roundedFiber + " unavailable calories, this food has " + roundedGrams + " grams of fiber.");
        System.out.println("Approximately");
        System.out.println("\t" + percentCarbsRounded + " % of your food is carbohydrates.");
        System.out.println("\t" + percentFatsRounded + " % of your food is fat");
        System.out.println("\t" + percentProteinsRounded + " % of your food is protein");
        System.out.println("This food is acceptable for a low-carb diet? " + lowCarb);
        System.out.println("This food is acceptable for a low-fat diet? " + lowFat);
        System.out.println("By coin flip you should eat this food? " + heads);


    }
}