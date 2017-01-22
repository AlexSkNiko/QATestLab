package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class FighterHuman implements Fighter {
    public double fight(){
        tempMagicValue = magicValue;
        output = "Humans fighter is fighting (-" + 18*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 18*tempMagicValue;
    }
    private int fighterHumanProperty;
    private double fighterHumanLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public FighterHuman(){
        fighterHumanProperty = (new Random()).nextInt(2);
        if (fighterHumanProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.fighterHumanProperty;
    }
    public void setProperty(int prop){
        this.fighterHumanProperty = prop;
    }
    public double getLife(){
        return this.fighterHumanLife;
    }
    public void setLife(double lifeLevel){
        this.fighterHumanLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
