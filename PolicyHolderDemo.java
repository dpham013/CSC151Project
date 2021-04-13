import java.util.*;

class policyHolder {

    String nameF;
    String nameL;
    String smoker;
    String providerName;
    int providerNum;
    int age;
    double height;
    double weight;

    public policyHolder(int providerNum, String providerName, String nameF, String nameL, int age, String smoker, double height, double weight)
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

    public String toString() {
        return "Policy Number: " + this.providerNum + "\nProvider Name: " + this.providerName + "\nPolicyholder's First Name: " + this.nameF + "\nPolicyholder's Last Name: " + this.nameL + "\nPolicyholder's Age: " + this.age
      + "\nPolicyholder's Smoking Status (Y/N): " + this.smoker + "\nPolicyholder's Height: " + this.height + "\nPolicyholder's Weight: " + this.weight +"\n";
    }
}

public class PolicyHolderDemo {

    public static void main(String[] args) {

        List<policyHolder> l = new LinkedList<policyHolder>();

        policyHolder p1 = new policyHolder(3450, "State Farm", "Alice", "Jones", 20, "smoker", 65 , 110);
        policyHolder p2 = new policyHolder(3455, "Aetna", "Bob", "Lee", 54, "non-smoker", 72 , 200);
        policyHolder p3 = new policyHolder(2450, "Met Life", "Chester", "Williams", 40, "smoker", 71 , 300);
        policyHolder p4 = new policyHolder(3670, "Global", "Cindy", "Smith", 55, "non-smoker", 62 , 140);
        policyHolder p5 = new policyHolder(1490, "State Farm", "Jenna", " Lewis", 30, "smoker", 60 , 105);
        policyHolder p6 = new policyHolder(3477, "State Farm", "Craig", "Duncan", 23, "smoker", 66 ,215);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(p6);
        
        Iterator<policyHolder> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    }

}