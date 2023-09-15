package pertemuan3;

import java.text.DecimalFormat;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    DecimalFormat decimalFormat = new DecimalFormat("#.##"); 
    
    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[], int j, int k) {
        total = 0;
        for (int i = j; i <= k; i++) {
            total += arr[i];
        }
        return Double.parseDouble(decimalFormat.format(total));
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            double result = lsum + rsum;
            return Double.parseDouble(decimalFormat.format(result)); 
        }
        return 0;
    }
    
}
