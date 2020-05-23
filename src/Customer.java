public class Customer {
    private static int totalCustomers = 1;
    private final String[] LIST_OF_FOOD = {"C","S","GC","CT","CW"};
    private final int[] TIME_TO_MAKE = {25,30,15,25,30};
    private final int[] COST_OF_FOOD = {15,25,10,10,20};
    private int orderNumber;
    private String food;
    private int priceOfFood;
    private int timeArrived;
    private int timeToServe;

    public Customer(){
        int randOrder = (int) (Math.random() * 6);
        orderNumber = totalCustomers++;
        food = LIST_OF_FOOD[randOrder];
        priceOfFood = COST_OF_FOOD[randOrder];
        timeToServe = TIME_TO_MAKE[randOrder];
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getPriceOfFood() {
        return priceOfFood;
    }

    public int getTimeArrived() {
        return timeArrived;
    }

    public int getTimeToServe() {
        return timeToServe;
    }

    public static int getTotalCustomers() {
        return totalCustomers;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPriceOfFood(int priceOfFood) {
        this.priceOfFood = priceOfFood;
    }

    public void setTimeArrived(int timeArrived) {
        this.timeArrived = timeArrived;
    }

    public void setTimeToServe(int timeToServe) {
        this.timeToServe = timeToServe;
    }

    public static void setTotalCustomers(int totalCustomers) {
        Customer.totalCustomers = totalCustomers;
    }

    public int[] getCOST_OF_FOOD() {
        return COST_OF_FOOD;
    }

    public int[] getTIME_TO_MAKE() {
        return TIME_TO_MAKE;
    }

    public String[] getLIST_OF_FOOD() {
        return LIST_OF_FOOD;
    }

    @Override
    public String toString() {
        return "[#"+orderNumber+", "+food+", " + timeToServe +" min.]";
    }
}
