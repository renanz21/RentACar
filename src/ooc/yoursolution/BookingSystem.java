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

    List cars = new ArrayList<>();
    
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        String contentLine = in.readLine();
        String[] data = null;
        RentACar c;
        
        while (contentLine != null){
            contentLine.split(":");
            c = new RentACar(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            cars.add(c);
            contentLine = in.readLine();
        }
        
        in.close();
        
    return (RentACarInterface) cars;
    }
    
}
