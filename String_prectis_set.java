public class String_prectis_set {
    public static void main(String[] args) {
        String name="Deepak Mewada";
        System.out.println("our string = "+name);
        System.out.println("replacs space to underscore = "+name.replace(" ","\""));
        String leter="Dear <|name|> , tnase a bt <|name|> <|name|>";
        System.out.println("our string = "+leter);
        System.out.println("replace <|name|> to Deepalk = "+leter.replace("<|name|>","Deepak"));
        String detect_space="       i am   deepak   mewada      ";
        System.out.println(detect_space);
        int space=0;
        for (int i=0;i<detect_space.length();i++){
            if(detect_space.charAt(i)==32){
                space=space+1;
                if(space==2){
                    System.out.println("2 space");
                    break;
                }
            }
        }
        System.out.println("meximum spacd of this string is = "+space);
        System.out.println("trim methade = "+detect_space.trim());
    }
}
