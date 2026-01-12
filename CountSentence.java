

public class CountSentence {
    public static void main(String[] args) {
        String str = "Java is Object oriented programming language";
        boolean isword=false ; 
        int count=0 ; 
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i) ; 
            if (ch!=' '){
            if(!isword){
                count++;
                isword=true ; 

            } 
        }
        else{
                isword=false;
            }
        

        }
        
        System.out.println("Count of the sentence is "+ count);
        
        
    }
}
