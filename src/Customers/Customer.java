package Customers;

public class Customer {
    private String surname;
    private long number;

    public Customer(String surname, long number) {
        this.surname = surname;
        this.number = number;
    }

    public Customer(String surname) {
        this.surname = surname;
       // this.number= -1;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }
}
