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
         
        
        RentACarInterface rentacar = new RentACar();
        
        String contentLine = in.readLine();
        String[] data;
        
        while (contentLine != null){
            
            data = contentLine.split(":");
            
            RentACar car = new RentACar(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            car.setCars(car.getName());
            contentLine = in.readLine();
        }
        
        in.close();
        
    return rentacar;
    }
    
}
