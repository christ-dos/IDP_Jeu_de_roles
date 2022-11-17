package fr.dawan.ProjetJeuDeRole.model;

public class MethodesJava extends Arme {

    
    private int idMethode;
    private static int degat;
    
    public MethodesJava  () {
        this.idMethode = 3;
        this.degat=7;
    }

    public MethodesJava(String nomArme, int degat) {
        super(nomArme, degat);
        this.idMethode = 3;
    }

    public int getIdMethode() {
        return idMethode;
    }


    @Override
    public String toString() {
        return "MethodesJava [idPc=" + idMethode + ", toString()=" + super.toString() + "]";
    }
}
