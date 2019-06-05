import java.util.Scanner;
public class FirstPrime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong: ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        System.out.println("20 so nguyen to dau tien la: ");
        while (count <= number) {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    N++;
                    i = 2;
                }
            }
            System.out.print(" " + N);
            count++;
            N++;
        }
    }
}
