package com.swati;

public class Laptop implements Computer {
    // public Laptop() {
    //     System.out.println("Laptop object created");
    // }

    /** (non-Javadoc)
     * @see com.swati.Computer#compile()
     */
    @Override
    public void compile() {
        System.out.println("Compiling using Laptop");
    }
    
}
