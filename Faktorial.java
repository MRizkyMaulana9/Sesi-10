public class Faktorial {
    public int getFaktorial(int angka ){
        if (angka == 0) {
            return 1;
        } else {
            return angka * getFaktorial(angka - 1);
        }
    }
    public static void main(String[] args) throws Exception {
       Faktorial R = new Faktorial();
        System.out.println(R.getFaktorial(5));
    }
}
