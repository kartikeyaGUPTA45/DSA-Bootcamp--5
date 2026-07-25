import java.util.*;


public class Main
{
    
    public static void printArrayList(ArrayList<Integer> arr) {
        System.out.println("Printing the ArrayList");
        for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
    
    public static void removeFromArrayList(ArrayList<Integer> arr, int idx) {
        arr.remove(idx);
    }
    
    public static void updateIndexValue(ArrayList<Integer> arr, int idx, int newValue) {
        arr.set(idx, newValue);
    }
    
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		printArrayList(arr);
		System.out.println("Size before removing element : " +  arr.size());
		removeFromArrayList(arr, 1);
		System.out.println("Size after removing element : " +  arr.size());
		printArrayList(arr);
		updateIndexValue(arr, 1, 50);
		printArrayList(arr);
	}
}
