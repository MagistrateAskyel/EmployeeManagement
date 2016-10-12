package General;

import java.util.Calendar;
import java.util.regex.Pattern;

/**
 *
 * @author Lee_G
 */
abstract public class ServiceClass 
{
    /**
     * sends a welcome message
     */
    public static void welcomeMessage()
    {
        System.out.println("Welcome to Chillmart!");
    }
    
    /**
     * sends an intro message
     */
    public static void introMessage()
    {
        System.out.println("Please enter an option(0-6):\n"
        + "1. Create a Hourly Employee.\n"
        + "2. Create a Salary Employee.\n"
        + "3. Create a Commission Employee.\n"
        + "4. Search an Employee\n"
        + "5. Create a Product\n"
        + "6. Search a Product\n"
        + "0. Exit.");
    }
    
    /**
     * tells the user what data to enter
     * @param data 
     */
    public static void inputMessage(String data)
    {
        System.out.println("Please enter " + data + ":");
    }
    
    /**
     * this validates the string
     * @param data
     * @return 
     */
    public static boolean stringChecker(String data)
    {
        data = data.trim();
        return data.isEmpty();
    }
    
    /**
     * returns an error message
     * @param input
     */
    public static void inputErrorMessage(String input)
    {
        System.out.println("Invalid input! " + input + " Press enter to continue.");
    }
    
