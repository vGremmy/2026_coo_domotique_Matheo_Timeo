public class Lampe {
    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        this.nom = nom;
        this.allume = false;
    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public boolean isAllume() {
        return allume;
    }

    @Override
    public String toString() {
        return nom + (allume ? " est allumée" : " est éteinte");
    }
}
