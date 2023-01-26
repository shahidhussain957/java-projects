public class Binary {
    public static void main(String args[]){
        int arr[]={5,10,22,26,28,30,55,80,90,110};
        int target=10;
        System.out.println("The " +target+" found at index "+Binary(arr, target));
    }
    public static int Binary(int arr[],int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
        
        if(target< arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
    }
}
