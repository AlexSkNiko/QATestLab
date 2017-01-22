package Game;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Alex on 18.01.2017.
 */
public class Start {
    static String logFile = "log.txt";
    public static void main(String[] args) throws IOException{
        ArrayList<String> listVip1;
        ArrayList<String> listGeneral1;
        ArrayList<String> listVip2;
        ArrayList<String> listGeneral2;
        ArrayList<String> listAll1;
        ArrayList<String> listAll2;
        ArrayList<String> listLogs = new ArrayList<>();
        ArrayList<String> listLogsTemp;
        listLogs.add("Start the program!");
        System.out.println("Start the program!");
        listLogs.add("-------------------");
        System.out.println("-------------------");
        Random randMove = new Random();
        int move;
        int indexVip;
        Random randVip = new Random();
        int indexGeneral;
        String nameForce1;
        String nameForce2;
        Random randGeneral = new Random();
        ArrayList<Race> listRight = new ArrayList<>();
        listRight.add(new ForceElf());
        listRight.add(new ForceHuman());
        ArrayList<Race> listWrong = new ArrayList<>();
        listWrong.add(new ForceOrks());
        listWrong.add(new ForceUndeads());
        Random randRightForce = new Random();
        int indexRight = randRightForce.nextInt(listRight.size());
        Race force1 = listRight.get(indexRight);
        if (indexRight == 0){
            nameForce1 = "Elves ";
            listLogs.add("Elves force is created.");
            System.out.println("Elves force is created.");
            listLogs.add("-------------------");
            System.out.println("-------------------");
        }
        else {
            nameForce1 = "Humans ";
            listLogs.add("Humans force is created.");
            System.out.println("Humans force is created.");
            listLogs.add("-------------------");
            System.out.println("-------------------");
        }
        listLogs.add("Mag life: " + force1.mag.getLife());
        System.out.println("Mag life: " + force1.mag.getLife());
        listLogs.add("Archer1 life: " + force1.archer1.getLife());
        System.out.println("Archer1 life: " + force1.archer1.getLife());
        listLogs.add("Archer2 life: " + force1.archer2.getLife());
        System.out.println("Archer2 life: " + force1.archer2.getLife());
        listLogs.add("Archer3 life: " + force1.archer3.getLife());
        System.out.println("Archer3 life: " + force1.archer3.getLife());
        listLogs.add("Fighter1 life: " + force1.fighter1.getLife());
        System.out.println("Fighter1 life: " + force1.fighter1.getLife());
        listLogs.add("Fighter2 life: " + force1.fighter2.getLife());
        System.out.println("Fighter2 life: " + force1.fighter2.getLife());
        listLogs.add("Fighter3 life: " + force1.fighter3.getLife());
        System.out.println("Fighter3 life: " + force1.fighter3.getLife());
        listLogs.add("Fighter4 life: " + force1.fighter4.getLife());
        System.out.println("Fighter4 life: " + force1.fighter4.getLife());
        listLogs.add("-------------------");
        System.out.println("-------------------");
        Random randWrongForce = new Random();
        int indexWrong = randWrongForce.nextInt(listWrong.size());
        Race force2 = listWrong.get(indexWrong);
        if (indexWrong == 0){
            nameForce2 = "Orks ";
            listLogs.add("Orks force is created.");
            System.out.println("Orks force is created.");
            listLogs.add("-------------------");
            System.out.println("-------------------");
        }
        else {
            nameForce2 = "Undeads ";
            listLogs.add("Undeads force is created.");
            System.out.println("Undeads force is created.");
            listLogs.add("-------------------");
            System.out.println("-------------------");
        }
        System.out.println("Mag life: " + force2.mag.getLife());
        listLogs.add("Mag life: " + force2.mag.getLife());
        System.out.println("Archer1 life: " + force2.archer1.getLife());
        listLogs.add("Archer1 life: " + force2.archer1.getLife());
        System.out.println("Archer2 life: " + force2.archer2.getLife());
        listLogs.add("Archer2 life: " + force2.archer2.getLife());
        System.out.println("Archer3 life: " + force2.archer3.getLife());
        listLogs.add("Archer3 life: " + force2.archer3.getLife());
        System.out.println("Fighter1 life: " + force2.fighter1.getLife());
        listLogs.add("Fighter1 life: " + force2.fighter1.getLife());
        System.out.println("Fighter2 life: " + force2.fighter2.getLife());
        listLogs.add("Fighter2 life: " + force2.fighter2.getLife());
        System.out.println("Fighter3 life: " + force2.fighter3.getLife());
        listLogs.add("Fighter3 life: " + force2.fighter3.getLife());
        System.out.println("Fighter4 life: " + force2.fighter4.getLife());
        listLogs.add("Fighter4 life: " + force2.fighter4.getLife());
        System.out.println("-------------------");
        listLogs.add("-------------------");
        if (force1.functionLifeForce()&&force2.functionLifeForce()){
            listLogs.add("The battle is beginning!");
            System.out.println("The battle is beginning!");
            listLogs.add("-------------------");
            System.out.println("-------------------");
            while (force1.functionLifeForce()&&force2.functionLifeForce()){
            move = randMove.nextInt(2);
            if (move==0){
                listLogs.add(nameForce1 + "force is moving!");
                System.out.println(nameForce1 + "force is moving!");
                listLogs.add("-------------------");
                System.out.println("-------------------");
                force1.functionSetList();
                listVip1 = force1.functionGetVip();
                listGeneral1 = force1.functionGetGeneral();
                listLogs.add("Vip list:");
                System.out.println("Vip list:");
                for (int i = 0; i<listVip1.size(); i++){
                    listLogs.add(listVip1.get(i));
                    System.out.println(listVip1.get(i));
                }
                listLogs.add("-------------------");
                System.out.println("-------------------");
                listLogs.add("General list:");
                System.out.println("General list:");
                for (int i = 0; i<listGeneral1.size(); i++){
                    listLogs.add(listGeneral1.get(i));
                    System.out.println(listGeneral1.get(i));
                }
                force2.setListAllNew();
                listAll2 = force2.getListAllNew();
                while (listVip1.size()>0){
                    indexVip = randVip.nextInt(listVip1.size());
                    listLogs.add("-------------------");
                    System.out.println("-------------------");
                    listLogs.add(listVip1.get(indexVip));
                    System.out.println(listVip1.get(indexVip));
                    force1.movePersonage(listVip1.get(indexVip),listAll2, force2, 1, 0);
                    listLogsTemp = force1.getListOutput();
                    for (int i = 0; i<listLogsTemp.size(); i++){
                        listLogs.add(listLogsTemp.get(i));
                    }
                    listLogsTemp.clear();
                    listVip1.remove(indexVip);
                }
                while (listGeneral1.size()>0){
                    indexGeneral = randGeneral.nextInt(listGeneral1.size());
                    listLogs.add("-------------------");
                    System.out.println("-------------------");
                    listLogs.add(listGeneral1.get(indexGeneral));
                    System.out.println(listGeneral1.get(indexGeneral));
                    force1.movePersonage(listGeneral1.get(indexGeneral),listAll2, force2, 1, 0);
                    listLogsTemp = force1.getListOutput();
                    for (int i = 0; i<listLogsTemp.size(); i++){
                        listLogs.add(listLogsTemp.get(i));
                    }
                    listLogsTemp.clear();
                    listGeneral1.remove(indexGeneral);
                }
                listAll2.clear();
                listLogs.add("-------------------");
                System.out.println("-------------------");
                listLogs.add(nameForce2 + "life:");
                System.out.println(nameForce2 + "life:");
                if (force2.mag.getLife() > 0) {
                    listLogs.add("MAG: " + force2.mag.getLife());
                    System.out.println("MAG: " + force2.mag.getLife());
                }
                else {
                    listLogs.add("MAG: fatality");
                    System.out.println("MAG: fatality");
                }
                if (force2.archer1.getLife()>0) {
                    listLogs.add("ARCHER1: " + force2.archer1.getLife());
                    System.out.println("ARCHER1: " + force2.archer1.getLife());
                }
                else {
                    listLogs.add("ARCHER1: fatality");
                    System.out.println("ARCHER1: fatality");
                }
                if (force2.archer2.getLife() > 0) {
                    listLogs.add("ARCHER2: " + force2.archer2.getLife());
                    System.out.println("ARCHER2: " + force2.archer2.getLife());
                }
                else {
                    listLogs.add("ARCHER2: fatality" );
                    System.out.println("ARCHER2: fatality" );
                }
                if (force2.archer3.getLife() > 0) {
                    listLogs.add("ARCHER3: " + force2.archer3.getLife());
                    System.out.println("ARCHER3: " + force2.archer3.getLife());
                }
                else {
                    listLogs.add("ARCHER3: fatality");
                    System.out.println("ARCHER3: fatality");
                }
                if (force2.fighter1.getLife() > 0){
                    listLogs.add("FIGHTER1: " + force2.fighter1.getLife());
                    System.out.println("FIGHTER1: " + force2.fighter1.getLife());
                }
                else {
                    listLogs.add("FIGHTER1: fatality");
                    System.out.println("FIGHTER1: fatality");
                }
                if (force2.fighter2.getLife() > 0){
                    listLogs.add("FIGHTER2: " + force2.fighter2.getLife());
                    System.out.println("FIGHTER2: " + force2.fighter2.getLife());
                }
                else {
                    listLogs.add("FIGHTER2: fatality");
                    System.out.println("FIGHTER2: fatality");
                }
                if (force2.fighter3.getLife() > 0) {
                    listLogs.add("FIGHTER3: " + force2.fighter3.getLife());
                    System.out.println("FIGHTER3: " + force2.fighter3.getLife());
                }
                else {
                    listLogs.add("FIGHTER3: fatality");
                    System.out.println("FIGHTER3: fatality");
                }
                if (force2.fighter4.getLife() > 0) {
                    listLogs.add("FIGHTER4: " + force2.fighter4.getLife());
                    System.out.println("FIGHTER4: " + force2.fighter4.getLife());
                }
                else {
                    listLogs.add("FIGHTER4: fatality");
                    System.out.println("FIGHTER4: fatality");
                }
                listLogs.add("-------------------");
                System.out.println("-------------------");
            }
            else {
                listLogs.add(nameForce2 + "force is moving!");
                System.out.println(nameForce2 + "force is moving!");
                listLogs.add("-------------------");
                System.out.println("-------------------");
                force2.functionSetList();
                listVip2 = force2.functionGetVip();
                listGeneral2 = force2.functionGetGeneral();
                listLogs.add("Vip list:");
                System.out.println("Vip list:");
                for (int i = 0; i<listVip2.size(); i++){
                    listLogs.add(listVip2.get(i));
                    System.out.println(listVip2.get(i));
                }
                listLogs.add("-------------------");
                System.out.println("-------------------");
                listLogs.add("General list:");
                System.out.println("General list:");
                for (int i = 0; i<listGeneral2.size(); i++){
                    listLogs.add(listGeneral2.get(i));
                    System.out.println(listGeneral2.get(i));
                }
                force1.setListAllNew();
                listAll1 = force1.getListAllNew();
                while (listVip2.size()>0){
                    indexVip = randVip.nextInt(listVip2.size());
                    listLogs.add("-------------------");
                    System.out.println("-------------------");
                    listLogs.add(listVip2.get(indexVip));
                    System.out.println(listVip2.get(indexVip));
                    force2.movePersonage(listVip2.get(indexVip),listAll1, force1, 1, 0);
                    listLogsTemp = force2.getListOutput();
                    for (int i = 0; i<listLogsTemp.size(); i++){
                        listLogs.add(listLogsTemp.get(i));
                    }
                    listLogsTemp.clear();
                    listVip2.remove(indexVip);
                }
                while (listGeneral2.size()>0){
                    indexGeneral = randGeneral.nextInt(listGeneral2.size());
                    listLogs.add("-------------------");
                    System.out.println("-------------------");
                    listLogs.add(listGeneral2.get(indexGeneral));
                    System.out.println(listGeneral2.get(indexGeneral));
                    force2.movePersonage(listGeneral2.get(indexGeneral),listAll1, force1, 1, 0);
                    listLogsTemp = force2.getListOutput();
                    for (int i = 0; i<listLogsTemp.size(); i++){
                        listLogs.add(listLogsTemp.get(i));
                    }
                    listLogsTemp.clear();
                    listGeneral2.remove(indexGeneral);
                }
                listAll1.clear();
                listLogs.add("-------------------");
                System.out.println("-------------------");
                listLogs.add(nameForce1 + "life:");
                System.out.println(nameForce1 + "life:");
                if (force1.mag.getLife() > 0) {
                    listLogs.add("MAG: " + force1.mag.getLife());
                    System.out.println("MAG: " + force1.mag.getLife());
                }
                else {
                    listLogs.add("MAG: fatality");
                    System.out.println("MAG: fatality");
                }
                if (force1.archer1.getLife()>0) {
                    listLogs.add("ARCHER1: " + force1.archer1.getLife());
                    System.out.println("ARCHER1: " + force1.archer1.getLife());
                }
                else {
                    listLogs.add("ARCHER1: fatality");
                    System.out.println("ARCHER1: fatality");
                }
                if (force1.archer2.getLife() > 0) {
                    listLogs.add("ARCHER2: " + force1.archer2.getLife());
                    System.out.println("ARCHER2: " + force1.archer2.getLife());
                }
                else {
                    listLogs.add("ARCHER2: fatality");
                    System.out.println("ARCHER2: fatality" );
                }
                if (force1.archer3.getLife() > 0) {
                    listLogs.add("ARCHER3: " + force1.archer3.getLife());
                    System.out.println("ARCHER3: " + force1.archer3.getLife());
                }
                else {
                    listLogs.add("ARCHER3: fatality");
                    System.out.println("ARCHER3: fatality");
                }
                if (force1.fighter1.getLife() > 0){
                    listLogs.add("FIGHTER1: " + force1.fighter1.getLife());
                    System.out.println("FIGHTER1: " + force1.fighter1.getLife());
                }
                else {
                    listLogs.add("FIGHTER1: fatality");
                    System.out.println("FIGHTER1: fatality");
                }
                if (force1.fighter2.getLife() > 0){
                    listLogs.add("FIGHTER2: " + force1.fighter2.getLife());
                    System.out.println("FIGHTER2: " + force1.fighter2.getLife());
                }
                else {
                    listLogs.add("FIGHTER2: fatality");
                    System.out.println("FIGHTER2: fatality");
                }
                if (force1.fighter3.getLife() > 0) {
                    listLogs.add("FIGHTER3: " + force1.fighter3.getLife());
                    System.out.println("FIGHTER3: " + force1.fighter3.getLife());
                }
                else {
                    listLogs.add("FIGHTER3: fatality");
                    System.out.println("FIGHTER3: fatality");
                }
                if (force1.fighter4.getLife() > 0) {
                    listLogs.add("FIGHTER4: " + force1.fighter4.getLife());
                    System.out.println("FIGHTER4: " + force1.fighter4.getLife());
                }
                else {
                    listLogs.add("FIGHTER4: fatality");
                    System.out.println("FIGHTER4: fatality");
                }
                listLogs.add("-------------------");
                System.out.println("-------------------");
            }
            }
            if (force1.functionLifeForce()){
                listLogs.add(nameForce1 + "is win!");
                System.out.println(nameForce1 + "is win!");
            }
            else if (force2.functionLifeForce()){
                listLogs.add(nameForce2 + "is win!");
                System.out.println(nameForce2 + "is win!");
            }
            else {
                listLogs.add("Battle isn't ending!");
                System.out.println("Battle isn't ending!");
            }
            PrintWriter out = new PrintWriter(logFile);
            for (int i=0; i<listLogs.size(); i++){
                out.println(listLogs.get(i));
            }
            out.close();
        }
        else {
            if (force1.functionLifeForce()){
                listLogs.add(nameForce1 + "is win!");
                System.out.println(nameForce1 + "is win!");
            }
            else if (force2.functionLifeForce()){
                listLogs.add(nameForce2 + "is win!");
                System.out.println(nameForce2 + "is win!");
            }
            else {
                listLogs.add("Battle isn't beginning!");
                System.out.println("Battle isn't beginning!");
            }
        }
    }


}
