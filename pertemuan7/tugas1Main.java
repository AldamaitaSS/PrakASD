import java.util.Scanner;

public class tugas1Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String inputSentence = scanner.nextLine();

        tugas1 stack = new tugas1(inputSentence.length());
        String reversedSentence = stack.reverseSentence(inputSentence);

        System.out.println("Hasil : \n" + reversedSentence);

    }
}
