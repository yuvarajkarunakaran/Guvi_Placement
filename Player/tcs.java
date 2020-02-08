import java.util.Scanner;
public class tcs {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Inventory inv[] = new Inventory[2];
        for (int i = 0; i < 2; i++) {
            String inventoryId = scanner.next();
            int maxQuantity = scanner.nextInt();
            int currentQuantity = scanner.nextInt();
            int threshold = scanner.nextInt();
            inv[i] = new Inventory(inventoryId, maxQuantity, currentQuantity, threshold);
        }
        int limit = scanner.nextInt();
        Inventory ls[] = replinish(limit, inv);
        for (Inventory i : ls) {
            if(i != null) {
                if (i.getThreshold() >= 75) {
                    System.out.println( i.getInventoryId() + "75");
                } else if (i.getThreshold() >= 50 && i.getThreshold() <= 74) {
                    System.out.println("50");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
    public static Inventory[] replinish(int limit, Inventory[] inv) {
        Inventory arr[] = new Inventory[2];
        for (int i=0; i<inv.length; i++) {
            if(inv[i].getThreshold() <= limit) {
                arr[i] = inv[i];
            }
        }
        return arr;
    }
}