import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        Scanner scanner = new Scanner(System.in);

        int choice;
        String transactionId = "";

        do {
            System.out.println("=========================");
            System.out.println("          Menu           ");
            System.out.println("=========================");
            System.out.println("1. Membuat ID Transaksi");
            System.out.println("2. Tambah Item");
            System.out.println("3. Update Nama Item");
            System.out.println("4. Update Jumlah Item");
            System.out.println("5. Update Harga Item"); 
            System.out.println("6. Hapus Item");
            System.out.println("7. Reset Transaksi");
            System.out.println("8. Check Order");
            System.out.println("9. Print Receipt");
            System.out.println("0. Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-------------------------\n");

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID Transaksi: ");
                    transactionId = scanner.nextLine();
                    transaction.createTransaction(transactionId);
                    System.out.println("\n");
                    break;
                case 2:
                    if (transactionId.isEmpty()) {
                        System.out.println("Silakan buat ID transaksi terlebih dahulu.");
                    } else {
                        System.out.print("Nama Item: ");
                        String itemName = scanner.nextLine();
                        System.out.print("Jumlah Item: ");
                        int quantity = scanner.nextInt();
                        System.out.print("Harga per Item: ");
                        double price = scanner.nextDouble();
                        transaction.addItem(itemName, quantity, price);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        System.out.print("Nama Item yang ingin diubah: ");
                        String oldItemName = scanner.nextLine();
                        System.out.print("Nama Item baru: ");
                        String newItemName = scanner.nextLine();
                        transaction.updateItemName(oldItemName, newItemName);
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        System.out.print("Nama Item yang ingin diubah jumlahnya: ");
                        String itemToUpdate = scanner.nextLine();
                        System.out.print("Jumlah Item baru: ");
                        int newQuantity = scanner.nextInt();
                        transaction.updateItemQuantity(itemToUpdate, newQuantity);
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        System.out.print("Nama Item yang ingin diubah harganya: ");
                        String itemToChangePrice = scanner.nextLine();
                        System.out.print("Harga Item baru: ");
                        double newPrice = scanner.nextDouble();
                        transaction.updateItemPrice(itemToChangePrice, newPrice);
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        System.out.print("Nama Item yang ingin dihapus: ");
                        String itemToDelete = scanner.nextLine();
                        transaction.deleteItem(itemToDelete);
                    }
                    System.out.println("\n");
                    break;
                case 7:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        transaction.resetTransaction();
                    }
                    System.out.println("\n");
                    break;
                case 8:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        transaction.checkOrder();
                    }
                    System.out.println("\n");
                    break;
                case 9:
                    if (transactionId.isEmpty() || transaction.itemCount == 0) {
                        System.out.println("Belum ada transaksi atau item.");
                    } else {
                        transaction.printReceipt();
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
