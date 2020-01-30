package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args){
        //匹配数字
        String input = "slfjaldfj345kjh3hk273jhi2u5h2367uh5";
        String regex = "[0-9]{1,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println("case1:" + matcher.group());
        //匹配n位数字
        regex = "[0-9]{3}";//\\d{3}
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println("case2:" + matcher.group());
        //匹配至少n位的数字
        regex = "[0-9]{3,}";//\\d{3,}
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println("case3:" + matcher.group());
        //匹配n-m位的数字
        regex = "[0-9]{3,4}";//\\d{3,4}
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        System.out.println(matcher.groupCount());
        while(matcher.find())
            System.out.println("case4:" + matcher.group());
        //匹配0和非0开头的数字
        input = "01";//0可以，01不可以
        regex = "^(0|[1-9][0-9]*)$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case5:" + matcher.group(0));
            System.out.println("case5:" + matcher.group(1));}
        //非零开头的最多带两位小数的数字
        input = "21.67";//
        regex = "^([1-9][0-9]*)(.[0-9]{1,2})?$";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case6:" + matcher.group(0));
            System.out.println("case6:" + matcher.group(1));
            System.out.println("case6:" + matcher.group(2));}
        //带1-2位小数的正数或负数
        input = "-89.34";//
        regex = "^(-)?([0-9]*)(.[0-9]{1,2})?$";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case7:" + matcher.group(0));
            System.out.println("case7:" + matcher.group(1));
            System.out.println("case7:" + matcher.group(2));
            System.out.println("case7:" + matcher.group(3));}
        //正数、负数和小数
        input = "76";
        regex = "^(-)?(0|[1-9][0-9]*)(.[0-9]*)?$";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case8:" + matcher.group(0));
            System.out.println("case8:" + matcher.group(1));
            System.out.println("case8:" + matcher.group(2));
            System.out.println("case8:" + matcher.group(3));}
        //有两位小数的正实数
        input = "12.31";
        regex = "^(0|[1-9][0-9]*)(.[0-9]{2})$";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case9:" + matcher.group(0));
            System.out.println("case9:" + matcher.group(1));
            System.out.println("case9:" + matcher.group(2)); }
        //非零正整数
        input = "12";
        regex = "^[1-9][0-9]*$";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case10:" + matcher.group(0)); }
        //汉字
        input = "12哈哈alsdf发好货k宽8带（）()";
        regex = "[\u4e00-\u9fa5]*";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case11:" + matcher.group(0)); }
        //字母和数字
        input = "12哈哈alsdf发好货k宽8带（）()";
        regex = "[a-zA-Z0-9]+";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case12:" + matcher.group(0)); }
        //字母、数字和下划线
        input = "12哈哈alsdf发好货k宽8带（）()";
        regex = "[A-Za-z0-9]";//
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("case12:" + matcher.group(0)); }
}

}
