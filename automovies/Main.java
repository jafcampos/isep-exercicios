package automovies;
public class Main {
    public static void main(String[] args) {

        Automovel a1 = new Automovel("54-AB-45", "Toyota", 2023);
        
        System.out.println(a1.toString());

        System.out.println(a1.getMatricula());

        System.out.println(Automovel.getCount());

        Automovel a2 = new Automovel("67-CD-89", "Honda", 1900);

        System.out.println(a2.toString());

        System.out.println(Automovel.diffCilindrada(a1, a2));

        a2.setCilindrada(1800);
 
        System.out.println(Automovel.getCount());

        int diff = Automovel.diffCilindrada(a1, a2);

        System.out.println("Diferença de cilindrada: " + diff);

        if (Automovel.compareCilindrada(a1, a2)) {
            System.out.println("O automóvel " + a1.getMatricula() + " tem cilindrada superior ao automóvel " + a2.getMatricula());
        } else {
            System.out.println("O automóvel " + a2.getMatricula() + " tem cilindrada superior ao automóvel " + a1.getMatricula());
        }

        if (a1.isSuperior(2000)) {
            System.out.println("O automóvel " + a1.getMatricula() + " é superior a 2000 cc");
        } else {
            System.out.println("O automóvel " + a1.getMatricula() + " não é superior a 2000 cc");
        }
        

    }
}