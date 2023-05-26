package aryanhere.Striver;
public class singleElement {
    public static int getSingleElement1(int arr[]){
        int n = arr.length;
        int xorr = 0;
        for(int i = 0; i<n; i++){
            xorr = xorr^arr[i];
        }
        return xorr;
    }
    
    public static int getSingleElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[] = {1, 2, 2  };
        int ans = getSingleElement1(arr);
        System.out.println("The index of the single element is: " + ans);
    }
}

