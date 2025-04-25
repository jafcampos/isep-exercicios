package automovies;

public class Automovel {
    private String matricula;
    private String marca;
    private int cilindrada;
    
    private static int count = 0;
    public static int getCount() {
        return count;
    }
    public static int diffCilindrada(Automovel a1, Automovel a2) {
        return Math.abs(a1.getCilindrada() - a2.getCilindrada());
    }
    
    public static boolean compareCilindrada(Automovel a1, Automovel a2) {
        return a1.getCilindrada() >a2.getCilindrada();
    }
    // Constructor
    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        count++;
    }

    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // toString method
    @Override
    public String toString() {
        return "Automóvel com matricula " + this.matricula + " é um " + this.marca + " de " + this.cilindrada + " cc";
    }


    public  boolean isSuperior(int clilindrada) {
        return this.cilindrada >clilindrada;
    }

}