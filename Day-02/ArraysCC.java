import java.util.*;
public class ArraysCC{
    public static int linearsearch(int number[], int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,3,4,6};
        int key=5;
        int index=linearsearch(number,key);
        if (index==-1){
            System.out.println("key " + key + "not found");
        }else{
            System.out.println("key"+ key + "found");
        }
    }
}


