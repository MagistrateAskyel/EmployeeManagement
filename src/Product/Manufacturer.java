/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;

/**
 *
 * @author Lee_G
 */
public class Manufacturer 
{
    private String manufacturerName, manufacturerContactNumber, manufacturerAddress;

    public Manufacturer (String manufacturerName, String manufacturerContactNumber, String manufacturerAddress)
    {
        this.manufacturerName = manufacturerName;
        this.manufacturerContactNumber = manufacturerContactNumber;
        this.manufacturerAddress = manufacturerAddress;
    }
    
    /**
     * returns the manufacturer's name
     * @return 
     */
    public String getManufacturerName()
    {
        return this.manufacturerName;
    }
    
    /**
     * returns manufacturer's contact number
     * @return 
     */
    public String getManufacturerContactNumber()
    {
        return this.manufacturerContactNumber;
    }
    
    /**
     * this gets the manufacturer's address
     * @return 
     */
    public String getManufacturerAddress()
    {
        return this.manufacturerAddress;
    }
    
    /**
     * this sets the manufacturer name
     * @param manufacturerName 
     */
    public void setManufacturerName(String manufacturerName)
    {
        this.manufacturerName = manufacturerName;
    }
    
    /**
     * this sets the manufacturer's contact number
     * @param manufacturerContactNumber 
     */
    public void setManufacturerContactNumber(String manufacturerContactNumber)
    {
        this.manufacturerContactNumber = manufacturerContactNumber;
    }
    
    /**
     * this sets the manufacturer's address
     * @param manufacturerAddress
     */
    public void setManufacturerAddress(String manufacturerAddress)
    {
        this.manufacturerAddress = manufacturerAddress;
    }
    
    /**
     * Returns information about the manufacturer, name, contact, address
     * @return 
     */
    @Override
    public String toString()
    {
        String manufacturerInformation = "";
        
        manufacturerInformation += "\nManufacturer Name:\t\t" + getManufacturerName();
        manufacturerInformation += "\nManufacturer Contact:\t\t" + getManufacturerContactNumber();
        manufacturerInformation += "\nManufacturer Address:\t\t" + getManufacturerAddress();
                
        return manufacturerInformation;
    }
}
