package Insurance;

import java.time.LocalDate;

public class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, double insurancePrice, LocalDate baslangicTarihi, LocalDate bitisTarihi) {
        super(insuranceName, insurancePrice, baslangicTarihi, bitisTarihi);
    }

    @Override
    public void calculate() {
    }
}
