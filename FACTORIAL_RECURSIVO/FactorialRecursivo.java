public class FactorialRecursivo{

    public static int factorial(int num){
        System.out.println("En factorial, con num =" + num);
        //caso base
        if(num==0){
            System.out.println("En factorial en el caso base, mum =" + num);
            return 1;
        }else{
            System.out.println("Invocando factorial con num =" + (num - 1));
            System.out.println();
            return num * factorial( num - 1);
        }
    }
    public static void main(String[] args){
        int numero = 5;
        int fact;

        System.out.println("Factorial Recursivo del numero ");
        fact = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + fact);
    }
}
