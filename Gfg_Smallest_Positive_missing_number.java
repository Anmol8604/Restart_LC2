public class Gfg_Smallest_Positive_missing_number {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 2, 3, 4, 5}, 5));
    }

    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int first = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++){
            if(arr[i] < 1) arr[i] = -1;
            else if(arr[i] > size) arr[i] = -1;
            else{
                mini  = Math.min(mini, arr[i]);
            }
        }

        int i = 0;
        int j = size-1;
        while(i <= j){
            if(arr[j] == -1){
                j--;
            }
            if(arr[i] == -1){
                arr[i] = arr[j];
                arr[j] = -1;
                i++;
            }else{
                i++;
            }
        }

        if(i == 0) return 1;
        if(i == size) return size+1;

        mini++;
        for(int k = 0; k <= i; k++) {
            if (arr[k] == mini) {
                mini++;
                k = -1;
            }
        }
        return mini;
    }
}
