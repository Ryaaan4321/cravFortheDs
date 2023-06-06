package aryanhere.Striver;

import java.util.*;

public class mergeoverlapping {
    public static ArrayList<ArrayList<Integer>> mergeOverlapping(int arr[][]) {
        int n = arr.length;

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new ArrayList<>(Arrays.asList(start, end)));
        }
        // time complexity (O(NlogN)) + O(2*N)
        // if i tell u honestly i revised it multiple times did a dry run mltiple times then i got this ..
        return ans;
    }
  

    
        public static ArrayList<ArrayList<Integer>> mergeOverlapping1(int arr[][]) {
            int n = arr.length;
    
            Arrays.sort(arr, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });
    
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                    ans.add(new ArrayList<>(Arrays.asList(arr[i][0], arr[i][1])));
                } else {
                    ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
                }
            }
    
            return ans;
        }
    
        public static void main(String[] args) {
            int arr[][] = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
            ArrayList<ArrayList<Integer>> ans = mergeOverlapping1(arr);
    
            System.out.println("The merged arrays are:\n");
    
            for (ArrayList<Integer> aa : ans) {
                System.out.print("[" + aa.get(0) + " , " + aa.get(1) + "]");
            }
            System.out.println();
        }
    }
    