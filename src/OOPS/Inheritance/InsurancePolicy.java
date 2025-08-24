package OOPS.Inheritance;

public class InsurancePolicy {
    String policyNumber;
    String holderName;
    double premium;

    void calculatePremium() {
        System.out.println("Calculating general insurance premium");
    }

    void displayPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Premium: " + premium);
    }
}
