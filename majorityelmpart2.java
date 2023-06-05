package aryanhere.Striver;

import java.util.ArrayList;
import java.util.HashMap;

public class majorityelmpart2 {
    public static ArrayList<Integer> majorityelm2(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>(n);
    
        for (int i = 0; i < n; i++) {
            if (!ls.contains(arr[i])) {
                int cnt = 0;
    
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        cnt++;
                    }
                }
    
                if (cnt > n / 3) {
                    ls.add(arr[i]);
                }
            }
    
            if (ls.size() == 2) {
                break;
            }
        }
    
        return ls;
    }
    
 
  //traversing with two loops so its O(N^2)
  public static ArrayList<Integer> majorityelement3(int arr[]) {
    int n = arr.length;
    ArrayList<Integer> lst = new ArrayList<>(n);
    // declaring this arraylist to store th valu..!

    HashMap<Integer, Integer> map = new HashMap<>(n);
    /// hashmap to count the occurences of the elm if they are greater thn min thn retrning them..!
    int min = (int) (n / 3) + 1;

    for (int i = 0; i < n; i++) {
        int value = map.getOrDefault(arr[i], 0);
        map.put(arr[i], value + 1);

        if (map.get(arr[i]) == min) {
            lst.add(arr[i]);
        }

        if (lst.size() == 2) {
            break;
        }
    }

    return lst;
}

    public static void main(String[] args){
        int arr[] = {22 , 22 , 5, 6 , 22 , 7 ,  8  , 22 , 22};
        ArrayList<Integer> ans = majorityelement3(arr);
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i) + " ");
        }
    }

    
}

