package Diziler;

import java.util.Arrays;

public class DublicatedNumbers {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] listem = new int[]{2, 6, 3, 13, 6, 2, 7, 8, 8, 14};
        int[] dublicate = new int[listem.length];
        int startIndex = 0;

        for (int i = 0; i < listem.length; i++){
            for (int j = 0; j < listem.length; j++){
                if((i != j) && (listem[i] == listem[j])){
                    if(listem[i] % 2 == 0){
                        if(!isFind(dublicate, listem[i])){
                            dublicate[startIndex++] = listem[i];
                        }
                        break;
                    }
                }
            }
        }

        for(int value : dublicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
