package backend.fifthweek.polymorphism.game.tool;

abstract public class Tool {
    protected int damage;
    protected Tool(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
}
