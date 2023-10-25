package org.example;

public class IndividualCustomer  extends  Customer{

    private  String firstName;
    private String lastName;

    public IndividualCustomer(){

    }
    public IndividualCustomer(int id, String name , String phone ,String firstName, String lastName){
        super(id,name,phone);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
