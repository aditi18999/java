public class Demo12 {
    public static void main(String[] args){

    int a = 123;
    int sum = 0;
    while( a !=0){
        sum +=a % 10;

        a = a / 10;


    }
        System.out.println("sum of digits of a: " +sum);
        
}



}
