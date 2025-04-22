import java.util.*;

public class SocieteArrayList implements IGestion<Employe>{

    ArrayList<Employe> employees=new ArrayList<Employe>();

    @Override
    public void ajouterEmploye(Employe e) {
        employees.add(e);
    }

    //recherche par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employees) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
    return false;}

    //recherche par objet
    @Override
    public boolean rechercherEmploye(Employe e) {
        return employees.contains(e);}


    @Override
    public void supprimerEmploye(Employe e) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).equals(e)){
                employees.remove(i);
                i--;
                break;
            }}}

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe e : employees) {
            System.out.println(e);
        }}

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);/*cette nous oblige de déclarer un comparateur dans la classe employee " compareTo(Employe e) "*/
    /*ou */
        // Collections.sort(employees, Comparator.comparingInt(Employe::getId));
         }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        /*employees.sort(Comparator
        .comparing(Employe::getNom)
        .thenComparing(Employe::getNomDepartement)
        .thenComparingInt(Employe::getGrade));*/

        Collections.sort(employees, new EmployeNomComparator().thenComparing
                (new EmployeDepartementComparator().thenComparing
                        (new EmployeGradeComparator())));
    }


}
class EmployeNomComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNom().compareTo(e2.getNom());
    }
}
class EmployeDepartementComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getNomDepartement().compareTo(e2.getNomDepartement());
    }
}
class EmployeGradeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getGrade()-e2.getGrade();
    }
}
