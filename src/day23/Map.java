package day23;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        MapClass<String,Integer> mapClass =new MapClass<>();
        mapClass.add("가나다",123);
        mapClass.add("라마바",456);
        mapClass.add("사아자",789);
        mapClass.add("qwe",1234);
        mapClass.add("asd",5678);
        System.out.println(mapClass.toString());
        mapClass.get("qwe");
        mapClass.remove(0);
        System.out.println(mapClass.toString());
        System.out.println(mapClass.size());
    }

}
