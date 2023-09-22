class Arithmetic{
    public static void main(String ar[]){
        int a = 7;
        int b = 6;
        
        int add = a + b;
        int subtract = a - b;
        int product = a * b;
        int divide = a / b;
        int remainder = a % b;
        int postincrement = a++; // assign first then increment.[a--]
        int preincrement = ++a; // increment first the assign.[--a]
        int ans = a+=2; //same as {a = a+2},[a-=2, a*=2, a/=2, a%=2]

    }
}