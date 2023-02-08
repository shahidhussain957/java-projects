public class CeilingBinary {
    public static void main(String args[]){
        //finding smallest number greater than the target value or equal to target.
        int arr[]={1,5,6,8,10,15,17,18,25,27,30,35,7,40};
        int target=7;
        System.out.println("The Target value found at "+Binary(arr, target));
    }
    public static int Binary(int arr[],int target){
        //but what if the target element is greatest than the greatest element of an array.
        if(target>arr.length-1){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
