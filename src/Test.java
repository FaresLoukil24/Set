import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        Enseignant enseignant1 = new Enseignant(1,"Nom1", "Prénom1");
        Enseignant enseignant2 = new Enseignant(2,"Nom2", "Prénom2");
        Enseignant enseignant3 = new Enseignant(3,"Nom3", "Prénom3");

        GestionEnseignant gestionnaireHashSet = new EspritHashSet();
        gestionnaireHashSet.ajouterEnseignant(enseignant1);
        gestionnaireHashSet.ajouterEnseignant(enseignant2);
        gestionnaireHashSet.ajouterEnseignant(enseignant3);
        System.out.println(gestionnaireHashSet.rechercherEnseignant(new Enseignant(0,"Nom1", "")));
        System.out.println(gestionnaireHashSet.rechercherEnseignant(1));
        gestionnaireHashSet.supprimerEnseignant(enseignant1);

        gestionnaireHashSet.displayEnseignants();

        GestionEnseignant gestionnaireTreeSet = new EspritTreeSet();
        gestionnaireTreeSet.ajouterEnseignant(enseignant2);
        gestionnaireTreeSet.ajouterEnseignant(enseignant3);
        System.out.println(gestionnaireTreeSet.rechercherEnseignant(new Enseignant(0,"Nom2", "")));
        System.out.println(gestionnaireTreeSet.rechercherEnseignant(2));
        gestionnaireTreeSet.displayEnseignants();

        TreeSet<Enseignant> enseignants = new TreeSet<>();
        enseignants.add(enseignant1);
        enseignants.add(enseignant2);
        enseignants.add(enseignant3);

        for (Enseignant enseignant : enseignants) {
            System.out.println(enseignant);
        }
    }
    }
