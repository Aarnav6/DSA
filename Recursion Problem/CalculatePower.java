public class CalculatePower{
    public static int calcPow(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        if(pow%2 == 0) {
            return calcPow(num,pow/2)*calcPow(num,pow/2);
        }
        else{
            return calcPow(num,pow/2)*calcPow(num,pow/2) * num;
        }
    }
    public static void main(String[] args) {
        System.out.println(calcPow(2,10));
    }
}
// time complexity is log(n) with base 2 , where n is power 