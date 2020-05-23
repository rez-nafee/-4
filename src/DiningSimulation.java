import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiningSimulation {

    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private int chefs;
    private int duration;
    private double arrivalProb;
    private int maxCustomerSize;
    private int numRestaurants;
    private int customersLost ;
    private int totalServiceTime;
    private int customersServed;
    private int profit;

    public double simulate (int numRestaurants, int maxCustomerSize, double arrivalProb, int chefs, int duration){
        this.numRestaurants = numRestaurants;
        this.maxCustomerSize = maxCustomerSize;
        this.arrivalProb = arrivalProb;
        this.chefs = chefs;
        this.duration = duration;
        return 0.0;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Staring simulator...\n");
        int numRestaurants;
        int maximumCustomers;
        double probability;
        int chefs;
        int simulationUnits;
        String key = "";
        boolean validSimulation = false;
        while (!validSimulation) {
            try {
                System.out.print("Enter a number of restaurants: ");
                numRestaurants = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.print("Enter the maximum number of customers a restaurant can serve: ");
                input.nextLine();
                System.out.print("Enter the arrival probability of a customer: ");
                input.nextLine();
                System.out.println("Enter the number of chefs: ");
                input.nextLine();
                System.out.print("Enter the number of simulation units: ");
                input.nextLine();
                System.out.print("\nSimulation Error: Invalid information given!\n");
            }
            try {
                System.out.println("Enter the maximum number of customers a restaurant can serve: ");
                maximumCustomers = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.print("Enter the arrival probability of a customer: ");
                input.nextLine();
                System.out.print("Enter the number of chefs: ");
                input.nextLine();
                System.out.print("Enter the number of simulation units: ");
                input.nextLine();
                System.out.print("\nSimulation Error: Invalid information given!\n");
                continue;
            }
            try {
                System.out.print("Enter the arrival probability of a customer: ");
                probability = input.nextDouble();
                input.nextLine();
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.print("Enter the number of chefs: ");
                input.nextLine();
                System.out.print("Enter the number of simulation units: ");
                input.nextLine();
                System.out.print("\nSimulation Error: Invalid information given!\n");
                continue;
            }
            try {
                System.out.print("Enter the number of chefs: ");
                chefs = input.nextInt();
                input.nextLine();
            }catch (InputMismatchException ex){
                input.nextLine();
                System.out.print("Enter the number of simulation units: ");
                input.nextLine();
                System.out.print("\nSimulation Error: Invalid information given!\n");
                continue;
            }
            try{
                System.out.print("Enter the number of simulation units: ");
                simulationUnits = input.nextInt();
                input.nextLine();
            }catch (InputMismatchException ex) {
                input.nextLine();
                System.out.print("\nSimulation Error: Invalid information given!\n");
                continue;
            }
            validSimulation = true;
        }
    }

    private int randInt(int minVal, int maxVal){
        return (int) (Math.random() * (maxVal - minVal) + (minVal + 1));
    }


}
