/*
 * File: Pond.java
 * Author: David G. Green dgreen@uab.edu
 * Assignment:  farm - EE333 Fall 2019
 * Vers: 1.0.0 09/10/2019 dgg - initial coding
 */

package edu.uab.ee333.farm;

import java.util.ArrayList;
/**
 * The Pond
 * @author David Green dgreen@uab.edu
 */
public class Pond {

    private ArrayList<Duck> ducks;

    /**
     * Create a pond
     */
    public Pond() {
        ducks       = new ArrayList();
    }
    
    /**
     * Get the number of ducks
     * @return number of ducks
     */
    public int getNumberDucks() {
        return ducks.size();
    }

    /**
     * Model a duck visiting the pond
     * @param d is the visiting duck
     */
    public void visited(Duck d) {
        // add a duck d to the pond

        ducks.add(d);
    }
    
    /**
     * Return the ducks in the pond as a string
     * @return string of ducks names separated by spaces
     */
    @Override
    public String toString() {
        String results = "";
        for (int i = 0; i < ducks.size(); i++) {
            results += ducks.get(i) + " ";
        }
        return results;
    }

    /**
     * Remove the duck that has been there the longest from the pond
     * @return the duck that was removed
     */
    public Duck remove() {
        if (ducks.size() > 0)
            return ducks.remove(0);
        else
            return null;
    }
}
