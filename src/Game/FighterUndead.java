package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class FighterUndead implements Fighter {
    public double fight(){
        tempMagicValue = magicValue;
        output = "Undeads fighter is fighting (-" + 18*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 18*tempMagicValue;
    }
    private int fighterUndeadProperty;
    private double fighterUndeadLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public FighterUndead(){
        fighterUndeadProperty = (new Random()).nextInt(2);
        if (fighterUndeadProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.fighterUndeadProperty;
    }
    public void setProperty(int prop){
        this.fighterUndeadProperty = prop;
    }
    public double getLife(){
        return this.fighterUndeadLife;
    }
    public void setLife(double lifeLevel){
        this.fighterUndeadLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
