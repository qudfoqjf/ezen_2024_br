package 팀과제.팀과제4.과자;

import java.util.Scanner;

public class Raise {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Tamagotchi tamagotchi  = null ;

        while (true){
            if( tamagotchi == null ){ System.out.println("0.생성"); }
            else{
                System.out.println("╭◜◝ ͡ ◜◝ ╮\n" +
                        "( Ꮚ ´ ꒳ ` Ꮚ\n" +
                        "╰◟◞ ͜ ◟◞╯\n");
                System.out.println( " HP : "+ tamagotchi.hp);
                System.out.println( " 지능 : "+ tamagotchi.지능);
                System.out.println( " 스피드 : "+ tamagotchi.스피드 );
                System.out.println("먹이주기 : 1.새우깡 2.감자깡 3.고구마깡");
            }
            int ch = scanner.nextInt();
            if( ch == 0 ){
                tamagotchi = new Tamagotchi();
            }
            if( ch == 1 ){
                ShrimpSnack shrimpSnack = new ShrimpSnack();
                tamagotchi.eat( shrimpSnack );
            }
            if( ch == 2 ){
                PotatoSnack potatoSnack = new PotatoSnack();
                tamagotchi.eat( potatoSnack );
            }
            if( ch == 3 ){
                SpotatoSnack spotatoSnack =  new SpotatoSnack();
                tamagotchi.eat( spotatoSnack );
            }

        }
    }
}
/*


        Tamagotchi tamagotchi = new Tamagotchi();

        ShrimpSnack shrimpSnack = new ShrimpSnack(); // - 다형성
        PotatoSnack potatoSnack = new PotatoSnack(); // - 다형성
        SpotatoSnack spotatoSnack =  new SpotatoSnack(); // - 다형성

        tamagotchi.eat( shrimpSnack );
        tamagotchi.eat( potatoSnack );
        tamagotchi.eat( spotatoSnack );

* */