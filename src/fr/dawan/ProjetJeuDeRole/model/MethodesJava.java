package fr.dawan.ProjetJeuDeRole.model;

public class MethodesJava extends Arme {

    
    private int idMethode;
    private static int degat;
    
    public MethodesJava  () {
        this.idMethode = 3;
        this.degat=7;
        this.setNomArme("methodes java");
    }

    public MethodesJava(String nomArme, int degat) {
        super(nomArme, degat);
        this.idMethode = 3;
        this.degat=7;
        this.setNomArme("methodes java");
    }

    public int getIdMethode() {
        return idMethode;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        MethodesJava.degat = degat;
    }

    public void setIdMethode(int idMethode) {
        this.idMethode = idMethode;
    }

    @Override
    public String toString() {
        return "Nom arme: " + super.getNomArme() +  ", idPc=" + idMethode +", point de degats= " + this.degat ;
    }
}
