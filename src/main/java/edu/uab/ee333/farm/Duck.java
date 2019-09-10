/*
 * File: Duck.java
 * Author: David G. Green dgreen@uab.edu
 * Assignment:  farm - EE333 Fall 2019
 * Vers: 1.0.0 09/10/2019 dgg - initial coding
 */

package edu.uab.ee333.farm;

/**
 * Represent a duck
 * 
 * @author David G. Green dgreen@uab.edu
 */
public class Duck {

    private double energyLevel;
    private String friendlyName;
    private final static double ENERGY_TO_MILES = .1;  // MILES/JOULES

    /**
     * Create a duck with specified name and 1. energy level
     * @param name duck's name
     */
    public Duck(String name) {
        this.friendlyName = name;
        energyLevel       = 1.;
    }

    /**
     * Create a duck with specified name and energy level
     * @param name duck's name
     * @param energyLevel initial energy level
     */
    public Duck(String name, double energyLevel ) {
        this.friendlyName = name;
        this.energyLevel  = energyLevel;
    }

    /**
     * get the present energy level of the duck
     * @return energy level
     */
    public double getEnergyLevel() {
        return energyLevel;
    }

    /**
     * set the duck's new energy level
     * @param energyLevel new energy level
     */
    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    /**
     * Model duck flying and expending energy
     * 
     * Assume the duck will fly the minimum of request and distance allowed by
     * available energy.
     * 
     * @param distance in miles desired to fly
     * @return distance flown in miles
     */
    public double fly(double distance) {
        return 0.0;
    }

    /**
     * Provide Duck's friendly name
     * @return friendly name of duck
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Use the friendly name as the toString value along with energy level
     * @return friendly name and energy level
     */
    @Override
    public String toString() {
        return friendlyName + "(" + energyLevel + ")";
    }
    
}
