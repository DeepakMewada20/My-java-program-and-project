 class Constructor_1{
    private int id;
    private String name;
    //first constructor
    Constructor_1(int n){
        id=n;
        getdetil();
    }
    //second constructor
    Constructor_1(String E_name){
        name=E_name;
        getdetil();
    }
    //third constructor
    Constructor_1(int n,String E_name){
        id=n;
        name=E_name;
        getdetil();
    }
    //function
    void getdetil(){
        System.out.println("Emmploy id -> "+id);
        System.out.println("Emmploy name -> "+name);
    }
}
class Constructor{
    public static void main(String[] args) {
        new Constructor_1(65);                  //call first constructor
        new Constructor_1("Deepak");        //call second constructor
        new Constructor_1(23,"Mewada");  //call third constuctor
    }
}
