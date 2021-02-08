import java.lang.Math; 
public class Policy
{
   private String nameF;       
   private String nameL;
   private String providerName;
   private int providerNum;
   private int age;
   private boolean smoker;
   private double height;    
   private double weight;
         
   public Policy(int providerNum, String providerName, String nameF, String nameL, boolean smoker, int age, double height, double weight)
    {
         
        this.providerNum = providerNum;
        this.providerName = providerName;
        this.nameF = nameF;
        this.nameL = nameL;
        this.smoker = smoker;
        this.age = age; 
        this.height = height;
        this.weight = weight;
        


    } 


   public void setNameF(String n)
   {
      nameF = n;
   }
   
   public void setNameL(String n)
   {
      nameL = n;
   }
   
   public void setProviderName(String p)
   {
      providerName = p;
   }
   
   public void setProviderNum(int p)
   {
      providerNum = p;
   }


   public void setAge(int a)
   {
      age = a;
   }


   public void setHeight(double h)
   {
      height = h;
   }
   
    public void setWeight(double w)
   {
      weight = w;
   }


   /* Return */ 

   public String getNameF()
   {
      return nameF;
   }

   public String getNameL()
   {
      return nameL;
   }
   
   public String getProviderName()
   {
      return providerName;
   }

   public int getAge()
   {
      return age;
   }

    public int getProviderNum()
   {
      return providerNum;
   }
   
    public double getHeight()
   {
      return height;
   }
   
    public double getWeight()
   {
      return weight;
   }
   
    public boolean getIsSmoker()
    {
      return smoker;
    }
   //BMI
   public double getBMI()
   {
      double BMI = (weight*703) / (Math.pow(height, 2));
     
      return BMI;
   }
   
   public double calculateInsurance(int age, double BMI, boolean smoker)

    {
        double insurance = 600;
        double addFeeAge = 0;
        double addFeeBMI = 0;
        
        if(age > 50)
        {
           addFeeAge = 75;
        }


        if(smoker)
        {
            insurance = insurance + 100;
        }

        if(BMI > 35)
        {
            addFeeBMI = (BMI - 35) * 20;
        }


        insurance = insurance + addFeeAge + addFeeBMI;

        return insurance;
    }
   
}
