import java.util.ArrayList;
import java.util.List;

public class missingNumbersbyCyclicSort {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,9};
  System.out.println(cylicsort(arr));
    }
    public static List<Integer> cylicsort(int[] arr){
        int i=0;
        while(i<arr.length){
         int correct=arr[i];
     if(arr[i]<arr.length && arr[i]!=arr[correct]){
         swap(arr,i,correct);
            }
        else{i++;}}
        List<Integer> ans=new ArrayList<>() ;
        for(int j=0;j<arr.length;j++){
        if(arr[j]!=j+1){
           ans.add(j + 1); }
        }
    
        
        return ans;
     }
     public static void swap(int[] arr,int first,int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;
      }
    }