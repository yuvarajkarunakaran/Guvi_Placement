import java.util.Arrays;

public class Sum {
    public static void main(String args[]) {
        String x = "1234", y = "8654", z = "8649";
        char xarr[] = x.toCharArray();
        Arrays.sort(xarr);
        char yarr[] = y.toCharArray();
        Arrays.sort(yarr);
        char zarr[] = z.toCharArray();
        Arrays.sort(zarr);
        int varA = xarr[3] + yarr[3] + zarr[3];
        int varB = xarr[2] + yarr[2] + zarr[2];
        System.out.println(varA-varB);
    }
}

