package MainPackage;

public class CountSort {

    private static int [] aux = new int[1001];

    public  int[] sort(int [] arr) {

        for (int i : arr){
            aux[i]++;
        }
        int[] result = new int[arr.length];
        int pos = 0;
        for(int i =0;i<=1000;i++) {
            while (aux[i]>0) {
                result[pos++] = i;
                aux[i]--;
            }
        }
        return result;

    }



}
