class Objects{
    public static void main(String ar[]){
        int number1=8;
        int number2=11;
        Calculator calc = new Calculator();
        int res = calc.multiplication(number1,number2);
        System.out.println(res);
    }
}

class Calculator{
    public int multiplication(int a,int b){
        return a*b;
    }
}