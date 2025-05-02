import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map <Departement,Employe> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();}

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(d,e);}

    public void afficherEmployesDepartements(){
        for (Map.Entry<Departement,Employe> e : affectations.entrySet()){
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
        for(Employe e : affectations.values()){
            System.out.println(e);}}

    public void afficherDepartements(){
        for(Departement d : affectations.keySet()){
            System.out.println(d);}}

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);}

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);}

    public Map<Departement,Employe> trierMap(){
        return new TreeMap<>(affectations);
    }
}
