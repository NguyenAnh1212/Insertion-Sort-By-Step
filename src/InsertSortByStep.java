import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);

    }

    public static void insertionSort(int[] array) {
        int pos;// vị trí xét
        int x; // là phần tử đang xét (curent element)
        // Lặp mảng
        for (int i = 1; i < array.length; i++) {
            System.out.println("Vong lap thu " + i);
            x = array[i];
            pos = i;
            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong, đẩy về bên trái nhiều nhất có thể.
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
                System.out.println("Di chuyển " + array[pos]);
            }
            if (pos != i) {
                System.out.println(" Chen phan tu: " + x
                        + ", tai vi tri: " + pos);
                // chen phan tu tai vi tri chen
                array[pos] = x;
            }
            display(array);
        }
    }
    public static void display(int array[]) {
        System.out.print("[");
        // Duyet qua tat ca phan tu
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }
}
