package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class ArcherUndead implements Archer {
    public double shoot(){
        tempMagicValue = magicValue;
        output = "Undeads archer is shooting (-" + 4*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 4*tempMagicValue;
    }
    public double attack(){
        tempMagicValue = magicValue;
        output = "Undeads archer is attacking (-" + 2*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 2*tempMagicValue;
    }
    private int archerUndeadProperty;
    private double archerUndeadLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public ArcherUndead(){
        archerUndeadProperty = (new Random()).nextInt(2);
        if (archerUndeadProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.archerUndeadProperty;
    }
    public void setProperty(int prop){
        this.archerUndeadProperty = prop;
    }
    public double getLife(){
        return this.archerUndeadLife;
    }
    public void setLife(double lifeLevel){
        this.archerUndeadLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
