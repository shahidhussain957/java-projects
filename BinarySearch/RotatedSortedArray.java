public class RotatedSortedArray{
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=5;
        System.out.println("The Pivot found at "+findPivot(arr)+ " index.");
        System.out.println(search(arr, target));
    }
    public static int search(int nums[],int target){
        int pivot=findPivot(nums);
        //if you did not find a pivot ,then it means this is not rotated array.
        if(pivot==-1){
            //just do simple binary search.
           return binarySearch(nums, target, 0, nums.length-1);

        }
        //if you found the pivot element then it means you have 2 asc ordered array.
        // again here 3 case
        //1st case.
        if(nums[pivot]==target){
            return pivot;
        }
        //2nd case.
        if(target>=nums[0]){
          return binarySearch(nums, target, 0, pivot-1);  
        }
        //3rd case.
        return binarySearch(nums, target, pivot+1,nums.length-1);
    }
    //doing simple binary search if pivot not found.
    public static int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end -start)/2;
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
        return -1;
    }
    //founding pivot in an given array.
    public static int findPivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //Here we apply 4 case which we learnt.
            if(mid < end && arr[mid]>arr[mid+1]){//1st case.
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){//2nd case.
                return mid-1;
            }
            if(arr[mid]<=arr[start]){//3rd case.
                end=mid-1;
            }
            else{//4th case.
                start=mid+1;
            }
        }
        return -1;
    }
}