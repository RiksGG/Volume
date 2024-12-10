public class Prisma {
    public static double Calcularprisma(double lado, double altura){
        double volume = (3 * Math.sqrt(3 * lado * lado * altura))/ 2.0;
        return volume;
    }
}
