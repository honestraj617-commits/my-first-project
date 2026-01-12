<<<<<<< HEAD


public class Hello {
    public static void main(String[] args) {
        int [] arr = {10,200,30,40,90,80}; 
        int largest=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        System.err.println(arr[largest]);
    }
}
=======


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
>>>>>>> 60bc5b58c3b7c4631bcf351c677a765546af156f
