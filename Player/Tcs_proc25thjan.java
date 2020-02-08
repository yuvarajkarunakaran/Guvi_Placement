import java.util.Scanner;

public class Tcs_proc25thjan {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Inventory in[]=new Inventory[2];
        for(int i=0;i<2;i++)
        {
            String inventoryId=sc.nextLine();
            sc.nextLine();
            int maximumQuantity=sc.nextInt();
            int currentQuantity=sc.nextInt();
            int threshold=sc.nextInt();
            in[i]=new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }
        int s=sc.nextInt();
        Inventory[] c=Tcs_proc25thjan.replenish(s,in);
        for(int i=0;i<2;i++)
        {
            if(c[i]!=null)
            {
                System.out.print(c[i].getInventoryId());
            }
        }

    }
    public static Inventory[] replenish(int str,Inventory[] res)
    {
        Inventory[] ans=new Inventory[2];
        for(int i=0;i<2;i++)
        {
            if(res[i].getThreshold()<str)
            {
                ans[i]=res[i];
            }
        }

        return ans;
    }
    public static class Inventory {
        private String inventoryId;
        private int maximumQuantity;
        private int currentQuantity;
        private int threshold;
        public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {

            this.inventoryId = inventoryId;
            this.maximumQuantity = maximumQuantity;
            this.currentQuantity = currentQuantity;
            this.threshold = threshold;
        }
        public String getInventoryId() {
            return inventoryId;
        }
        public void setInventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
        }
        public int getMaximumQuantity() {
            return maximumQuantity;
        }
        public void setMaximumQuantity(int maximumQuantity) {
            this.maximumQuantity = maximumQuantity;
        }
        public int getCurrentQuantity() {
            return currentQuantity;
        }
        public void setCurrentQuantity(int currentQuantity) {
            this.currentQuantity = currentQuantity;
        }
        public int getThreshold() {
            return threshold;
        }
        public void setThreshold(int threshold) {
            this.threshold = threshold;
        }

    }


}


