public class Cilindro {
    public static double calcularCilindro(double raio, double altura){
        double volume = 0.0;
        volume = Math.PI * raio * raio * altura;
        return volume;
    }
}
