import jp.ac.uryukyu.ie.e235758.*;

public class Main {

 
    public static void main(String[] args){
        //Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 50, 3);
        Warrior warrior = new Warrior("戦士", 10, 6);
        //System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        //int turn = 0;
        //while( hero.getDead() == false && enemy.getDead() == false ){
            //turn++;
            //System.out.printf("%dターン目開始！\n", turn);
            //hero.attack(enemy);
            //enemy.attack(hero);
       // }
       // System.out.println("戦闘終了");
       System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());
       int turn = 0;
       while (warrior.isDead() == false && enemy.isDead() == false ) {
           turn++;
           if(warrior.isDead()){
            System.out.println("戦士は死んでいる");
           }
           else{
            System.out.println("戦士は生存している");
           }
           if(enemy.isDead()){
            System.out.println("スライムは死んでいる");
           }
           else{
            System.out.println("スライムは生存している");
           }
           System.out.printf("%dターン目開始！\n", turn);
           warrior.attackWithWeponSkill(enemy);
           enemy.attack(warrior);
       }
       System.out.println("戦闘終了");
    }
}
