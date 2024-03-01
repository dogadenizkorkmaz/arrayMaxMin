import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {56, 34, 1, 8, 101, -2, -33};

        Scanner scanner = new Scanner(System.in);
        System.out.print("-33 ile 101 arasında bir numara giriniz: ");
        int numara = scanner.nextInt();

        Arrays.sort(liste); // Dizinin sıralanması

        int index = Arrays.binarySearch(liste, numara);// Numaranın indeksinin bulunması
        if (index < 0) {
            index = -index - 1;
        }
        int closestLower = (index > 0) ? liste[index - 1] : liste[index]; // Dizideki en yakın küçük sayının bulunması
        int closestUpper = (index < liste.length) ? liste[index] : liste[index - 1]; // Dizideki en yakın büyük sayının bulunması

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestLower);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestUpper);
    }
}
