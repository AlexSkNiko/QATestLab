package Game;

/**
 * Created by Alex on 18.01.2017.
 */
class ForceOrks extends Race {
    public ForceOrks(){
        mag = new MagOrk();
        archer1 = new ArcherOrk();
        archer2 = new ArcherOrk();
        archer3 = new ArcherOrk();
        fighter1 = new FighterOrk();
        fighter2 = new FighterOrk();
        fighter3 = new FighterOrk();
        fighter4 = new FighterOrk();
    }
}
