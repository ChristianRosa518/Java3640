package APokemon;

public interface Attack {
    String performAttack( int attackIndex, Pokemon defender);

    int chooseMove();
}
