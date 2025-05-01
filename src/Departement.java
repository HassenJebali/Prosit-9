import java.util.*;

public class Departement {
    private int id_departement;
    private String nom_departement;
    private int nb_employees;

    public Departement() {}
    public Departement(int id_departement,String nom_departement, int nb_employees) {
        this.id_departement = id_departement;
        this.nom_departement = nom_departement;
        this.nb_employees = nb_employees;
    }

    public int getId_departement() {
        return id_departement;
    }

    public void setId_departement(int id_departement) {
        this.id_departement = id_departement;
    }

    public int getNb_employees() {
        return nb_employees;
    }

    public void setNb_employees(int nb_employees) {
        this.nb_employees = nb_employees;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id_departement, nom_departement);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement d = (Departement) o;
        return id_departement == d.id_departement && d.nom_departement == nom_departement;
    }

    @Override
    public String toString() {
        return "Departement [id_departement=" + id_departement + ", nom_departement=" + nom_departement + ", nb_employees=" + nb_employees + "]";
    }
}
