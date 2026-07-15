public class onetoN {
    void printnumbers(int i, int n){
        if(i>n){
            return;
        }
        else{
            System.out.println(i);
            printnumbers(i+1,n);
        }
    }
}
class main{
    public static void main(String[] args){
        onetoN obj2= new onetoN();
        obj2.printnumbers(1,5);

    }

}
    

