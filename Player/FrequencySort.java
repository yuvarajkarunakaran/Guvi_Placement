import java.util.Arrays;

public class FrequencySort {

    public static void sortMap(int frequencyMap[][]) {
        int tempKey = 0;
        int tempValue = 0;
        for(int i=0; i<frequencyMap.length-1; i++) {
            for(int j=0; j<frequencyMap.length-i-1; j++) {
                if(frequencyMap[j][1] < frequencyMap[j+1][1]) {
                    tempValue = frequencyMap[j][1];
                    tempKey = frequencyMap[j][0];
                    frequencyMap[j][1] = frequencyMap[j+1][1];
                    frequencyMap[j][0] = frequencyMap[j+1][0];
                    frequencyMap[j+1][1] = tempValue;
                    frequencyMap[j+1][0] = tempKey;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,4,3,2,1,4,2,1,3,4,2};
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int freqSort[] = new int[arr.length];
        Arrays.sort(arr);
        int frequencyMap[][] = new int[arr.length][2];
        frequencyMap[0][0] = arr[0];
        frequencyMap[0][1] = 1;
        int row = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                frequencyMap[row][1]++;
            }
            else {
                frequencyMap[++row][0] = arr[i];
                frequencyMap[row][1]++;
            }
        }
        sortMap(frequencyMap);
        int x = 0;
        for(int i=0; i<frequencyMap.length;i++) {
            if(frequencyMap[i][0] == 0) {
                break;
            }
            for(int j=0; j<frequencyMap[i][1]; j++) {
                freqSort[x++] = frequencyMap[i][0];
            }
        }
        for(int i : freqSort) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
