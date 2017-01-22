package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class FighterElf implements Fighter {
    public double fight(){
        tempMagicValue = magicValue;
        output = "Elvis fighter is fighting (-" + 15*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 15*tempMagicValue;
    }
    private int fighterElfProperty;
    private double fighterElfLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public FighterElf(){
        fighterElfProperty = (new Random()).nextInt(2);
        if (fighterElfProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.fighterElfProperty;
    }
    public void setProperty(int prop){
        this.fighterElfProperty = prop;
    }
    public double getLife(){
        return this.fighterElfLife;
    }
    public void setLife(double lifeLevel){
        this.fighterElfLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
