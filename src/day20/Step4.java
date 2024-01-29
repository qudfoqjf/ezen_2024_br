package day20;

public class Step4 {

    //1.
    public static  void printLength(String data){
        //-- 예외가 발생 할 것 같은 코드
        try {
            int result = data.length();         // .(도트): 참조객체의 인스턴스 멤버 호출
            System.out.println("문자 수:" + result);
        }  //-- 예외가 발생 할 것 같은 코드
        catch(NullPointerException e){
            System.out.println();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("마무리실행");
        }
    }// m end

    public static void main(String[] args) {
        //1. [실행예외] NullPointerException
        printLength("This is JAVA");
        printLength(null);  // null이면 참조가 없으므로 .(도트) 불가능

        //2. [일반예외] ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

        //3.
        String[] array = {"100","1oo"};
        for (int i=0; i< array.length;i++){
            try {
                int value = Integer.parseInt(array[i]);  //NumberFormatException :"1oo"는 정수타입으로 변환 불가능
                                                         //ArrayIndexOutOfBoundsException
            }catch (NullPointerException | NumberFormatException e){
                System.out.println("숫자로 변환할 수 없습니다"+e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨." + e.getMessage());
            }catch(Exception e){
                System.out.println("상위 예외클래스");
            }   // c end
        } // f end
    }// m end
}// c end
