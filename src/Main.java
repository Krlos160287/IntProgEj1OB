public class Main {
    public static void main(String[] args) {
        var valor = suma(10,20,30);
        System.out.println(valor);
        
        Coche miCoche = new Coche();
        miCoche.sumPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }


}

class Coche {
    public int puertas = 3;

    public void sumPuertas() {
        this.puertas++;
    }
}