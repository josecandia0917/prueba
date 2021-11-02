public class ejercicio2 {
import java.util.Scanner;

    public class 2jercicio2 {
        public static void main(String[] args) {
            int n, a, b ,c, x=1;

            System.out.println("Ingrese el numero de preguntas: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            for (int i=1 ; i<=n ; i++){
                if(1==x){
                    System.out.println("T=");
                    a = in.nextInt();
                    System.out.println("D=");
                    b = in.nextInt();
                    int v = b / a;
                    System.out.println("Velocidad="+v);
                    x=2;
                }else if(2==x){
                    System.out.println("T=");
                    a = in.nextInt();
                    System.out.println("V=");
                    c = in.nextInt();
                    int d = a * c;
                    System.out.println("Desplazamiento="+d);
                    x=3;
                }else if(3==x){
                    System.out.println("D=");
                    b = in.nextInt();
                    System.out.println("V=");
                    c = in.nextInt();
                    int t = b / c;
                    System.out.println("tiempo="+t);
                    x=1;
                }
            }
        }
    }
}
