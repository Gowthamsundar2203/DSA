public class NamesN{
    public void printNames(int i,int n){
       
        if(i >n){
            return;
        }

        else{
        
            System.out.println("Gowtham");
            printNames(i+1,n);
        
        }


        }

public class main{
    public static void main(String[] args){
        NamesN obj= new NamesN();
        obj.printNames(1,5);
    }
}
}