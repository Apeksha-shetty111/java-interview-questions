//programme to find if all the characters are unique in string
import java.util.*;
class unique{
    public static void main(String args[]){
        String str="apeksha";
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                System.out.println("not unique");
                System.exit(0);
                }
            }
        }
        System.out.println("unique");
    }
}

