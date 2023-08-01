package Insurance;

import java.time.LocalDate;

public class HealthInsurance extends Insurance{

    public HealthInsurance(String insuranceName, double insurancePrice, LocalDate baslangicTarihi, LocalDate bitisTarihi) {
        super(insuranceName, insurancePrice, baslangicTarihi, bitisTarihi);
    }

    @Override
    public void calculate() {

    }
}
