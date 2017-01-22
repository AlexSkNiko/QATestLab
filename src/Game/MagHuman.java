package Game;

import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class MagHuman implements Mag{
    public double upgrade(){
        output = "Humans mag is upgrading their soldier";
        System.out.println(output);
        return -2;
    }
    public double degrade(){
        tempMagicValue = magicValue;
        output = "Humans mag is degrading opposite soldier (-" + 4*tempMagicValue + ")";
        System.out.println(output);
        magicValue=1;
        return 4*tempMagicValue;
    }
    private int magHumanProperty;
    private double magHumanLife = 100;
    private double magicValue = 1;
    private double tempMagicValue;
    private String output;
    public MagHuman(){
        magHumanProperty = (new Random()).nextInt(2);
        if (magHumanProperty == 1){
            magicValue = 1.5;
        }
    }
    public int getProperty(){
        return this.magHumanProperty;
    }
    public void setProperty(int prop){
        this.magHumanProperty = prop;
    }
    public double getLife(){
        return this.magHumanLife;
    }
    public void setLife(double lifeLevel){
        this.magHumanLife = lifeLevel;
    }
    public void setMagicValue(double magic){
        this.magicValue = magic;
    }
    public String getOutput(){return this.output;}
}
