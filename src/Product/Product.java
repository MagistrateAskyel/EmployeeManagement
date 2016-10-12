package Product;
/**
 * This is the super class for the product constructor
 */
import java.util.*;
/**
 *
 * @author Lee_G
 */
public class Product 
{
    private String productName, productType;
    private int stock;
    private double productCost;
    private Manufacturer  productManufacturer;
    
    /**
     * This is the product constructor
     * @param productName
     * @param productType
     * @param productCost
     * @param manufacturerName
     * @param manufacturerContact
     * @param manufacturerAddress
     * @param stock 
     */
    public Product (String productName, String productType, double productCost, String manufacturerName, String manufacturerContact, 
                    String manufacturerAddress, int stock)
    {
        this.productName = productName;
        this.productType = productType;
        this.productCost = productCost;
        this.productManufacturer = new Manufacturer(manufacturerName, manufacturerContact, manufacturerAddress);
        this.stock = stock;
    }
    
    /**
     * returns product name
     * @return 
     */
    public String getProductName()
    {
        return this.productName;
    }
    
    /**
     * returns product type
     * @return 
     */
    public String getProductType()
    {
        return this.productType;
    }
    
    /**
     * returns product cost
     * @return 
     */
    public double getProductCost()
    {
        return this.productCost;
    }
    
    /**
     * returns manufacturer information
     * @return 
     */
    public String getManufacturerInformation()
    {
        return this.productManufacturer.toString();
    }
    
    /**
     * returns manufacturer information
     * @return 
     */
    public Manufacturer getManufacturer()
    {
        return this.productManufacturer;
    }
    
    /**
     * returns the stock
     * @return 
     */
    public int getStock()
    {
        return this.stock;
    }
    
    /**
     * sets the product name
     * @param productName 
     */
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    
    /**
     * sets the product type
     * @param productType 
     */
    public void setProductType(String productType)
    {
        this.productType = productType;
    }
    
    /**
     * sets the product cost
     * @param productCost 
     */
    public void setProductCost(Double productCost)
    {
        this.productCost = productCost;
    }
    
    /**
     * sets the manufacturer 
     * @param manufacturerName
     * @param manufacturerContact
     * @param manufacturerAddress
     */
    public void setManufacturer(String manufacturerName,String manufacturerContact,String manufacturerAddress)
    {
        this.productManufacturer = new Manufacturer(manufacturerName, manufacturerContact, manufacturerAddress);
    }
    
    /**
     * sets the stock
     * @param stock 
     */
    public void setStock (int stock)
    {
        this.stock = stock;
    }
    
    /**
     * this gets information on the product
     * @return 
     */
    @Override
    public String toString()
    {
        String productInformation = "";
        
        productInformation += "\nProduct Name:\t\t" + getProductName();
        productInformation += "\nProduct Type:\t\t" + getProductType();
        productInformation += "\nProduct Cost:\t\t$" + getProductCost();
        productInformation += "\nManufacturer Name:\t" + this.productManufacturer.getManufacturerName();
        productInformation += "\nProduct Stock:\t\t" + getStock();
        
        return productInformation;
    }
}
