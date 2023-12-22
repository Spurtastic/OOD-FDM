package org.example;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Farmer<Double> numberFarmer = new Farmer<Double>();
       numberFarmer.addProduce(4.5);
//       numberFarmer.addProduce("banana");
        Market market = new Market(new HashMap<Produce, Double>()); // this way you can but you cant do <Produce, ?> because Produce is an interface

        System.out.println(numberFarmer.getProduce(0));
    }
}
