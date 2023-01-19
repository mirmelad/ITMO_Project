import actions.FootballGame;
import actions.Rumble;
import city.*;
import items.Ball;
import items.Kite;

public class Main {
    public static void main(String[] args) {

        Street[] streets = new Street[5];
        House[] houses = new House[5];
        for (int i = 0; i < 5; i++){
            Shutters shutters = new Shutters("специальные решетчатые", 70, 70);
            houses[i] = new House(i+1, new Window(shutters));
        }
        streets[0] = new Street("Первомайская", houses);
        streets[1] = new Street("Проспект Мира", houses);
        streets[2] = new Street("Торговая", houses);
        streets[3] = new Street("Ленина", houses);
        streets[4] = new Street("Седова", houses);

        Mill mill = new Mill(5, new Rattle(5));
        City city = new City(streets, mill);

        Kite kite = new Kite("воздушный змей");

        kite.buzz("разноголосо");
        kite.merge(" " + kite.toString() + " ", "мельничной " + city.getMill().getRattle().toString() + " ");
        city.getMill().getRattle().crackle();
        Rumble rumble = new Rumble("непрерывный");
        System.out.print(" в результате ");
        System.out.print(rumble.toString());
        rumble.stay();
        System.out.println("");

        System.out.print(city.getStreets()[1].getHouses()[2].getWindow()
                + " были оснащены "
                + city.getStreets()[1].getHouses()[2].getWindow().getShutters().toString());

        System.out.println("");

        FootballGame game = new FootballGame("которой увлекались жители",new Ball());
        System.out.print("," + game.toString());
        game.start();
        System.out.println("");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j ++){
                city.getStreets()[i].getHouses()[j].getWindow().getShutters().close();
            }
        }

        System.out.print(city.getStreets()[1].getHouses()[2].getWindow().getShutters().toString());
        if (city.getStreets()[1].getHouses()[2].getWindow().getShutters().getTransmittance() > 50){
            System.out.print(" пропускали в комнаты достаточное количества света");
        }else {
            System.out.print(" не пропускали в комнаты достаточное количества света");
        }
        System.out.print(" и в то же время ");
        if (city.getStreets()[1].getHouses()[2].getWindow().getShutters().getSafety() > 50){
            System.out.print("защищали стекла от ");
        }else {
            System.out.print("не защищали стекла от ");
        }

        System.out.print(game.getBall().toString());
        game.getBall().fly();
    }
}