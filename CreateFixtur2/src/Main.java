import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<>();

        teams.add("Fenerbahçe");
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
       // teams.add("Sivasspor");

        Iterator<String> itr = teams.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        FiksturCreate fiksturCreate = new FiksturCreate(teams);
        List<String > fikstur = fiksturCreate.fiksturOlustur();

        System.out.println();

        int hafta = 1;
        for (int i = 0; i < fikstur.size(); i++) {

            if (i % 3 == 0) {
                System.out.println();
                System.out.println(fikstur.get(i));
            } else {
                System.out.print(fikstur.get(i) + " ");
                System.out.println();
            }
        }
    }
}






