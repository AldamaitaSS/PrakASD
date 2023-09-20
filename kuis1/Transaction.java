class Transaction {
    private String transactionId;
    private String[] items;
    private int[] quantities;
    private double[] prices;
    int itemCount;

    public Transaction() {
        this.transactionId = "";
        this.items = new String[100]; // Maksimum 100 item
        this.quantities = new int[100];
        this.prices = new double[100];
        this.itemCount = 0;
    }

    public void createTransaction(String transactionId) {
        this.transactionId = transactionId;
    }

    public void addItem(String itemName, int quantity, double price) {
        items[itemCount] = itemName;
        quantities[itemCount] = quantity;
        prices[itemCount] = price;
        itemCount++;
    }

    public void updateItemName(String oldItemName, String newItemName) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(oldItemName)) {
                items[i] = newItemName;
            }
        }
    }

    public void updateItemQuantity(String itemName, int newQuantity) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(itemName)) {
                quantities[i] = newQuantity;
            }
        }
    }

    public void updateItemPrice(String itemName, double newPrice) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(itemName)) {
                prices[i] = newPrice;
            }
        }
    }

    public void deleteItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(itemName)) {
                // Geser elemen-elemen setelah item yang dihapus
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                    quantities[j] = quantities[j + 1];
                    prices[j] = prices[j + 1];
                }
                itemCount--;
                break;
            }
        }
    }

    public void resetTransaction() {
        itemCount = 0;
    }

    public void checkOrder() {
        boolean inputError = false;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].isEmpty() || quantities[i] <= 0 || prices[i] <= 0) {
                inputError = true;
                break;
            }
        }

        if (inputError) {
            System.out.println("Terdapat kesalahan input data.");
        } else {
            System.out.println("Pemesanan sudah benar.");
        }
    }

    public void printReceipt() {
        System.out.println("ID Transaksi: " + transactionId);
        System.out.println("| No | Nama Item | Jumlah Item | Harga/Item | Total Harga |");
        System.out.println("---------------------------------------------------------");
        double totalBelanja = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.printf("| %2d | %-10s | %12d | %10.0f | %12.0f |\n", i + 1, items[i], quantities[i],
                    prices[i], quantities[i] * prices[i]);
            totalBelanja += quantities[i] * prices[i];
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("Total Belanja: " + totalBelanja);

        double diskon = 0;
        if (totalBelanja > 500000) {
            diskon = 0.10 * totalBelanja;
        } else if (totalBelanja > 300000) {
            diskon = 0.08 * totalBelanja;
        } else if (totalBelanja > 200000) {
            diskon = 0.05 * totalBelanja;
        }

        if (diskon > 0) {
            System.out.println("Diskon: " + diskon);
            System.out.println("Total Pembayaran setelah Diskon: " + (totalBelanja - diskon));
        } else {
            System.out.println("Tidak ada diskon yang diberikan.");
            System.out.println("Total Pembayaran: " + totalBelanja);
        }
    }
}
