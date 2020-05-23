import java.util.ArrayList;

public class Restaurant extends ArrayList{

    private ArrayList<Customer> customerList = new ArrayList<>();
    private Customer front;
    private Customer rear;

    public Restaurant(){}

    public void enqueue (Customer c){
        if(size() == 0){
            customerList.add(c);
            front = c;
            rear = c;
        }
        else{
            customerList.add(c);
            rear = c;
        }
    }

    public Customer dequeue(){
        if(size() == 0) {
            return null;
        }
        else if(size() == 1){
            Customer temp = front;
            customerList.remove(temp);
            front = null;
            rear = null;
            return temp;
        }
        else{
            Customer temp = peek();
            customerList.remove(0);
            front = customerList.get(0);
            return temp;
        }
    }

    public Customer peek(){
        return front;
    }

    public int size(){
        return customerList.size();
    }

    public boolean isEmpty(){
        return (size() == 0);
    }

    @Override
    public String toString() {
        String result = "{";
        for(int i = 0; i < customerList.size(); i++){
            if(i == size() -1 ){
                result += customerList.get(i).toString();
            }
            else {
                result += customerList.get(i).toString();
                result += ", ";
            }
        }
        result += "}";
        return result;
    }
}


