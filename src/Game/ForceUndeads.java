package Game;

/**
 * Created by Alex on 18.01.2017.
 */
class ForceUndeads extends Race {
    public ForceUndeads(){
        mag = new MagUndead();
        archer1 = new ArcherUndead();
        archer2 = new ArcherUndead();
        archer3 = new ArcherUndead();
        fighter1 = new FighterUndead();
        fighter2 = new FighterUndead();
        fighter3 = new FighterUndead();
        fighter4 = new FighterUndead();
    }

}
