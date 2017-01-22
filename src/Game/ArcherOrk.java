package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class ArcherOrk implements Archer {
    public double shoot(){
        tempMagicValue = magicValue;
        output = "Orks archer is shooting (-" + 3*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 3*tempMagicValue;
    }
    public double attack(){
        tempMagicValue = magicValue;
        output = "Orks archer is attacking (-" + 2*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 2*tempMagicValue;
    }
    private int archerOrkProperty;
    private double archerOrkLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public ArcherOrk(){
        archerOrkProperty = (new Random()).nextInt(2);
        if (archerOrkProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.archerOrkProperty;
    }
    public void setProperty(int prop){
        this.archerOrkProperty = prop;
    }
    public double getLife(){
        return this.archerOrkLife;
    }
    public void setLife(double lifeLevel){
        this.archerOrkLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
