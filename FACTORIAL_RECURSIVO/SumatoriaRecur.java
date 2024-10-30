public class SumatoriaRecur {

    public static int Suma(int n)
    {
        System.out.println("En Sumatoria, con n = " + n);
        if (n == 1){
            System.out.println("En Sumatoria en el caso base, n = " + n);
            return 1;
        } else {
            System.out.println("Invocando Sumatoria con n = " + (n - 1));
            return n + Suma( n - 1 );
        }
    }

    public static void main(String[] args)
    {
        int num = 6;
        int Resultado;
        System.out.println("Sumatoria Recursiva de un Número");
        Resultado = Suma(num);
        System.out.println("La Sumatoria de " + num + " es: " + Resultado);
    }
}
