package com.company;

public class Commercial extends Employee {
    String propertyName;
    static double RATE = .0005;
    boolean multiProperty;

    public Commercial(String customerName, String customerAddress, String customerPhone, double squareFootage, String propertyName, boolean multiProperty){
        super(customerName, customerAddress, customerPhone, squareFootage);
        setPropertyName(propertyName);
        setMultiProperty(multiProperty);
    }

    public String getPropertyName() {
        return propertyName;
    }

    public boolean getMultiProperty() {
        return multiProperty;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setMultiProperty(boolean multiProperty) {
        this.multiProperty = multiProperty;
    }

    public double weeklyCharge(){ //calculates weekly charge
       double charge = super.getSquareFootage() * RATE;
       if(multiProperty){ //checks if there are multiple properties and gives the discount if so
           charge *= .9;
       }
       return charge;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProperty Name: " + getPropertyName() + "\nMulti-property: " + getMultiProperty() + "\nWeekly Charge: " + weeklyCharge();
    }
}
