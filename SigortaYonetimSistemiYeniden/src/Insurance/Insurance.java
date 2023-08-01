package Insurance;

import java.time.LocalDate;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private LocalDate baslangicTarihi;
    private LocalDate bitisTarihi;

    public Insurance(String insuranceName, double insurancePrice, LocalDate baslangicTarihi, LocalDate bitisTarihi) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
    }
    public abstract void calculate();


    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public LocalDate getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(LocalDate baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public LocalDate getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(LocalDate bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }
}
