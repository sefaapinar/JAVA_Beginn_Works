import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Sefa","Pınar"));
        customers.add(new Customer(1,"İrem","Pınar"));
        customers.add(new Customer(1,"Mira","Pınar"));

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
