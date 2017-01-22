package Game;

/**
 * Created by Alex on 18.01.2017.
 */
class ForceHuman extends Race {
    public ForceHuman(){
        mag = new MagHuman();
        archer1 = new ArcherHuman();
        archer2 = new ArcherHuman();
        archer3 = new ArcherHuman();
        fighter1 = new FighterHuman();
        fighter2 = new FighterHuman();
        fighter3 = new FighterHuman();
        fighter4 = new FighterHuman();
    }

}
