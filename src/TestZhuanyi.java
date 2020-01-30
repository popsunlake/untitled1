public class TestZhuanyi {
    public static void main(String[] args){
        //u开头的转义序列可以出现在字符串之外，其它所有的转义字符都不行。
        System.out.println("\u0022+\u0022");//\u0022表示"，相当于""+""
        System.out.println("hello\u0009world");
        System.out.println("hello\tworld");



    }
}
