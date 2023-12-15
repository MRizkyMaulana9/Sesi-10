import java.util.Scanner;
public class Rekursip {
    static int b; 
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        b = input.nextInt();
        cetakPiramida(0);
        input.close();
    }
    static void cetakPiramida (int i){
        cetakSpasi (0, i);
        cetakBintang (b, i);
        System.out.println();
        i++;
        if (i < b) {
            cetakPiramida(i);
        }
    }
    static void cetakSpasi (int j, int i){
        if (j < b-i-1) {
            System.out.print(" ");
            cetakSpasi(j + 1, i);
        }
    }
     static void cetakBintang (int k, int i){
        if (k > b-i-1) {
            System.out.print("* ");
            cetakBintang(k-1, i);
        }
}
}