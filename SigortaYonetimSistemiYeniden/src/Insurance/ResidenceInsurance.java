package Insurance;

import java.time.LocalDate;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double insurancePrice, LocalDate baslangicTarihi, LocalDate bitisTarihi) {
        super(insuranceName, insurancePrice, baslangicTarihi, bitisTarihi);
    }

    @Override
    public void calculate() {
    }
}
