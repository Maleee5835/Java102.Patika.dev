import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FiksturCreate {
    private List<String> teams;

    public FiksturCreate(List<String> teams) {
        this.teams = teams;
    }

    public List<String> fiksturOlustur() {

        ArrayList<String> fikstur = new ArrayList<>();

        // Eğer takım sayısı tekse "Bay" takımını ekleyerek çift sayıya tamamlıyoruz.
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int haftaSayisi = (teams.size() - 1) * 2;
        int toplamMaclar = teams.size() / 2;

        // Her hafta için fikstür oluşturuyoruz.
        for (int hafta = 1; hafta <= haftaSayisi; hafta++) {

            // Takımları karıştırarak rastgele eşleştirmek için liste sırasını değiştiriyoruz.
            Collections.shuffle(teams, new Random(System.nanoTime()));//teams listesinin elemanlarını karıştırırız.

            // Her hafta takımların birbirleriyle eşleştiği maçları oluşturuyoruz.
            for (int i=0;i<toplamMaclar;i++){
                String evSAhibi = teams.get(i);
                String deplasman = teams.get(i + toplamMaclar);

                // "Bay" takımı ile eşleşen takımlar o hafta maç yapmayacağı için bu durumu kontrol ediyoruz.
                if (!evSAhibi.equals("Bay") || !deplasman.equals("Bay")) {
                    String mac = evSAhibi + " vs " + deplasman;
                    fikstur.add("Round" + hafta + " : " + mac);
                }
            }
        }
        return fikstur;
    }
}
