package Game;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
class Race {
    Mag mag;
    Archer archer1;
    Archer archer2;
    Archer archer3;
    Fighter fighter1;
    Fighter fighter2;
    Fighter fighter3;
    Fighter fighter4;
    int indexMove;
    private ArrayList<String> listVip = new ArrayList<>();
    private ArrayList<String> listGeneral = new ArrayList<>();
    private ArrayList<String> listAll = new ArrayList<>();
    private ArrayList<String> listAllNew = new ArrayList<>();
    private ArrayList<String> listOutput = new ArrayList<>();
    public boolean functionLifeForce(){
        if (this.mag.getLife()>0||this.archer1.getLife()>0||this.archer2.getLife()>0||this.archer3.getLife()>0||
                this.fighter1.getLife()>0||this.fighter2.getLife()>0||this.fighter3.getLife()>0||this.fighter4.getLife()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void functionSetList() {
        if (this.mag.getLife() > 0) {
            if (this.mag.getProperty() == 1) {
                listVip.add("MAG");
            } else {
                listGeneral.add("MAG");
            }
        }
        if (this.archer1.getLife() > 0) {
            if (this.archer1.getProperty() == 1) {
                listVip.add("ARCHER1");
            } else {
                listGeneral.add("ARCHER1");
            }
        }
        if (this.archer2.getLife() > 0) {
            if (this.archer2.getProperty() == 1) {
                listVip.add("ARCHER2");
            } else {
                listGeneral.add("ARCHER2");
            }
        }
        if (this.archer3.getLife() > 0) {
            if (this.archer3.getProperty() == 1) {
                listVip.add("ARCHER3");
            } else {
                listGeneral.add("ARCHER3");
            }
        }
        if (this.fighter1.getLife() > 0) {
            if (this.fighter1.getProperty() == 1) {
                listVip.add("FIGHTER1");
            } else {
                listGeneral.add("FIGHTER1");
            }
        }
        if (this.fighter2.getLife() > 0) {
            if (this.fighter2.getProperty() == 1) {
                listVip.add("FIGHTER2");
            } else {
                listGeneral.add("FIGHTER2");
            }
        }
        if (this.fighter3.getLife() > 0) {
            if (this.fighter3.getProperty() == 1) {
                listVip.add("FIGHTER3");
            } else {
                listGeneral.add("FIGHTER3");
            }
        }
        if (this.fighter4.getLife() > 0) {
            if (this.fighter4.getProperty() == 1) {
                listVip.add("FIGHTER4");
            } else {
                listGeneral.add("FIGHTER4");
            }
        }
        for (int i = 0; i < listVip.size(); i++) {
            listAll.add(listVip.get(i));
        }
        for (int i = 0; i < listGeneral.size(); i++) {
            listAll.add(listGeneral.get(i));
        }
    }
    public void setListAllNew(){
        if (this.mag.getLife()>0.0){
            listAllNew.add("MAG");
        }
        if (this.archer1.getLife()>0.0){
            listAllNew.add("ARCHER1");
        }
        if (this.archer2.getLife()>0.0){
            listAllNew.add("ARCHER2");
        }
        if (this.archer3.getLife()>0.0){
            listAllNew.add("ARCHER3");
        }
        if (this.fighter1.getLife()>0.0){
            listAllNew.add("FIGHTER1");
        }
        if (this.fighter2.getLife()>0.0){
            listAllNew.add("FIGHTER2");
        }
        if (this.fighter3.getLife()>0.0){
            listAllNew.add("FIGHTER3");
        }
        if (this.fighter4.getLife()>0.0){
            listAllNew.add("FIGHTER4");
        }
    }
    public ArrayList<String> getListAllNew() { return listAllNew; }
    public ArrayList<String> functionGetVip(){
        return listVip;
    }
    public ArrayList<String> functionGetGeneral(){
        return listGeneral;
    }
    public void movePersonage(String personage, ArrayList<String> listAllForce, Race race, double moveMagic, int prop){
        if (personage=="MAG"){
            indexMove = (new Random()).nextInt(2);
            if (indexMove == 0){
                moveMag(this.mag.upgrade(),listAllForce, race, moveMagic, prop);
                this.mag.setProperty(prop);
                listOutput.add(this.mag.getOutput());
            }
            else {
                moveMag(this.mag.degrade(),listAllForce, race, moveMagic, prop);
                this.mag.setProperty(prop);
                listOutput.add(this.mag.getOutput());
            }
        }
        else if (personage=="ARCHER1"){
            indexMove = (new Random()).nextInt(2);
            if (indexMove == 0){
                moveArcher(this.archer1.shoot(),listAllForce, race, moveMagic, prop);
                this.archer1.setProperty(prop);
                listOutput.add(this.archer1.getOutput());
            }
            else {
                moveArcher(this.archer1.attack(),listAllForce, race, moveMagic, prop);
                this.archer1.setProperty(prop);
                listOutput.add(this.archer1.getOutput());
            }
        }
        else if (personage=="ARCHER2"){
            indexMove = (new Random()).nextInt(2);
            if (indexMove == 0){
                moveArcher(this.archer2.shoot(),listAllForce, race, moveMagic, prop);
                this.archer2.setProperty(prop);
                listOutput.add(this.archer2.getOutput());
            }
            else {
                moveArcher(this.archer2.attack(),listAllForce, race, moveMagic, prop);
                this.archer2.setProperty(prop);
                listOutput.add(this.archer2.getOutput());
            }
        }
        else if (personage=="ARCHER3"){
            indexMove = (new Random()).nextInt(2);
            if (indexMove == 0){
                moveArcher(this.archer3.shoot(),listAllForce, race, moveMagic, prop);
                this.archer3.setProperty(prop);
                listOutput.add(this.archer3.getOutput());
            }
            else {
                moveArcher(this.archer3.attack(),listAllForce, race, moveMagic, prop);
                this.archer3.setProperty(prop);
                listOutput.add(this.archer3.getOutput());
            }
        }
        else if (personage=="FIGHTER1"){
            moveFighter(this.fighter1.fight(),listAllForce, race, moveMagic, prop);
            this.fighter1.setProperty(prop);
            listOutput.add(this.fighter1.getOutput());
        }
        else if (personage=="FIGHTER2"){
            moveFighter(this.fighter2.fight(),listAllForce, race, moveMagic, prop);
            this.fighter2.setProperty(prop);
            listOutput.add(this.fighter2.getOutput());
        }
        else if (personage=="FIGHTER3"){
            moveFighter(this.fighter3.fight(),listAllForce, race, moveMagic, prop);
            this.fighter3.setProperty(prop);
            listOutput.add(this.fighter3.getOutput());
        }
        else {
            moveFighter(this.fighter4.fight(),listAllForce, race, moveMagic, prop);
            this.fighter4.setProperty(prop);
            listOutput.add(this.fighter4.getOutput());
        }
    }

    public void moveMag(double moveValue, ArrayList<String> listAllForce, Race race, double moveMagic, int prop){
        if (moveValue>=0){
            /*int indexOpponent = (new Random()).nextInt(listAllForce.size());
            String opponent = listAllForce.get(indexOpponent);*/
            race.setListAllNew();
            int indexOpponent = (new Random()).nextInt(race.getListAllNew().size());
            String opponent = race.getListAllNew().get(indexOpponent);
            listOutput.add("The attack on the " + opponent);
            System.out.println("The attack on the " + opponent);
            personageLife(opponent, moveValue, moveMagic, prop, race);
        }
        else{
            if (moveValue==-3.0){
                int indexOpponent = (new Random()).nextInt(listAllForce.size());
                String opponent = listAllForce.get(indexOpponent);
                listOutput.add("The attack on the " + opponent);
                System.out.println("The attack on the " + opponent);
                personageLife(opponent,0,0.5,prop, race);
            }
            else if (moveValue==-2.0){
                this.setListAllNew();
                int indexOpponent = (new Random()).nextInt(this.getListAllNew().size());
                String opponent = this.getListAllNew().get(indexOpponent);
                listOutput.add("The attack on the " + opponent);
                System.out.println("The update on the " + opponent);
                personageLife(opponent,0,1.5,1,this);
            }
            else{
                int indexOpponent = (new Random()).nextInt(listAllForce.size());
                String opponent = listAllForce.get(indexOpponent);
                listOutput.add("The attack on the " + opponent);
                System.out.println("The attack on the " + opponent);
                personageLife(opponent,0,moveMagic,2, race);
            }
        }
    }
    public void moveArcher(double moveValue, ArrayList<String> listAllForce, Race race, double moveMagic, int prop){
        int indexOpponent = (new Random()).nextInt(listAllForce.size());
        String opponent = listAllForce.get(indexOpponent);
        listOutput.add("The attack on the " + opponent);
        System.out.println("The attack on the " + opponent);
        personageLife(opponent,moveValue,moveMagic,prop, race);
    }
    public void moveFighter(double moveValue, ArrayList<String> listAllForce, Race race, double moveMagic, int prop){
        int indexOpponent = (new Random()).nextInt(listAllForce.size());
        String opponent = listAllForce.get(indexOpponent);
        listOutput.add("The attack on the " + opponent);
        System.out.println("The attack on the " + opponent);
        personageLife(opponent,moveValue,moveMagic,prop, race);
    }
    public void personageLife(String personage, double moveValue, double moveMagic, int moveProperty, Race race){
        if (personage=="MAG"){
            race.mag.setLife(race.mag.getLife()-moveValue);
            if (moveMagic!=1.0) {
                race.mag.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.mag.setProperty(1);
            }
            if (moveProperty==2){
                race.mag.setProperty(0);
            }
        }
        else if (personage=="ARCHER1"){
            race.archer1.setLife(race.archer1.getLife()-moveValue);
            if (moveMagic!=1.0) {
                race.archer1.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.archer1.setProperty(1);
            }
            if (moveProperty==2){
                race.archer1.setProperty(0);
            }
        }
        else if (personage=="ARCHER2"){
            race.archer2.setLife(race.archer2.getLife()-moveValue);
            if (moveMagic!=1.0) {
                race.archer2.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.archer2.setProperty(1);
            }
            if (moveProperty==2){
                race.archer2.setProperty(0);
            }
        }
        else if (personage=="ARCHER3"){
            race.archer3.setLife(race.archer3.getLife()-moveValue);
            if (moveMagic!=1.0) {
                race.archer3.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.archer3.setProperty(1);
            }
            if (moveProperty==2){
                race.archer3.setProperty(0);
            }
        }
        else if (personage=="FIGHTER1"){
            race.fighter1.setLife(race.fighter1.getLife() - moveValue);
            if (moveMagic!=1.0) {
                race.fighter1.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.fighter1.setProperty(1);
            }
            if (moveProperty==2){
                race.fighter1.setProperty(0);
            }
        }
        else if (personage=="FIGHTER2"){
            race.fighter2.setLife(race.fighter2.getLife() - moveValue);
            if (moveMagic!=1.0) {
                race.fighter2.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.fighter2.setProperty(1);
            }
            if (moveProperty==2){
                race.fighter2.setProperty(0);
            }
        }
        else if (personage=="FIGHTER3"){
            race.fighter3.setLife(race.fighter3.getLife() - moveValue);
            if (moveMagic!=1.0) {
                race.fighter3.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.fighter3.setProperty(1);
            }
            if (moveProperty==2){
                race.fighter3.setProperty(0);
            }
        }
        else {
            race.fighter4.setLife(race.fighter4.getLife()-moveValue);
            if (moveMagic!=1.0) {
                race.fighter4.setMagicValue(moveMagic);
            }
            if (moveProperty==1){
                this.fighter4.setProperty(1);
            }
            if (moveProperty==2){
                race.fighter4.setProperty(0);
            }
        }
    }
    public ArrayList<String> getListOutput(){
        return listOutput;
    }
}
