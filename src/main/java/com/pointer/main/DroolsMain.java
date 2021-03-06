package com.pointer.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.concurrent.TimeUnit;

public class DroolsMain {

    public static void main(String[] strs) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        KieSession ksession = kContainer.newKieSession();

//        Granary granary = new Granary(0.75);
//        Warehouse warehouse = new Warehouse();
//        Marketplace marketplace = new Marketplace();
//
//        Orchard orchard1 = new Orchard(granary, 3, 2);
//        Butchery butchery1 =  new Butchery(granary, 4, 1);
//        Cowshed cowshed1 = new Cowshed(granary, 3, 1);
//
//        Sawmill sawmill = new Sawmill(warehouse, 3, 1);
//        Quarry quarry = new Quarry(warehouse, 3, 1);
//        Ironworks ironworks = new Ironworks(warehouse, 3, 1);
//
//        Church church = new Church();
//
//        Gold gold = new Gold();
//        Happyness happyness = new Happyness(100);
//        Settlement settlement = new Settlement(100, granary, happyness, gold);
//
//        Time time = new Time(0);
//
//        ksession.insert(marketplace);
//        ksession.insert(church);
//        ksession.insert(granary);
//        ksession.insert(gold);
//        ksession.insert(settlement);
//        ksession.insert(happyness);
//
//        ksession.insert(orchard1);
//        ksession.insert(butchery1);
//        ksession.insert(cowshed1);
//
//        ksession.insert(sawmill);
//        ksession.insert(quarry);
//        ksession.insert(ironworks);

        Settlement settlement = new Settlement();
        Time time = new Time(0);

        ksession.insert(settlement);
        ksession.insert(time);

        FactHandle timeHandle = ksession.insert(time);
        for(int day = 0 ; ; day++) {

            time.setDay(day);
            ksession.update(timeHandle, time);
            ksession.fireAllRules();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch(Exception e) {}
        }//to for

    }//to main
}// Drools Main
