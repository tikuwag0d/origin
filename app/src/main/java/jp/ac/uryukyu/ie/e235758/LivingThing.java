package jp.ac.uryukyu.ie.e235758;

public class LivingThing {
    private String name;
    private double hitPoint;
    private int attack;
    private boolean dead;

    LivingThing(String name,int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean state){
        dead =state;
    }
    public String getName(){
        return this.name;
    }
    public void setHitPoint(double remainingHP){
        this.hitPoint = remainingHP;
    }
    public double getHitPoint(){
        return this.hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }
    public void attack(LivingThing rival){
        if (getHitPoint() >0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",name, rival.getName(),damage);
            rival.wounded(damage);
        }
    }
    public void wounded(double damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
