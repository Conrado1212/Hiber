package pl.edu.wszib.gui;

import pl.edu.wszib.db.ScooterRepository;
import pl.edu.wszib.model.Scooter;

import java.util.List;
import java.util.Scanner;

public class Gui {
    public static void showMenu(){
        Scooter scooter0 = new Scooter(1,"Xiaomi","MiJia M365 Pro",50);
        Scooter scooter1 = new Scooter(2,"Xiaomi","MiJia M365 ",40);
        Scooter scooter2 = new Scooter(3,"Fiat","F500 8,5",45);
        Scooter scooter3 = new Scooter(4,"Fiat","F500 8",40);
        Scooter scooter4 = new Scooter(5,"Kawasaki","Streetboard KX-ST 14.0",70);
        Scooter scooter5 = new Scooter(6,"Ninebot by Segway KickScooter","ES1", 45);
        Scooter scooter = new Scooter();

        System.out.println("1.Dodaj do bazy: ");
        System.out.println("2.Wyciagnij z bazy: ");
        System.out.println("3.Usuniecie z bazy: ");
        System.out.println("4.Aktualizacja bazy:");
        System.out.println("5.Avaliable list: ");
        System.out.println("6.Pełna lista hulajnog");
        System.out.println("7.Lista hulajnog Xiaomi: ");
        System.out.println("7.Rent scooter: ");
        System.out.println("8.Exit.");

        Scanner in = new Scanner(System.in);

        String menu = in.nextLine();

        switch (menu){
            case "1":
                ScooterRepository.addScooter(scooter0);
                ScooterRepository.addScooter(scooter1);
                ScooterRepository.addScooter(scooter2);
                ScooterRepository.addScooter(scooter3);
                ScooterRepository.addScooter(scooter4);
                ScooterRepository.addScooter(scooter5);
                showMenu();
                break;
            case "2":
                System.out.println("Podaj model hulajki ktory chcesz wyciagnac: ");
                String model = in.nextLine();
                ScooterRepository.getScooter(0);
                showMenu();
                break;
            case "3":
                System.out.println("Podaj jaki id chcesz usunać: ");
                int Id = in.nextInt();
                ScooterRepository.removeScooterId(Id);
                showMenu();
                break;
            case "4":
                System.out.println("Podaj id skutera ktory chcesz updatowac.");
                Scanner scanner = new Scanner(System.in);
                int idTemp = scanner.nextInt();
                System.out.println("Podaj marke");
                scanner.nextLine();
                String brandTemp = scanner.nextLine();
                scooter.setBrand(brandTemp);
                System.out.println("Podaj model");
                String modelTemp = scanner.nextLine();
                scooter.setModel(modelTemp);
                System.out.println("Podaj cene");
                int  priceTemp = scanner.nextInt();
                scooter.setPrice(priceTemp);
                ScooterRepository.getUpdate(idTemp, scooter);
                showMenu();
                break;
            case "6":
                List<Scooter> allScooters = ScooterRepository.getAllScooters();
                System.out.println("Lista");
                for(Scooter tempScooter: allScooters){
                    System.out.println(allScooters);
                }
                showMenu();
                break;
            case "7":
                List<Scooter> allXiaomiScooters = ScooterRepository.getAllScooters();
                System.out.println("Lista hulajnog Xiaomi: ");
                for(Scooter tempScooter: allXiaomiScooters){
                    System.out.println(allXiaomiScooters);
                }
                showMenu();
            case "8":
                rentScooterMenu();
                showMenu();
                break;
            case "9":
                System.exit(0);
                break;
            default:
                break;
        }
    }

    public  static void rentScooterMenu(){
        System.out.println("Write ScooterId: ");
    }
}
