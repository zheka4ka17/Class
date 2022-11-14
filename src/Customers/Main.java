package Customers;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer customer1= new Customer("Aaa", 100l);
        Customer customer2= new Customer("Cc");
        Customer customer3= new Customer("Bbb");

        Customer[] customers = new Customer[3];
        customers[0]= customer1;
        customers[1]= customer2;
        customers[2]= customer3;

        Comparator<Customer> comparator = (c1, c2) -> c1.getSurname().compareTo(c2.getSurname());
        Arrays.sort(customers, comparator);

        for (Customer customer: customers)
            System.out.println(customer);
    }

}
class Customers{
     private Customer[] customers = new Customer[3];

     public void addCustomer(Customer customer, int index){
         customers[index]= customer;

     }

     public void sort(){

         Comparator<Customer> comparator = (c1, c2) -> c1.getSurname().compareTo(c2.getSurname());
         Arrays.sort(customers, comparator);

     }

    public void print(){
        for (Customer customer:customers)
            System.out.println(customer.toString());
    }
}

