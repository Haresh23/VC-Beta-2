package bootcampdb;



import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class dobvalidation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$";
    public   dobvalidation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  validator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}

