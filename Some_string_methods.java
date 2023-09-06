//some string methods
import java.lang.String;
public class Some_string_methods {
    public static void main(String[] args) {
        String st=new String("Deepak Mewada"); 
        System.out.println(st);
        System.out.println("lenth of input string is = "+st.length());
        System.out.println("In UPPER case = "+st.toUpperCase());
        System.out.println("IN lower case = "+st.toLowerCase());
        String name=new String("   Deepak   ");
        System.out.println("before Trim methode = "+name);
        System.out.println("After Trim methode = "+name.trim());
        System.out.println("Substring methode = "+st.substring(9));
        System.out.println("Substring Methode beging & end = "+st.substring(5,12));
        System.out.println("d\reepa\bk \"me\fwada\" ");
        //\r -->remove all charecter of before
        //\b--> remove first charecter of before
        //\f-->fit specal charecter
        //\" insert bouble charecter
        System.out.println("Substring (4)= "+st.substring(4));
        System.out.println("Substring/sclising (3,9)= "+st.substring(3,9));
        System.out.println("start with = "+st.startsWith("Me"));
        System.out.println("Ends with = "+st.endsWith("d"));
        System.out.println("Index of \"d\"= "+st.indexOf("d"));
        System.out.println("index of, but after this(5) index = "+st.indexOf("wa",5));
        System.out.println("charecter of this index = "+st.charAt(5));
        System.out.println("Last index of this char \"w\" = "+st.lastIndexOf("w"));
        System.out.println("Last index of thsi char \"w\" but yaha tak (6) = "+st.lastIndexOf("w",6));
        System.out.println("campare string with casesensitive = "+st.equals("Deepak mewada"));
        System.out.println("camper string egnore casesensitive = "+st.equalsIgnoreCase("deepAK mEwaDA"));
        System.out.println(st.substring(0,1));
    }
}
