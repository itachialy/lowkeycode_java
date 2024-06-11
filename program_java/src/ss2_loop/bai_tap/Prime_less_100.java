package ss2_loop.bai_tap;

public class Prime_less_100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố bé hơn 100 gồm :");
        for (int i = 2; i < 100 ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
