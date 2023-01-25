public class Range{
    //find a number  in a range like between index 1 and 4.
    public static void main(String args[]){
        int arr[]={10,20,2,3,5,6,20,15,16};
        int target=15;
        System.out.println(Search(arr, target, 2, 7));

    }
    public static int Search(int arr[],int target,int start,int end){
        if(arr.length==0){
            return-1;
        }
        for(int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return-1;
    }
}