    /**
     * checks to make sure it's a valid phone number
     * @param data
     * @return 
     */
    public static boolean phoneChecker(String data)
    {
        //validate phone numbers of format "1234567890"
	if (data.matches("\\d{11}")) 
        {
            return false;
        }
	//validating phone number with -, . or spaces
	else if(data.matches("\\d{1}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) 
        {
            return false;
        }
	//validating phone number with extension length from 3 to 5
	else if(data.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) 
        {
            return false;
        }
	//validating phone number where area code is in braces ()
	else if(data.matches("\\d{1}[-\\.\\s]\\(\\d{3}\\)-\\d{3}-\\d{4}")) 
        {
            return false;
        }
	else return true;
		
    }
    
    /**
     * checks to make sure an input is a valid string
     * @param data
     * @return 
     */
    public static boolean intChecker(String data)
    {
        if (ServiceClass.stringChecker(data))
        {
            return true;
        }
        else
        {
        for(int i=0;i<data.length();i++)
            {
               if(i==0 && data.charAt(i) == '-') continue;
               if( !Character.isDigit(data.charAt(i))) return true;
            }
        return false;
        }
    }
    
    /**
     * checks to make sure an input is a valid double 
     * ((from http://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#valueOf-java.lang.String-))
     * @param data
     * @return 
     */
    public static boolean doubleChecker(String data)
    {
        String Digits     = "(\\p{Digit}+)";
        String HexDigits  = "(\\p{XDigit}+)";
        String Exp        = "[eE][+-]?"+Digits;
        String fpRegex    =
            ("[\\x00-\\x20]*"+ 
            "[+-]?(" +        
            "NaN|" +           
            "Infinity|" + "((("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|"+
            "(\\.("+Digits+")("+Exp+")?)|"+ "((" + "(0[xX]" + HexDigits + "(\\.)?)|" +
            "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +
            ")[pP][+-]?" + Digits + "))" +
            "[fFdD]?))" +
            "[\\x00-\\x20]*");

        return !Pattern.matches(fpRegex, data);
    }
    
    /**
     * checks to make sure the year a user inputs is valid
     * @param data
     * @return 
     */
    public static boolean yearChecker(String data)
    {
        Calendar now = Calendar.getInstance();
        int minYears = now.get(Calendar.YEAR) - 16;
        int maxYears = now.get(Calendar.YEAR) - 65;
        
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int inputData = Integer.parseInt(data);
            
            return !(inputData <= minYears && inputData >= maxYears);
        }
    }
    
    /**
     * checks to make sure the month the user inputs is valid
     * @param data
     * @return 
     */
    public static boolean monthChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int num = Integer.parseInt(data);
            
            return !(num >= 1 && num <= 12);
        }
    }
    
    /**
     * checks to make sure the day the user inputs is valid
     * @param data
     * @return 
     */
    public static boolean dayChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int num = Integer.parseInt(data);
            
            return !(num >= 1 && num <= 31);
        }
    }
    
    /**
     * checks to make sure the hourly rate the user inputs is valid
     * @param data
     * @return 
     */
    public static boolean hourlyRateChecker(String data)
    {
        if(ServiceClass.doubleChecker(data))
        {
            return true;
        }
        else
        {
            double dataInput = Double.parseDouble(data);
            
            return dataInput <= 0;
        }
    }
    
    /**
     * informs the user they are successful
     * @param data 
     */
    public static void successMessage(String data)
    {
        System.out.println("You have successfully entered a new " + data + "!");
    }
    
    /**
     * menu to the user for search employee
     */
    public static void searchEmployeeMessage()
    {
        System.out.println("Please enter an Employee Search option(0-4):\n"
        + "1. First Name.\n"
        + "2. Last Name.\n"
        + "3. Employee Number.\n"
        + "4. Position\n"
        + "0. Return.");
    }
    
    /**
     * checks to make sure that it's a valid money double
     * @param data
     * @return 
     */
    public static boolean moneyChecker(String data)
    {
        if(ServiceClass.doubleChecker(data))
        {
            return true;
        }
        else
        {
            double dataInput = Double.parseDouble(data);
            
            return dataInput <= 0;
        }
    }

    /**
     * gives user the product search menu
     */
    public static void searchProductMessage()
    {
        System.out.println("Please enter a Product Search option (0-3):\n"
        + "1. Product Name.\n"
        + "2. Product Type.\n"
        + "3. Manufacturer Name.\n"
        + "0. Return.");
    }
    
    /**
     * checks to make sure the search input is valid
     * @param search
     * @return 
     */
    public static boolean searchChecker(String search)
    {
        return search.isEmpty();
    }
    
    /**
     * displays the user's search results
     * @param results 
     */
    public static void displayResults(String results)
    {
        System.out.println(results);
    }
    
    /**
     * validates the hours worked data input
     * @param data
     * @return 
     */
    public static boolean hoursWorkedChecker(String data)
    {
        {
            if(ServiceClass.doubleChecker(data))
            {
                return true;
            }
            else
            {
                double dataInput = Double.parseDouble(data);

                return dataInput <= 0;
            }
        }    
    }
    
    /**
     * validates the SIN
     * @param data
     * @return 
     */
    public static boolean sinChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int numData = Integer.parseInt(data);
            if (numData >= 100000000 && numData <= 999999999)
            {
                return false;
            } else return true;
        }
    }
    
    /**
     * validates the gender input
     * @param data
     * @return 
     */
    public static boolean genderChecker(String data)
    {
        if(ServiceClass.stringChecker(data))
        {
            return true;
        }
        else
        {  
            return !(data.toLowerCase().equals("male") || data.toLowerCase().equals("m") || 
                    data.toLowerCase().equals("female") || data.toLowerCase().equals("f"));
        }
    }
    
    /**
     * validates the stock number
     * @param data
     * @return 
     */
    public static boolean stockChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int numData = Integer.parseInt(data);
            return numData < 0;
        }
    }
    
    /**
     * This makes sure the search menu input is valid
     * @param data
     * @return 
     */
    public static boolean firstMenuChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int numData = Integer.parseInt(data);
            return numData < 0 && numData > 6;
        }
    }
    
    /**
     * This makes sure the search menu input is valid
     * @param data
     * @return 
     */
    public static boolean employeeSearchMenuChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int numData = Integer.parseInt(data);
            return numData < 0 && numData > 4;
        }
    }
    
    /**
     * This makes sure the search menu input is valid
     * @param data
     * @return 
     */
    public static boolean productSearchMenuChecker(String data)
    {
        if(ServiceClass.intChecker(data))
        {
            return true;
        }
        else
        {
            int numData = Integer.parseInt(data);
            return numData < 0 && numData > 3;
        }
    }
    
    /**
     * validates the employeeID, making sure it's a number and not negative
     * @param data
     * @return 
     */
    public static boolean employeeIDChecker(String data)
    {
        {
            if(ServiceClass.intChecker(data))
            {
                return true;
            }
            else
            {
                double dataInput = Integer.parseInt(data);

                return dataInput <= 0;
            }
        }    
    }
}
