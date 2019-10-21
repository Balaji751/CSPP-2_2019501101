class Calculator{
    public static void main(String[] args){
        Calculator b = new Calculator();
        System.out.println(b.add(3,4));
        System.out.println(b.sub(4,3));
        System.out.println(b.mul(3,4));
        System.out.println(b.div(4,3));

    }
}
interface Calculator{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class A implements Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
}