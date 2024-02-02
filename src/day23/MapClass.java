package day23;

public class MapClass<E,F> {
    private Object[] array;
    private int size;
    public  MapClass(){
        array = new Object[0];
    }
    public boolean add(E key,F value){
        // 1.사이즈 증가
        size+=2;
        // 2. 배열 길이의 마지막인덱스의 매개변수 저장
            // 배열 메모리 재할당해서 가변길이 만들기
            //1. 현재 size 만큼 배열 선언
        Object[] newArray = new Object[size];
        // 2. 배열복사: 기존 배열에 있던 객체들을 새로운 배열에 저장
        for (int i=0; i< this.array.length;i++){
            newArray[i]= array[i];
        }
        //3. 기존배열 필드에 새로운 배열 대입
        array = newArray;
        //4. 마직막 인덱스에 매개변수 대입
        array[size-2] = key;    //자동형변환
        array[size-1] = value;
        return true;
    }


    //toString

    public F get(E key){
        F result=null;
        for(int i=0 ;i<this.array.length;i++){
            if(key==array[i]){
                result=(F)array[i+1];

            }

        } System.out.println(result);
        return result ;
    }
    public boolean remove(int index){
        //1. 배열의 사이즈 감소.
        this.size-=2;
        //2. 감소된 사이즈 만큼 배열 재할당
        Object[] newArray=new Object[size];
        int j=0;
        for (int i=0; i<this.array.length-2;i++){
            newArray[j]=array[i];
            // 삭제: 삭제할 인덱스를 빼고 카피.
            // 만약에 삭제할 인덱스(매개변수)가 아니면
            if(index*2!=i||index*2+1!=i) j++;
        }
        array=newArray;
        return true;
    }
    public int size(){return size/2;}








    public String toString(){
        String str="[";
        for(int i= 0;i<this.array.length/2;i++){
            // 각 인덱스의 값을 str 대입
            str+=i+". "+ "key:"+array[i*2].toString()+" value:"+array[i*2+1];
            // 마지막 인덱스가 아니면 ,추가
            str+= i==this.array.length/2-1? "":", ";
        }
        return str +"]";
    }
}
