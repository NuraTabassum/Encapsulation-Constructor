package JavaSession5Assignments;

public class Session3 {
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int j=0; j < n-1; j++){  
                 for(int i=0; i < (n-1); i++){  
                          if(arr[i] > arr[i+1]){  
                                 //swap elements  
                                 temp = arr[i];  
                                 arr[i] = arr[i+1];  
                                 arr[i+1] = temp;  
                         }  
                 }    
                 }  
         }  

    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
         
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

}  
}  