package project190;

    //Students are standing in the row. given an input of weights of 
    //children find the position of a child, such that all students lighter to him are in his left 
    //and the ones heavier than him are in his right.
    

public class findchildposition {
    public static int findrightplace(int weightStu[] , int targeStu){
        int left = 0;
        int right = weightStu.length;
        while(left< right){
            int mid =  (left + right)/2;
             if(weightStu[mid] == targeStu){
                return mid;
             }
             if(weightStu[mid] < targeStu){
                left = mid + 1;
             }else{
                right = mid -1;
             }
        }
        return -1;
    }
    public static void main(String[]args){
        int weightStu[] = {  56, 54 ,63, 74 ,69};
        int targeStu = 63;
        int positionofStu = findrightplace(weightStu, targeStu);
        System.out.println("The right position f the student is " +positionofStu);
    }
   
}
