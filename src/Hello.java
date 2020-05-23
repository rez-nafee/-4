public class Hello {
    public static void main(String[] args) {
        Restaurant nibba = new Restaurant();
        nibba.enqueue(new Customer());
        nibba.enqueue(new Customer());
        nibba.enqueue(new Customer());
        System.out.println("Enqued Customers: " + nibba);

    }
}