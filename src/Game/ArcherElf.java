package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class ArcherElf implements Archer {
    public double shoot(){
        tempMagicValue = magicValue;
        output = "Elves archer is shooting (-" + 7*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 7*tempMagicValue;
    }
    public double attack(){
        tempMagicValue = magicValue;
        output = "Elves archer is attacking (-" + 3*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 3*tempMagicValue;
    }
    private int archerElfProperty;
    private double archerElfLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public ArcherElf(){
        archerElfProperty = (new Random()).nextInt(2);
        if (archerElfProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.archerElfProperty;
    }
    public void setProperty(int prop){
        this.archerElfProperty = prop;
    }
    public double getLife(){
        return this.archerElfLife;
    }
    public void setLife(double lifeLevel){
        this.archerElfLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
