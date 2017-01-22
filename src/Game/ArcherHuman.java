package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class ArcherHuman implements Archer {
    public double shoot(){
        tempMagicValue = magicValue;
        output = "Humans archer is shooting (-" + 5*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 5*tempMagicValue;
    }
    public double attack(){
        tempMagicValue = magicValue;
        output = "Humans archer is attacking (-" + 3*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 3*tempMagicValue;
    }
    private int archerHumanProperty;
    private double archerHumanLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public ArcherHuman(){
        archerHumanProperty = (new Random()).nextInt(2);
        if (archerHumanProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.archerHumanProperty;
    }
    public void setProperty(int prop){
        this.archerHumanProperty = prop;
    }
    public double getLife(){
        return this.archerHumanLife;
    }
    public void setLife(double lifeLevel){
        this.archerHumanLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
