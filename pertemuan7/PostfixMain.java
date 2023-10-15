import java.util.Scanner;
public class PostfixMain {
    public static void main (String[] args) {

        Scanner al = new Scanner(System.in);

        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = al.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " +P);
        
    }
}
