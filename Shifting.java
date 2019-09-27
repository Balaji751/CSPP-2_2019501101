import java.util.Arrays;
class shifting{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int count = 5;
        for(int i=0;i < count;i++){
            if(arr[i]==3){
               for(int j=i;j<count-1;j++){
                   arr[j]=arr[j+1];
                   
               }
               arr[arr.length-1] = 0;
               //count -= 1;
            }
        }
        // int [] a = new int[count];
        // for(int k=0; k<arr.length; k++){
        //     a[k] = arr[k];
        // }
        System.out.println(Arrays.toString(arr));
        
    }
}

