
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(156, "Ali", "Ben Salah", "Informatique", 3);
        Employe e2 = new Employe(112, "Sami", "Gharbi", "Ressources Humaines", 2);
        Employe e3 = new Employe(191, "Mohamed", "Trabelsi", "Mécanique", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Avant tri :");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Ali' : " + societe.rechercherEmploye("Ali"));
        System.out.println("Recherche par objet Employe e1 : " + societe.rechercherEmploye(e1));

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par Nom, Département, Grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nSuppression de e2 :");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }}
