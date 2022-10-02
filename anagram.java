//program to print if two strings are anagram
import java.util.*;
class anagram{
    public static void main(String args[]){
        String s1="fool";
        String s2="flo";
        char cha[]=s1.toCharArray();
        char ch[]=s2.toCharArray();
        if(cha.length!=ch.length){
            System.out.println("not an anagaram");
            System.exit(0);
           
        }
        Arrays.sort(cha);
        Arrays.sort(ch);
        for(int i=0;i<cha.length;i++)
        {
            if(cha[i]!=ch[i]){
                System.out.println("not anagrams");
                System.exit(0);
            }
        }
        System.out.println("an anagram");

    }
}