 class Constrecter_1{
    private int id;
    private String name;
    Constrecter_1(int n){
        id=n;
        getdetil();
    }
    Constrecter_1(String E_name){
        name=E_name;
        getdetil();
    }
    Constrecter_1(int n,String E_name){
        id=n;
        name=E_name;
        getdetil();
    }
    void getdetil(){
        System.out.println("Emmploy id -> "+id);
        System.out.println("Emmploy name -> "+name);
    }
}
class Constrecter{
    public static void main(String[] args) {
        Constrecter_1 c1=new Constrecter_1(65);
        new Constrecter_1("Deepak");
        new Constrecter_1(23,"Mewada");
        new Constrecter_1(90).getdetil();
    }
}
