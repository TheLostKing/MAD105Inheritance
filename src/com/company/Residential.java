package com.company;

public class Residential extends Employee {
    static double RATE = .0006;
    boolean senior;

    public Residential(String customerName, String customerAddress, String customerPhone, double squareFootage, boolean senior){
        super(customerName, customerAddress, customerPhone, squareFootage);
        setSenior(senior);
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    public boolean getSenior() {
        return senior;
    }

    public double weeklyCharge(){ //calculates weekly charge
        double charge = super.getSquareFootage() * RATE;
        if(senior){ //checks if customer is a senior, if yes gives discount
            charge *= .85;
        }
        System.out.println(RATE);
        return charge;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSenior: " + getSenior() + "\nWeekly Charge: " + weeklyCharge();
    }
}
