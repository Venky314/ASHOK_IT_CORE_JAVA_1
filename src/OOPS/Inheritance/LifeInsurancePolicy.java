package OOPS.Inheritance;

public class LifeInsurancePolicy extends  InsurancePolicy {
    int maturityPeriod;

    void displayMaturity() {
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }

    @Override
    void calculatePremium() {
        System.out.println("Calculating premium for life insurance");
    }
}
