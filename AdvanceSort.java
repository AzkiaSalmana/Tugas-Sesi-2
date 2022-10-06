import java.util.Arrays;


public class AdvanceSort {
    //data akan di sortir menggunakan selection sort
    
    public static void main(String[] args) {
        int nilai_1[] = {0, -2, -5, -6, -1, -3, -4, -7};
        int nilai_2[] = {8, 2, 5, 3, 1, 4, 6, 7};
        goSort(nilai_1, "ASC");
        goSort(nilai_1, "DESC");
        goSort(nilai_2, "ASC");
        goSort(nilai_2, "DESC");
    }
    
    public static void goSort(int[] data, String optionSort){
        int arr[] = data.clone();
        System.out.println("Data awal ");
        print(arr);
        int minOrMax = arr[0];
        int index = 0;
        int prosesSwap = 0;
        
        long startTime = System.nanoTime();
        for(int j=0;j<arr.length-1;j++){
            for(int i=j;i<data.length;i++){
                if(minOrMax < arr[i] && "DESC".equals(optionSort)){
                    minOrMax = arr[i];
                    index = i;
                }
                else if(minOrMax > arr[i] && "ASC".equals(optionSort)){
                    minOrMax = arr[i];
                    index = i;
                }
            }
            if(arr[j] < minOrMax && "DESC".equals(optionSort)){
                arr[index] = arr[j];
                arr[j] = minOrMax;
                prosesSwap++;
            }
            else if(arr[j] > minOrMax && "ASC".equals(optionSort)){
                arr[index] = arr[j];
                arr[j] = minOrMax;
                prosesSwap++;
            }
            minOrMax = arr[j+1];
        }
        
        long endTime = System.nanoTime();
        System.out.println("Hasil array " + optionSort + " " + Arrays.toString(arr));
        System.out.println("Data yang dibutuhkan " + (endTime - startTime)/1000000.0 + " seconds");
        System.out.println(prosesSwap + " Swap dilakukan \n");
    }
    
    public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}