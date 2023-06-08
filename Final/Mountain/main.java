/*
File: Mountain.java
Description: Final
Created: 06/08/2023
Author: Lillian Thacker
mail: lilliat5225@student.vvc.edu.
*/
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mountain> mountainList = new ArrayList<>();

        // Create 7 instances of Mountain objects and put the mountain data
        mountainList.add(new Mountain("Chimborazo", "Ecuador", 20549));
        mountainList.add(new Mountain("Matterhorn", "Switzerland", 14692));
        mountainList.add(new Mountain("Olympus", "Greece (Macedonia)", 9573));
        mountainList.add(new Mountain("Everest", "Nepal", 29029));
        mountainList.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
        mountainList.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
        mountainList.add(new Mountain("Zugspitze", "Switzerland", 9719));

        // Iterate over the mountain list and print out the mountain details
        for (Mountain mountain : mountainList) {
            double elevationFeet = mountain.getElevation();
            double elevationMeters = mountain.toMeters();

            System.out.println("Mountain: " + mountain.getName());
            System.out.println("Country: " + mountain.getCountry());
            System.out.println("Elevation (Feet): " + elevationFeet);
            System.out.println("Elevation (Meters): " + elevationMeters);
            System.out.println("---------------------------");
        }

        // Find the mountain with the minimum elevation
        Mountain shortestMountain = minElevation(mountainList);
        System.out.println("Shortest Mountain:");
        System.out.println("Name: " + shortestMountain.getName());
        System.out.println("Elevation (Feet): " + shortestMountain.getElevation());
        System.out.println("Elevation (Meters): " + shortestMountain.toMeters());
    }

    public static Mountain minElevation(List<Mountain> mountainList) {
        Mountain minMountain = mountainList.get(0);
        for (Mountain mountain : mountainList) {
            if (mountain.getElevation() < minMountain.getElevation()) {
                minMountain = mountain;
            }
        }
        return minMountain;
    }
}

