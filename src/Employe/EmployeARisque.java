package Employe ;


public interface EmployeARisque {
    double PRIME_DE_RISQUE = 200;

    default double getPrime() {
        return PRIME_DE_RISQUE;
    }
}
