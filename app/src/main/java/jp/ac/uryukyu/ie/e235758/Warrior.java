package jp.ac.uryukyu.ie.e235758;

public class Warrior extends LivingThing{
    public Warrior (String name, int maximumHP,int attack){
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing rival){
        int attack = (int)(getAttack() * 1.5);
        double hitPoint = getHitPoint();
        if (hitPoint > 0){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n"
                    ,getName(),rival.getName(),attack);
            rival.wounded(attack);
        }
    }
    @Override
    public void wounded(double damage){
        double hitPoint = getHitPoint();
        setHitPoint(hitPoint-damage);
        if( hitPoint < 0 ) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
        
    }

