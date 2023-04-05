package APokemon;

abstract class Pokemon implements Attack {
    protected String name;
    protected String type;
    protected int health;

    public int setHealth(int n){
        this.health = this.health - n;
        return this.health;
    }

    public int getHealth(){
        return this.health;
    }

}
