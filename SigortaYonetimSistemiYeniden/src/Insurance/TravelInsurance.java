package Insurance;

import java.time.LocalDate;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, LocalDate baslangicTarihi, LocalDate bitisTarihi) {
        super(insuranceName, insurancePrice, baslangicTarihi, bitisTarihi);
    }

    @Override
    public void calculate() {
    }
}
