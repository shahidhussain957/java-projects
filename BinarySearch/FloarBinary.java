public class FloarBinary {
    public static void main(String args[]){
       //finding greatest value smaller than target or equal to target.
       int arr[]={1,3,5,6,8,10,15,18,20,25,27,30};
       int target=13; 
       System.out.println(Floor(arr,target));
    }
    public static int Floor(int arr[],int target){
        //but what if target is greater than the greatest number in the array.
        if(target>arr[arr.length-1]){
            return-1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; 
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
