programme to check if two strings are rotation of one another
class match{
    public  static void  main(String args[]){
        String str1="apeksha";
        String str2="aashaap";
        String str3=str1+str1;
        if(str1.length()!=str2.length()){             //we have done this using kmp algorithm
            System.out.println("not a  rotation");
            }
        else if(str3.contains(str2)){
            System.out.println("it is rotation");
            }   
        System.out.println("not a rotation"); 
        }
}