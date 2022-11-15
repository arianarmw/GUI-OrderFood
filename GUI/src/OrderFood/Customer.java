/* Author 	 : Ariana Rahmawati
 * Date   	 : November 15th 2022
 * Lesson 	 : GUI
 * Course 	 : Object Oriented Programming (OOP)
 * File Name : Customer.java
 */

package OrderFood;

public class Customer {
    private String customerName;
    private String address;
    private Integer phoneNumber;
    
    public Customer(){
        this.customerName = "";
        this.address = "";
        this.phoneNumber = 0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setNoTelepon(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
    
    public boolean isEmpty(){
        return this.getCustomerName().length() == 0 || this.getAddress().length() == 0;
    }
    
    @Override
    public String toString(){
        return "   Name      : " + this.getCustomerName()
                + "\n    Address    : " + this.getAddress()
                + "\n    Phone Number  : " + this.getPhoneNumber();
    }
    
}
