/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab5;

/**
 *
 * @author wes140031
 */
public class SALab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore pit = new PizzaStore(new SimplePizzaFactory());
        pit.orderPizza("cheese");
        System.out.println("");
        pit.orderPizza("Veggie");
        System.out.println("");
        pit.orderPizza("clam");
        System.out.println("");
        pit.orderPizza("peperoni");
    }
    
}
