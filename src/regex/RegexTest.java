package regex;

        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.nio.charset.StandardCharsets;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        //case1
        String DATE_STRING = "javaneseJava5y";
        String P_COMM = "[Jj]ava.?";
        //Matcher() is not public, Cannot be accessed from outside package
        //Pattern() has private access
        Pattern pattern = Pattern.compile(P_COMM);
        Matcher matcher = pattern.matcher(DATE_STRING);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("start = " + start);
            System.out.println("end = " + end);
            System.out.println(matcher.group());
        }

        //case2 group
        String DATE_STRING2 = "2017-04-25ght2019-01-8ffhdk782018-08-09";
        //String DATE_STRING2 = "2017-04-25";
        String P_COMM2 = "(\\d{4})-((\\d{2})-(\\d{2}))";
        Pattern pattern2 = Pattern.compile(P_COMM2);
        Matcher matcher2 = pattern2.matcher(DATE_STRING2);
        //matches是查看整个字符串是否匹配，find是查看有无匹配的子字符串
        //System.out.println(matcher2.matches());
        while(matcher2.find()){
            System.out.println(matcher2.group(0));
            System.out.println(matcher2.group(1));
                System.out.println(matcher2.start(1));
                System.out.println(matcher2.end(1));
            System.out.println(matcher2.group(2));
            System.out.println(matcher2.group(3));
            System.out.println(matcher2.group(4));
        }


        //case3 URL
        String url = "http://horstmann.com";
        try {
            //new URL(url).openStream() equals to new URL(url).openConnection().getInputStream()
            InputStreamReader in = new InputStreamReader(new URL(url).openStream(), StandardCharsets.UTF_8);
            StringBuilder input = new StringBuilder();
            int ch;
            while((ch = in.read()) != -1)
                input.append((char)ch);
            String patternString = "<a\\s+href\\s*=\\s*(\"[^\"]*\"|[^\\s]*)\\s*>";
            Pattern pattern3 = Pattern.compile(patternString);
            Matcher matcher3 = pattern3.matcher(input);
            System.out.println("matcher3.groupCount() = " + matcher3.groupCount());
            while(matcher3.find()){
                String match = matcher3.group();
                System.out.println(match);
                System.out.println("hhhhhhhhhhhhh");
            }
            System.out.println(matcher3.replaceAll("#"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
