import java.util.Scanner;

public class mainLatihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("=====================================");
        System.out.print("Masukkan Jumlah Suara : ");
        int jumlahSuara = sc.nextInt();
        System.out.println("=====================================");

        // Membersihkan karakter newline (\n) yang masih ada di buffer
        sc.nextLine();

        int[] suaraKandidat = new int[jumlahSuara];

        System.out.println("Masukkan suara untuk setiap kandidat: ");
        for (int i = 0; i < jumlahSuara; i++) {
            System.out.print("Suara ke-" + (i + 1) + ": ");
            suaraKandidat[i] = sc.nextInt(); 
        }
        

        String hasil = cariMayoritas(suaraKandidat);

        if (!hasil.equals("No Mayoritas")) {
            System.out.println("Kandidat " + hasil + " memiliki mayoritas suara.");
        } else {
            System.out.println("Tidak ada kandidat yang memiliki mayoritas suara.");
        }
    }

    static String cariMayoritas(int[] suaraKandidat) {
        int n = suaraKandidat.length;
        int kandidat = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (suaraKandidat[i] == suaraKandidat[kandidat]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                kandidat = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (suaraKandidat[i] == suaraKandidat[kandidat]) {
                count++;
            }
        }

        if (count > n / 2) {
            return String.valueOf(suaraKandidat[kandidat]);
        } else {
            return "No Mayoritas";
        }
    }
}
