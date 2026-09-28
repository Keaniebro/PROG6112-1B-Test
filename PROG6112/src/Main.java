public class Main {
    // Declarations
    public static void main(String[] args) {
        String[] cities = {"CapeTown","Port Elizabeth","Pretoria"};
        int[][] TotalConsoles = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
        int[] cityTotals = new int [cities.length];
        for (int i = 0; i < cities.length; i++) {
            cityTotals[i] = TotalConsoles[i][0] + TotalConsoles[i][1] + TotalConsoles[i][2];
        }
//Printouts and spacing
        System.out.println("--------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s %-12s %-12s%n","", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-12d %-12d%n", cities[i], TotalConsoles[i][0], TotalConsoles[i][1], TotalConsoles[i][2]);
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------");

        for(int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
        }
        //Calculates the highest
        int highest = cityTotals[0];
        int highestIndex = 0;

        for(int i = 0; i < TotalConsoles.length; i++) {
            if(cityTotals[i] > highest) {
                highest = cityTotals[i];
                highestIndex = i;
            }
        }

        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
    }
}