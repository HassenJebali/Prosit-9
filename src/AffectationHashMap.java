import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map <Employe,Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();}

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e,d);}

    public void afficherEmployesDepartements(){
        for (Map.Entry<Employe,Departement> e : affectations.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);}

    public void supprimerEmployeDepartement(Employe e, Departement d) {
        if(affectations.containsKey(e) && affectations.get(e).equals(d)){
            affectations.remove(e);
        }
    }

    public void afficherEmployes(){
        for(Employe e : affectations.keySet()){
            System.out.println(e);}}

    public void afficherDepartements(){
        for(Departement d : affectations.values()){
            System.out.println(d);}}

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);}

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);}

    public Map<Employe, Departement> trierMap(){
        return new TreeMap<>(affectations);
    }
}
