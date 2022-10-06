import java.util.*;
class duplicate{
    public static void main(String args[]){
        String str="apeksha";
        char ch[]=str.toCharArray();
        int i;

        for(i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                     System.out.println("the duplicate char are " +ch[i] );
                     break;
                     System.exit(0);

                    
                }
            }
        }
     
        
        System.out.println("no duplicates");    
    
    }

}