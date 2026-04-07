import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void activerLampe(int indice) {
        if (indice >= 0 && indice < lampes.size()) {
            this.lampes.get(indice).allumer();
        }
    }

    public void desactiverLampe(int indice) {
        if (indice >= 0 && indice < lampes.size()) {
            this.lampes.get(indice).eteindre();
        }
    }

    public void activerTout() {
        for (Lampe l : lampes) {
            l.allumer();
        }
    }

    @Override
    public String toString() {
        String res = "Télécommande :\n";
        for (int i = 0; i < lampes.size(); i++) {
            res += i + ": " + lampes.get(i).toString() + "\n";
        }
        return res;
    }
}