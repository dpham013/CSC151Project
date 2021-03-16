import java.util.Scanner;
import java.io.*;

public class policyDemo2 {
    public static void main(String[] args) throws IOException
     {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
 
        // Get the filename.
        System.out.print("Enter the filename: ");
       String filename = keyboard.nextLine();
 
        // Open the file.
       File file = new File(filename);
       Scanner inputFile = new Scanner(file);
 
       // Read lines from the file until no more are left.
       
      int smoker = 0, nonsmoker = 0;
      double insurance = 600, smokerFee = 0, addFeeBMI = 0, addFeeAge = 0, total = 0;
      
      
       while (inputFile.hasNext())
       {
          // Read the next name.
           String info = inputFile.nextLine();
 
           // Display read.
           System.out.println("Policy Number: " + info);
           info = inputFile.nextLine();
           System.out.println("Povider Name: " + info);
           info = inputFile.nextLine();
           System.out.println("Policyholder's First Name: " + info);
           info = inputFile.nextLine();
           System.out.println("Policyholder's Last Name : " + info);
           info = inputFile.nextLine();
           System.out.println("Policyholder's Age:  : " + info);
           String age1 = info;
           double age =  new Double(age1);
           info = inputFile.nextLine();
           System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + info);
           if (info.equals("smoker")) {
              smoker = smoker + 1;
              smokerFee = 100;
           }
           else 
               nonsmoker = nonsmoker +1;
           
           info = inputFile.nextLine();
           System.out.println("Policyholder's Height: " + info);
           String height1 = info;
           double height = new Double(height1);
           info = inputFile.nextLine();
           
           System.out.println("Policyholder's Weight: " + info);
           String weight1 = info;
           double weight = new Double(weight1);
           double BMI = (weight * 703) / (Math.pow(height, 2));
           
           System.out.printf("Policyholder’s BMI: %,.2f\n", BMI);
           
           if (age>50)
           {
            addFeeAge = 50;
           }
           
           if (BMI > 35)
           {
            addFeeBMI = (BMI - 35) * 20;
           }
           
           total = insurance + addFeeAge + addFeeBMI + smokerFee;
           
           System.out.printf("Policy Price: $%,.2f\n" , total);
     
           
           System.out.println("");
           if(inputFile.hasNext())
           inputFile.nextLine();
              
           
       }
      System.out.println("The number of policies with a smoker is: " + smoker);
      
      System.out.println("The number of policies with a nonsmoker is: " + nonsmoker);
       // Close the file.
       inputFile.close();
     }
     
}