import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,1,0,0,1};

        int l=0;
        int r=arr.length-1;
        while(l<r){
        if(arr[l]==1&&arr[r]==0){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;


        }else if(arr[l]==0&& arr[r]==1){
            l++;
            r--; 
            
        } else if(arr[l]==0){
            l++;
        }
       
        
    }
        System.err.println(Arrays.toString(arr));
        }
}
