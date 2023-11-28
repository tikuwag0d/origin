
package jp.ac.uryukyu.ie.e235758;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest(){
        int defaulWarriorattack = 50;
        int defaulSlimeHP = 5000;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaulWarriorattack);
        Enemy slime = new Enemy("デモスライム", defaulSlimeHP, 10);

        for (int count= 0; count< 5; count++){
            demoWarrior.attackWithWeponSkill(slime);
        }
        assertEquals((defaulWarriorattack * 1.5)*5, defaulSlimeHP - slime.getHitPoint());

    }
}
