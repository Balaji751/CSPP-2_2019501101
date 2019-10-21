class Operations{
    public static void main(String[] args){
        cal b = new cal();
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
class cal implements Calculator{
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int mul(int a,int b){
        int mul= a*b;
        return mul;
    }
    public int div(int a,int b){
        if(b!=0){
            int div=a/b;
            return div;
        }
        else{
            return 0;
        }
    }
}