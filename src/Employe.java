public class Employe implements Comparable<Employe> {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe() {}
    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public String getPrenom(){return prenom; }
    public void setPrenom(String prenom) {this.prenom = prenom;}

    public String getNomDepartement() {return nomDepartement;}
    public void setNomDepartement (String nomDepartement){this.nomDepartement = nomDepartement;}

    public int getGrade(){return grade;}
    public void setGrade(int grade){this.grade = grade;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && nom == employe.nom;
    }

    @Override
    public String toString() {
        return "Employe [id : " + id +
                ", nom : " + nom +
                ", prenom : " + prenom +
                ", nomDepartement : " +nomDepartement +
                ", grade : "+grade+ "]";}

    @Override //trie par id
    public int compareTo(Employe e) {
        return this.id - e.id;
    }




}
