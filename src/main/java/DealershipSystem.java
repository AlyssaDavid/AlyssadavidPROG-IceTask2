/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyss
 */
public class DealershipSystem {
   
    public static void main(String[] args) {
        SalesAgent agent1 = new SalesAgent("Alyssa", "AG001", 15000, 25, 500);
        SalesAgent agent2 = new SalesAgent("David", "AG002", 12000, 10, 400);

        agent1.printReport();
        agent2.printReport();

        double quote = agent1.generateQuote(250000);
        System.out.println("Generated Quote for Vehicle: R" + quote);
    }
}


