/*
 * Mizbah Ateeq
 * October 6, 2024
 * COP 3330
 * Assignment 3 - Method Overloading, Comparable and File I/O
 */

public class HalloweenCostumes implements Comparable<HalloweenCostumes> {

	// declare priv instance variables
    private String name;
    private double cost;
    private int wantFactor;
    private int coolness;

    // default constructor
    public HalloweenCostumes() {
        this.name = "Super_Awesome_Costume";
        this.cost = 39.99;
        this.wantFactor = 3;
        this.coolness = 0; 
    }

    // constructor with just name
    public HalloweenCostumes(String name) {
        this.name = name;
        this.cost = 39.99;
        this.wantFactor = 3;
        this.coolness = 0; 
    }

    // constructor with just cost
    public HalloweenCostumes(double cost) {
        this.name = "Super_Awesome_Costume";
        this.cost = cost;
        this.wantFactor = 3;
        this.coolness = 0; 
    }

    // constructor with just wantFactor
    public HalloweenCostumes(int wantFactor) {
        this.name = "Super_Awesome_Costume";
        this.cost = 39.99;
        this.wantFactor = wantFactor;
        this.coolness = 0; 
    }

    // constructor with name and cost
    public HalloweenCostumes(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.wantFactor = 3;
        this.coolness = 0; // Default coolness
    }

    // constructor with name and wantFactor
    public HalloweenCostumes(String name, int wantFactor) {
        this.name = name;
        this.cost = 39.99;
        this.wantFactor = wantFactor;
        this.coolness = 0; 
    }

    // constructor with cost and want factor
    public HalloweenCostumes(double cost, int wantFactor) {
        this.name = "Super_Awesome_Costume";
        this.cost = cost;
        this.wantFactor = wantFactor;
        this.coolness = 0; 
    }

    // constructor with all 3: name, cost, and wantFactor
    public HalloweenCostumes(String name, double cost, int wantFactor) {
        this.name = name;
        this.cost = cost;
        this.wantFactor = wantFactor;
        this.coolness = 0; 
    }

    // calculate coolness
    public void calcCoolness() {
    	
    	// default 0 coolness if cost 0 since can't divide by 0 with formula below
    	if (cost == 0) {
    		coolness = 0; 
    		return; // exit calc coolness function to avoid errors
    	}
    	
    	// coolness formula
        coolness = (int) Math.round((name.length() * wantFactor) / cost);
    }

    // get name
    public String getName() {
        return name;
    }

    // get cost
    public double getCost() {
        return cost;
    }

    // get want factor
    public int getWantFactor() {
        return wantFactor;
    }

    // get coolness
    public int getCoolness() {
        return coolness;
    }

    // compare costumes and sort
    public int compareTo(HalloweenCostumes other) {
        // compare coolness first
        if (this.coolness != other.coolness) {
        	// in descending order
            return Integer.compare(other.coolness, this.coolness); 
        }
        // if coolness same, compare names alphabetically
        return this.name.compareTo(other.name);
    }
}
