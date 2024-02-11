package org.jsiwiecki.q2;

public class Main
{
    public static void main(String[] args)
    {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("USS Enterprise", "2266");
        ships[1] = new CruiseShip("Millennium Falcon", "1750", 50);
        ships[2] = new CargoShip("Battlestar Galactica", "1969", 100);

        for (Ship ship: ships)
        {
            ship.print();
        }
    }
}
