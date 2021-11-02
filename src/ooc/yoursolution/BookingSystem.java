/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Z
 */
public class BookingSystem implements BookingSystemInterface{
    
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
         
        
        System.out.println("Test");
        //ArrayList<String> cars = new ArrayList<String>();
        RentACarInterface car;
        String contentLine = in.readLine();
        String[] data = null;
        List<CarInterface> cars;
        
        while (contentLine != null){
            
            contentLine.split(":");
            car = new RentACar(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            contentLine = in.readLine();
        }
        
        in.close();
        
    return car;
    }
    
}
