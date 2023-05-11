import java.util.*;
class circle{
    public float radius;
    double celculate_area_of_circle(){
        return Math.PI*radius*radius;
    }
}
class Silender extends circle{
    float height;
    Silender(float height){
        this.height=height;
    }
    double area(){
        return Math.PI*radius*radius*height;
    }
}
public class prectic_set_chapter_10 {
    public static void main(String[] args) {

    }
}
