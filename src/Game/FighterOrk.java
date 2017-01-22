package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class FighterOrk implements Fighter {
    public double fight(){
        tempMagicValue = magicValue;
        output = "Orks fighter is fighting (-" + 20*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 20*tempMagicValue;
    }
    private int fighterOrkProperty;
    private double fighterOrkLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public FighterOrk(){
        fighterOrkProperty = (new Random()).nextInt(2);
        if (fighterOrkProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.fighterOrkProperty;
    }
    public void setProperty(int prop){
        this.fighterOrkProperty = prop;
    }
    public double getLife(){
        return this.fighterOrkLife;
    }
    public void setLife(double lifeLevel){
        this.fighterOrkLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
