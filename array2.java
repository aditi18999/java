//Common Elements in Two Arrays
public class array2{
   public static void main(String[] args){
      int[] arr1 = {5, 10, 15};
      int[] arr1 = {1, 2, 3, 4};
      int[] arr2 = {3, 4, 5, 6};
System.out.print("Common elements: ");
 for (int i = 0; i < arr1.length; i++){
    for (int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]){
            System.out.print(arr1[i] + " ");
            break;
        }
    }
}
 