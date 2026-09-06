/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyss
 */

    public class SalesAgent extends Employee implements IVehicleDealer {
    private final int vehiclesSold;
    private final double commissionRate;

    public SalesAgent(String name, String employeeId, double baseSalary, int vehiclesSold, double commissionRate) {
        super(name, employeeId, baseSalary);
        this.vehiclesSold = vehiclesSold;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateCommission() {
        return vehiclesSold * commissionRate;
    }

    @Override
    public double generateQuote(double vehiclePrice) {
        return vehiclePrice * 1.10; // 10% markup
    }

    public void printReport() {
        double commission = calculateCommission();
        double totalEarnings = baseSalary + commission;

        System.out.println("Agent Report:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Base Salary: R" + baseSalary);
        System.out.println("Vehicles Sold: " + vehiclesSold);
        System.out.println("Total Earnings: R" + totalEarnings);

        if (commission > 10000) {
            System.out.println("Top Seller!");
        }
        System.out.println("---------------------------");
    }
}


