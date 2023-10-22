//Linear search means, checking the elements/values one by one. And when we find the element that
// we were looking for, then returns the value.

package MissionDSA.Arrays;

public class LinearSearch {
    //function for searching the key.
    public static int linear_search(int m[],int key) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == key) {
                return i;
            }
        }
        return -1;      //return statement of element not found.
    }
    public static void main(String[] args) {
        int m[] = {2,4,6,8,10,12,14,16};
        int key = 15;       //the key value which we have to find in the array.

        int index = linear_search(m, key);      //storing the function into variable for applying
                                                //conditions easily
        if(index == -1){
            System.out.println("Key Not Found!");
        } else {
            System.out.println("key is at index : "+index);
        }
    }
}
