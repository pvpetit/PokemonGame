public class PkmnMoveRegistry {
    int PP;
    int PPMax;

    PkmnMoveRegistry() {

    }

        public PkmnMove getPkmnMove(String name) {
        //Becareful with the String portiton of conditional branch, if there's an extra space It won't work.
        String moveName = name;


        PkmnMove move1 = null;

        if (moveName == "Ember") {

            move1 = new PkmnMove("Ember", "Fire", 15, "None");

        }
        if (moveName == "Flamethrower") {

            move1 = new PkmnMove("Flamethrower", "Fire", 35, "None");

        }

        if (moveName == "Iron Claw") {

            move1 = new PkmnMove("Iron Claw", "Steel", 20, "None");

        }


        if (moveName == "Iron Tail") {

            move1 = new PkmnMove("Iron Tail", "Steel", 5, "+10 Defense");

        }

        if (moveName == "Hydro Pump") {

            move1 = new PkmnMove("Hydro Pump", "Water", 25, "None");

        }

        if (moveName == "Tackle") {

            move1 = new PkmnMove("Tackle", "Normal", 10, "None");
        }
        if (moveName == "Thunderbolt") {

            move1 = new PkmnMove("Thunderbolt", "Normal", 15, "None");

        }

        if (moveName == "Thunder") {

            move1 = new PkmnMove("Thunder", "Electric", 35, "None");

        }

        if (moveName == "Water Gun") {

            move1 = new PkmnMove("Water Gun", "Water", 15, "None");

        }

        if (moveName == "Withdrawl") {

            move1 = new PkmnMove("Withdrawl", "Steel", 0, "+15 Defense. No Attack");

        }

        if (moveName == "Rock Throw") {

            move1 = new PkmnMove("Rock Throw", "Rock", 20, "None");

        }
        if (moveName == "Earthquake") {

            move1 = new PkmnMove("Earthquake", "Ground", 35, "None");

        }




        return move1;

    }


}
