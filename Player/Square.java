public class Square {
    static boolean isSquare(double x) {
        if(Math.pow((int)Math.sqrt(x),2) == x )
            return true;
        return false;
    }
    public static void main(String args[]) {
        double arr[] = new double[100];
        for(int i=2; i<100; i++) {
            arr[i] = i;
        }
        for(int k=2; k<100; k++) {
            if(isSquare(arr[k]))
                System.out.print(k + " ");
        }
    }
}
