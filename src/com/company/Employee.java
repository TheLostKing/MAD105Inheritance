package com.company;

public class Employee {
    String customerName, customerPhone, customerAddress;
    double squareFootage;

    public Employee(String customerName, String customerAddress, String customerPhone, double squareFootage){
        setCustomerName(customerName);
        setCustomerAddress(customerAddress);
        setCustomerPhone(customerPhone);
        setSquareFootage(squareFootage);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    @Override
    public String toString() {
        return "Customer Name: " + getCustomerName() + "\nCustomer Phone: " + getCustomerPhone() + "\nCustomer Address: " + getCustomerAddress() + "\nSquare Footage: " + getSquareFootage();
    }
}
