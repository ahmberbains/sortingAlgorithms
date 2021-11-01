import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        int[] unsorted = new int[10];
        Random rand = new Random();
        for(int i=0; i < unsorted.length; i++){
            int r = rand.nextInt(10); // generating a random int from 0-9
            unsorted[i] = r; // add the random int to the list
        }
        // System.out.println(Arrays.toString(unsorted));

        // lets sort the list
        bubbleSort(unsorted);
    } // main
    static void bubbleSort(int[] list){
        System.out.printf("List before sorting: %s\n", Arrays.toString(list));

        for(int j=0; j < list.length; j++) {
            for(int i=0; i < list.length - 1 - j; i++){
                int l = list[i];
                int r = list[i+1];
                if(l > r){
                    list[i] = r;
                    list[i+1] = l;
                }
            }
        }

        System.out.printf("List after sorting: %s\n", Arrays.toString(list));
    } // bubbleSort

    static void bubbleSort1(int[] list){
        System.out.printf("List before sorting: %s\n", Arrays.toString(list));

        for(int j=0; j < list.length; j++) {
            for(int i=0; i < list.length - 1; i++){
                int l = list[i];
                int r = list[i+1];
                if(l > r){
                    list[i] = r;
                    list[i+1] = l;
                }
            }
        }

        System.out.printf("List after sorting: %s\n", Arrays.toString(list));
    } // bubbleSort

} //Main
