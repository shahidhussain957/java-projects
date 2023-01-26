public class BinaryAgnostic{
    public static void main(String args[]){
        int arr[]={10,20,30,33,35,66,77,88,99,105};
        int target=30;
        System.out.println(Binary(arr, target));

    }
    public static int Binary(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc;//boolean isAcs=arr[start]<arr[end]
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){//if the array is in asc. order then this will execute.
                if(target < arr[mid]){ 
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                } 
            }
            else{//if the array is in descending order then this will execute.
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid+1;
                }
            }
          
            
        }
        return -1;
    }
}