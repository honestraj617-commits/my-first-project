import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int [] arr = {10,200,30,40,90,80}; 
        int largest=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        System.err.println(arr[largest]);
    }
}
