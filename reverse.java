//reverse a string without using built in function
class reverse{
    public static void main(String  args[]){
        String str="apeksha";
        String reverse=" "; 
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}

//reverse a string using string builder 
import java.util.*;
class reverse{
    public static void main(String args[]){
        string str="apeksha";
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse(str);
        System.out.println(rev);


    }

}