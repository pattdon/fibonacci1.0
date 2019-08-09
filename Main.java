/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author patta
 */
public class Main {

    public static long fibFormula(long num){
        num = (long)((Math.pow((1+Math.sqrt(5))/2,num)- Math.pow((1-Math.sqrt(5))/2,num))/ Math.sqrt(5));
        return num;   
    }
    
    public static long fibListArrayList(long num){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i = 2;i < num+1;i++){
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get((int)num);
    }
    
    public static long fibListConstantArray(long num){
        long [] numAns = new long[1000];
        numAns[0] = 0;
        numAns[1] = 1;
        for(int i = 2;i < num+1;i++){
            numAns[i] = numAns[i-1]+numAns[i-2];
        }
        return numAns[(int)num];
    }

    public static long fibRecurs(long  num){
        if(num <= 1){
            return num;
        }else{
            return fibRecurs(num - 1)+fibRecurs(num - 2);
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(fibListConstantArray(20));
        System.out.println(fibFormula(20));
        System.out.println(fibListArrayList(20));
    }
    
}

























































