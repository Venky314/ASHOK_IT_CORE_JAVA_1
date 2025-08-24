package OOPS.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        LifeInsurancePolicy lifePolicy = new LifeInsurancePolicy();
        lifePolicy.policyNumber = "LIF12345";
        lifePolicy.holderName = "John Doe";
        lifePolicy.premium = 5000;
        lifePolicy.maturityPeriod = 20;

        lifePolicy.displayPolicyDetails();
        lifePolicy.displayMaturity();
        lifePolicy.calculatePremium();
    }
}
