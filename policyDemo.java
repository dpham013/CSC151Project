import java.util.Scanner;

public class policyDemo {


    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your provider number?");
        int providerNum = keyboard.nextInt();
        
        System.out.println("What is your provider name?");
        String providerName = keyboard.nextLine();
        keyboard.nextLine();
        
        System.out.println("What is your first name?");
        String nameF = keyboard.nextLine();
        
        System.out.println("What is your last name?");
        String nameL = keyboard.nextLine();
        
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        
        boolean isSmoker = false;

        System.out.println("Are you a smoker (Y/N)?");

        String smoker = keyboard.next();

        if("Y".equals(smoker) || "y".equals(smoker))
        {
            isSmoker = true;
        }
        if("N".equals(smoker) || "n".equals(smoker))
        {
            isSmoker = false;
        }

        
        System.out.println("What is your weight (in pounds)?");
        double weight = keyboard.nextDouble();
        
        System.out.println("What is your height (in inches)?");
        double height = keyboard.nextDouble();



        Policy policy1 = new Policy(providerNum, providerName, nameF, nameL, isSmoker, age, height, weight);
        
        System.out.println("Policy Number: " + policy1.getProviderNum());
        
        System.out.println("Provider Name: " +policy1.getProviderName());
        
        System.out.println("Policyholder’s First Name: " +policy1.getNameF());
        
        System.out.println("Policyholder’s Last Name: " +policy1.getNameL());
        
        System.out.println("Policyholder’s Age: " +policy1.getAge());
        
        System.out.println("Policyholder’s Smoking Status: " +policy1.getIsSmoker());
        
        System.out.println("Policyholder’s Weight: " +policy1.getHeight());
        
        System.out.println("Policyholder’s Height: " +policy1.getWeight());
        
        double BMI = policy1.getBMI();

        System.out.printf("Policyholder’s BMI: %,.2f\n ", policy1.getBMI());

        System.out.printf("Policy Price: $%,.2f\n" ,policy1.calculateInsurance(age, BMI, isSmoker));

 

    }

}