import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant{
    private TreeSet<Enseignant> enseignants;

    public EspritTreeSet() {
        enseignants = new TreeSet<>();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant enseignant : enseignants) {
            if (enseignant.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant enseignant : enseignants) {
            System.out.println(enseignant);
        }
    }

}
