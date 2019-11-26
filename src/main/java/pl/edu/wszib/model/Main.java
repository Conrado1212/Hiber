package pl.edu.wszib.model;

import pl.edu.wszib.db.ScooterRepository;

import java.util.List;

import static pl.edu.wszib.gui.Gui.showMenu;

public class Main {
    public static void main(String[] args) {
      //  Scooter scooter = new Scooter(1,"Xiaomi","MiJia M365 Pro",50);

     //   ScooterRepository.addScooter(scooter);
        Scooter scooter1 = ScooterRepository.getScooter(1);
        System.out.println(scooter1);

      /*  List<Scooter> allScooters = ScooterRepository.getAllScooters();
        System.out.println("Lista");
        for(Scooter tempScooter : allScooters){
            System.out.println(tempScooter);*/
            showMenu();
            {

            }
        }
     }

