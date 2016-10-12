
package General;
import Product.*;
import Employee.*;
import java.util.*;

/**
 *
 * @author Lee_G
 */
public class Chillmart 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Setting up variables
        ArrayList<Employee> employeeList = new ArrayList();
        ArrayList<Product> productList = new ArrayList();
        Scanner read = new Scanner(System.in);
        String initalizeInput;
        int input = 0;
        boolean keepGoing = true;
        boolean outerCheck = false;
        ServiceClass.welcomeMessage();
        
        //start of program
        while(keepGoing)
        {
            //get menu input
            do
            {
                ServiceClass.introMessage();
                initalizeInput = read.nextLine();
                if(ServiceClass.firstMenuChecker(initalizeInput))
                {
                    ServiceClass.inputErrorMessage("Please enter a number between 0-6");
                    initalizeInput = "";
                    read.nextLine();
                    outerCheck = true;
                } else 
                {
                    input = Integer.parseInt(initalizeInput);
                    outerCheck = false;
                }
            }while(outerCheck);
            
            //Starting the main menu cycle
            if(input >= 0 && input <= 6)
            {
                //create an hourly employee
                if(input == 1)
                {
                    String firstName, lastName, gender, phoneNumber, employeeAddress, title;
                    int employeeNumber = 0, employeeSIN = 0, year = 0, month = 0, day = 0; 
                    double hourlyRate = 0, hoursWorked = 0;

                    boolean innerCheck = false;
                    Scanner innerRead = new Scanner(System.in);

                    //get first name
                    do
                    {
                        ServiceClass.inputMessage("first name");
                        if(ServiceClass.stringChecker(firstName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("First name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get last name
                    do
                    {
                        ServiceClass.inputMessage("last name");
                        if(ServiceClass.stringChecker(lastName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Last name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get gender
                    do
                    {
                        ServiceClass.inputMessage("gender");
                        if(ServiceClass.genderChecker(gender = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Male or Female.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get phone number
                    do
                    {
                        ServiceClass.inputMessage("phone number");
                        if(ServiceClass.phoneChecker(phoneNumber = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Enter a valid phone number.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee address
                    do
                    {
                        ServiceClass.inputMessage("enployee address");
                        if(ServiceClass.stringChecker(employeeAddress = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Address can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee title
                    do
                    {
                        ServiceClass.inputMessage("title");
                        if(ServiceClass.stringChecker(title = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Title can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee number
                    do
                    {
                        ServiceClass.inputMessage("employee number");
                        String inputData = innerRead.nextLine();
                        if(ServiceClass.employeeIDChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee number must be a valid number.");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeNumber = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get employee SIN
                    do
                    {
                        ServiceClass.inputMessage("employee SIN");
                        String inputData = innerRead.nextLine();
                        inputData = inputData.replaceAll("\\s+","");
                        if(ServiceClass.sinChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a proper SIN(9 digits)");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeSIN = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth year
                    do
                    {
                        ServiceClass.inputMessage("birth year");
                        String inputData = innerRead.nextLine();                       
                        if(ServiceClass.yearChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee must be between 16 - 65 years old");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            year = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth month
                    do
                    {
                        ServiceClass.inputMessage("birth month");                        
                        String inputData = innerRead.nextLine();                        
                        if(ServiceClass.monthChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Month must be a number. (1-12)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            month = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth day
                    do
                    {
                        ServiceClass.inputMessage("birth day");                       
                        String inputData = innerRead.nextLine();                       
                        if(ServiceClass.dayChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Day must be a number. (1-31)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            day = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get hourly rate
                    do
                    {
                        ServiceClass.inputMessage("hourly rate");
                        String inputData = innerRead.nextLine();
                        inputData = inputData.replace("$", "");                       
                        if(ServiceClass.hourlyRateChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Hourly rate must be a digit");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            hourlyRate = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get hours worked
                    do
                    {
                        ServiceClass.inputMessage("hours worked");                       
                        String inputData = innerRead.nextLine();                                               
                        if(ServiceClass.hoursWorkedChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Hours worked must be a number.");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            hoursWorked = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    ServiceClass.successMessage("Hourly Employee");
                    
                    //create new Hourly Employee
                    employeeList.add(new HourlyEmployee(firstName, lastName, gender, phoneNumber, employeeAddress, employeeNumber, 
                                   employeeSIN, year, month, day, title, hourlyRate, hoursWorked));    
                }//end of a hourly employee
                //create a salary employee
                else if(input == 2)
                {
                    String firstName, lastName, gender, phoneNumber, employeeAddress, title;
                    int employeeNumber = 0, employeeSIN = 0, year = 0, month = 0, day = 0; 
                    double yearlySalary = 0;

                    boolean innerCheck = false;
                    Scanner innerRead = new Scanner(System.in);

                    //get first name
                    do
                    {
                        ServiceClass.inputMessage("first name");
                        if(ServiceClass.stringChecker(firstName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("First name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get last name
                    do
                    {
                        ServiceClass.inputMessage("last name");
                        if(ServiceClass.stringChecker(lastName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Last name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get gender
                    do
                    {
                        ServiceClass.inputMessage("gender");
                        if(ServiceClass.genderChecker(gender = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Male or Female.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get phone number
                    do
                    {
                        ServiceClass.inputMessage("phone number including area code");
                        if(ServiceClass.phoneChecker(phoneNumber = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Enter a valid phone number.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee address
                    do
                    {
                        ServiceClass.inputMessage("enployee address");
                        if(ServiceClass.stringChecker(employeeAddress = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Address can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee title
                    do
                    {
                        ServiceClass.inputMessage("title");
                        if(ServiceClass.stringChecker(title = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Title can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee number
                    do
                    {
                        ServiceClass.inputMessage("employee number");                        
                        String inputData = innerRead.nextLine();
                        if(ServiceClass.employeeIDChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee number must be a valid number.");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeNumber = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get employee SIN
                    do
                    {
                        ServiceClass.inputMessage("employee SIN");                      
                        String inputData = innerRead.nextLine();                      
                        inputData = inputData.replaceAll("\\s+","");
                        if(ServiceClass.sinChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a proper SIN(9 digits)");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeSIN = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth year
                    do
                    {
                        ServiceClass.inputMessage("birth year");                       
                        String inputData = innerRead.nextLine();                        
                        if(ServiceClass.yearChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee must be between 16 - 65 years old");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            year = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth month
                    do
                    {
                        ServiceClass.inputMessage("birth month");                        
                        String inputData = innerRead.nextLine();                      
                        if(ServiceClass.monthChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Month must be a number.(1-12)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            month = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth day
                    do
                    {
                        ServiceClass.inputMessage("birth day");                        
                        String inputData = innerRead.nextLine();                       
                        if(ServiceClass.dayChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Day must be a number. (1-31)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            day = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get yearly salary
                    do
                    {
                        ServiceClass.inputMessage("yearly salary");                      
                        String inputData = innerRead.nextLine();
                        inputData = inputData.replace("$", "");
                        inputData = inputData.replaceAll("\\s+","");
                        if(ServiceClass.moneyChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Yearly salary must be in digits");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            yearlySalary = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    ServiceClass.successMessage("Salary Employee");
                    
                    //create new Salary Employee
                    employeeList.add(new SalaryEmployee(firstName, lastName, gender, phoneNumber, employeeAddress, employeeNumber, 
                                   employeeSIN, year, month, day, title, yearlySalary));
                }//end of creat a salary employee
                //create a commission employee
                else if(input == 3)
                {
                    String firstName, lastName, gender, phoneNumber, employeeAddress, title;
                    int employeeNumber = 0, employeeSIN = 0, year = 0, month = 0, day = 0; 
                    double grossSales = 0, commissionRate = 0;

                    boolean innerCheck = false;
                    Scanner innerRead = new Scanner(System.in);

                    //get first name
                    do
                    {
                        ServiceClass.inputMessage("first name");
                        if(ServiceClass.stringChecker(firstName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("First name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get last name
                    do
                    {
                        ServiceClass.inputMessage("last name");
                        if(ServiceClass.stringChecker(lastName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Last name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get gender
                    do
                    {
                        ServiceClass.inputMessage("gender");
                        if(ServiceClass.stringChecker(gender = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Male or Female.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get phone number
                    do
                    {
                        ServiceClass.inputMessage("phone number");
                        if(ServiceClass.phoneChecker(phoneNumber = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Enter a valid phone number.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee address
                    do
                    {
                        ServiceClass.inputMessage("enployee address");
                        if(ServiceClass.stringChecker(employeeAddress = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Address can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee title
                    do
                    {
                        ServiceClass.inputMessage("title");
                        if(ServiceClass.stringChecker(title = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Title can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get employee number
                    do
                    {
                        ServiceClass.inputMessage("employee number");                       
                        String inputData = innerRead.nextLine();
                        if(ServiceClass.employeeIDChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee number must be a valid number.");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeNumber = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get employee SIN
                    do
                    {
                        ServiceClass.inputMessage("employee SIN");                       
                        String inputData = innerRead.nextLine();                      
                        inputData = inputData.replaceAll(" ","");
                        if(ServiceClass.sinChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a proper SIN(9 digits)");
                            inputData = "";
                            innerRead.nextLine();
                        } else 
                        {
                            employeeSIN = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth year
                    do
                    {
                        ServiceClass.inputMessage("birth year");                        
                        String inputData = innerRead.nextLine();                        
                        if(ServiceClass.yearChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Employee must be between 16 - 65 years old");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            year = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth month
                    do
                    {
                        ServiceClass.inputMessage("birth month");                       
                        String inputData = innerRead.nextLine();                       
                        if(ServiceClass.monthChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Month must be a number (1-12)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            month = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get birth day
                    do
                    {
                        ServiceClass.inputMessage("birth day");                       
                        String inputData = innerRead.nextLine();                       
                        if(ServiceClass.dayChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Day must be a number (1-31)");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            day = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get gross sales
                    do
                    {
                        ServiceClass.inputMessage("gross sales");
                        
                        String inputData = innerRead.nextLine();
                        inputData = inputData.replace("$", "");
                        
                        if(ServiceClass.moneyChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a number.");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            grossSales = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get commission rate
                    do
                    {
                        ServiceClass.inputMessage("commission rate");
                        
                        String inputData = innerRead.nextLine();
                        inputData = inputData.replace("%", "");
                        
                        if(ServiceClass.moneyChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a number.");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            commissionRate = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    ServiceClass.successMessage("Commission Employee");
                    
                    //create new Commission Employee
                    employeeList.add(new CommissionEmployee(firstName, lastName, gender, phoneNumber, employeeAddress, employeeNumber, 
                                   employeeSIN, year, month, day, title, grossSales, commissionRate));
                }//end of create commission employee
                //Search for an employee
                else if(input == 4)
                {
                    boolean keepGoingEmployeeSearch = true;
                    
                    //Employee search
                    while(keepGoingEmployeeSearch)
                    { 
                        do
                        {
                            ServiceClass.searchEmployeeMessage();
                            initalizeInput = read.nextLine();
                            if(ServiceClass.employeeSearchMenuChecker(initalizeInput))
                            {
                                ServiceClass.inputErrorMessage("Please enter a number between 0-4");
                                initalizeInput = "";
                                read.nextLine();
                                outerCheck = true;
                            } else 
                            {
                                input = Integer.parseInt(initalizeInput);
                                outerCheck = false;
                            }
                        }while(outerCheck);
                                    
                        //checking for proper input
                        if(input >= 0 && input <= 4)
                        {
                            //search by first name
                            if(input == 1)
                            {
                                String firstNameSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("first name search");
                                    
                                    if(ServiceClass.stringChecker(firstNameSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("First name cannot be blank.");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                
                                for (Employee employeeList1 : employeeList) 
                                {
                                    if(employeeList1.getFirstName().equalsIgnoreCase(firstNameSearch))
                                    {
                                    searchList =  "\n" + searchList + employeeList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                
                                ServiceClass.displayResults(searchList);
                                keepGoingEmployeeSearch = false;
    
                            }
                            //search by last name
                            else if(input == 2)
                            {
                                String lastNameSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("last name search");

                                    if(ServiceClass.stringChecker(lastNameSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Last name cannot be blank");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                

                                for (Employee employeeList1 : employeeList) 
                                {
                                    if(employeeList1.getLastName().equalsIgnoreCase(lastNameSearch))
                                    {
                                    searchList =  "\n" + searchList + employeeList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                
                                ServiceClass.displayResults(searchList);
                                keepGoingEmployeeSearch = false;
                            }
                            //search by employee number
                            else if(input == 3)
                            {
                                int employeeNumberSearch = 0;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    String inputData = innerRead.nextLine();
                                    if(ServiceClass.intChecker(inputData))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Employee number must be a number.");
                                        inputData = "";
                                        innerRead.nextLine();
                                    } else 
                                    {
                                        employeeNumberSearch = Integer.parseInt(inputData);
                                        innerCheck = false;
                                    }
                                }while(innerCheck);
                                
                                for (Employee employeeList1 : employeeList) 
                                {
                                    if(employeeList1.getEmployeeNumber() == employeeNumberSearch)
                                    {
                                    searchList =  "\n" + searchList + employeeList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                
                                ServiceClass.displayResults(searchList);
                                keepGoingEmployeeSearch = false;
                            }
                            //search by employee title
                            else if(input == 4)
                            {
                                String titleSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("employee title search");

                                    if(ServiceClass.stringChecker(titleSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Title cannot be blank");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                
                                for (Employee employeeList1 : employeeList) 
                                {
                                    if(employeeList1.getTitle().equals(titleSearch))
                                    {
                                    searchList =  "\n" + searchList + employeeList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                
                                ServiceClass.displayResults(searchList);
                                keepGoingEmployeeSearch = false;
                            }
                            //exit search
                            else if(input == 0)
                            {
                                keepGoingEmployeeSearch = false;
                            }
                        }
                    }
                }//end of search for an employee
                //create a product
                else if(input == 5)
                {
                    String productName, productType, manufacturerName, manufacturerContact, manufacturerAddress;
                    double productCost = 0;
                    int stock = 0;

                    boolean innerCheck = false;
                    Scanner innerRead = new Scanner(System.in);

                    //get product name
                    do
                    {
                        ServiceClass.inputMessage("product name");

                        if(ServiceClass.stringChecker(productName= innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Product name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get product type
                    do
                    {
                        ServiceClass.inputMessage("product type");

                        if(ServiceClass.stringChecker(productType = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Product type can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get manufacturer name
                    do
                    {
                        ServiceClass.inputMessage("manufacturer name");

                        if(ServiceClass.stringChecker(manufacturerName = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Manufacturer name can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get manufacturer phone number
                    do
                    {
                        ServiceClass.inputMessage("manufacturer phone number");

                        if(ServiceClass.phoneChecker(manufacturerContact = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a valid phone number.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get manufacturer address
                    do
                    {
                        ServiceClass.inputMessage("manufacturer address");

                        if(ServiceClass.stringChecker(manufacturerAddress = innerRead.nextLine()))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Address can't be blank.");
                            innerRead.nextLine();
                        } else innerCheck = false;
                    }while(innerCheck);
                    
                    //get product cost
                    do
                    {
                        ServiceClass.inputMessage("product cost");                      
                        String inputData = innerRead.nextLine();                        
                        inputData = inputData.replace("$", "");
                        
                        if(ServiceClass.moneyChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Must be a number greater than 0.");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            productCost = Double.parseDouble(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                    
                    //get stock level
                    do
                    {
                        ServiceClass.inputMessage("stock level");                      
                        String inputData = innerRead.nextLine();

                        if(ServiceClass.stockChecker(inputData))
                        {
                            innerCheck = true;
                            ServiceClass.inputErrorMessage("Stock must be a number, and 0 or greater");
                            inputData = "";
                            innerRead.nextLine();
                        } 
                        else 
                        {
                            stock = Integer.parseInt(inputData);
                            innerCheck = false;
                        }
                    }while(innerCheck);
                                        
                    ServiceClass.successMessage("Product");
                    
                    //create new product
                    productList.add(new Product(productName, productType, productCost, manufacturerName, 
                                    manufacturerContact, manufacturerAddress, stock));
                }//end of create product
                //search for a product
                else if(input == 6)
                {
                    boolean keepGoingProductSearch = true;
                    
                    //starting of product search
                    do
                        {
                            ServiceClass.searchProductMessage();
                            initalizeInput = read.nextLine();
                            if(ServiceClass.productSearchMenuChecker(initalizeInput))
                            {
                                ServiceClass.inputErrorMessage("Please enter a number between 0-3");
                                initalizeInput = "";
                                read.nextLine();
                                outerCheck = true;
                            } else 
                            {
                                input = Integer.parseInt(initalizeInput);
                                outerCheck = false;
                            }
                        }while(outerCheck);
                    
                    while(keepGoingProductSearch)
                    {    
                        if(input >= 0 && input <= 4)
                        {
                            //search by product name
                            if(input == 1)
                            {
                                String productNameSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("product name search");

                                    if(ServiceClass.stringChecker(productNameSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Product name can't be blank.");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                

                                for (Product productList1 : productList) 
                                {
                                    if(productList1.getProductName().equalsIgnoreCase(productNameSearch))
                                    {
                                    searchList =  "\n" + searchList + productList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                ServiceClass.displayResults(searchList);
                                
                                keepGoingProductSearch = false;
                            }
                            //search by product type
                            else if(input == 2)
                            {
                                String productTypeSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("product type search");

                                    if(ServiceClass.stringChecker(productTypeSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Product type can't be blank.");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                

                                for (Product productList1 : productList) 
                                {
                                    if(productList1.getProductType().equalsIgnoreCase(productTypeSearch))
                                    {
                                    searchList =  "\n" + searchList + productList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                ServiceClass.displayResults(searchList);
                                
                                keepGoingProductSearch = false;
                            }
                            //search by manufacturer name
                            else if(input == 3)
                            {
                                String manufacturerNameSearch;
                                String searchList = "";
                                
                                boolean innerCheck = false;
                                Scanner innerRead = new Scanner(System.in);

                                do
                                {
                                    ServiceClass.inputMessage("manufacturer name search");

                                    if(ServiceClass.stringChecker(manufacturerNameSearch = innerRead.nextLine()))
                                    {
                                        innerCheck = true;
                                        ServiceClass.inputErrorMessage("Manufacturer name can't be blank.");
                                        innerRead.nextLine();
                                    } else innerCheck = false;
                                }while(innerCheck);
                                
                                for (Product productList1 : productList) 
                                {
                                    if(productList1.getManufacturer().getManufacturerName().equalsIgnoreCase(manufacturerNameSearch))
                                    {
                                    searchList =  "\n" + searchList + productList1.toString();
                                    }
                                }
                                
                                if(ServiceClass.searchChecker(searchList))
                                {
                                    searchList = "Your search had no results";
                                }
                                
                                ServiceClass.displayResults(searchList);
                                
                                keepGoingProductSearch = false;
                            }
                            
                            else if(input == 0)
                            {
                                keepGoingProductSearch = false;
                            }
                        }
                    }
                }//end of product search menu
                //exit search
                else if(input == 0)
                {
                    keepGoing = false;
                }
            }//end of the main menu cycle
        }
    }//end of main method
}//end of class
