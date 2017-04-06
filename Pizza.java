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
public class Pizza {
    String name;
    String recipe;
    
    public void Pizza() {
    }
    
    public void prepare(){
        System.out.println("Peparing " + name);
    }
    
    public void bake(){
        System.out.println("Baking " + name);
    }
    
    public void cut(){
        System.out.println("Cutting " + name);
    }
    
    public void box(){
        System.out.println("Boxing " + name);
    }
    
    public void ordered() {
        System.out.println("We ordered a " + name);
    }
    
    public void ingredients() {
        System.out.println("---- " + name + " ----");
        System.out.println(recipe);
    }
    
}
