public class twoSum {

    public static boolean sum(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        int sum=0;
        boolean res=false;
        while(l<r){
            sum=arr[l]+arr[r];
            if(sum<target){
                l++;
            }else if(sum>target){
                r--;

            }
            else{
                return true;
            }
        }
        return res;

    }



    public static void main(String[] args) {
        int arr[]={ 12,34,56,78};
        twoSum s=new twoSum();

        boolean r=s.sum(arr, 23);
        System.out.println(r);
    }
}
