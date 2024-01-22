package 팀과제.팀과제4.과자;

public class Tamagotchi {

    int hp;
    int 스피드;
    int 지능;
    public void eat(Snack snack){
        snack.eat();

        if( snack instanceof  ShrimpSnack ){ this.hp++; }
        else if ( snack instanceof  PotatoSnack) {
            this.지능++;
        } else if ( snack instanceof SpotatoSnack) {
            this.스피드++;
        }
    }




}
