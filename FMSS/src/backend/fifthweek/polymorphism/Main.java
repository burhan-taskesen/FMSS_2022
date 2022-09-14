package backend.fifthweek.polymorphism;


import backend.fifthweek.polymorphism.game.soldier.Soldier;
import backend.fifthweek.polymorphism.game.soldier.SoldierFactory;
import backend.fifthweek.polymorphism.game.team.Teams;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Soldier soldier = SoldierFactory.getMeleeWeakSoldier().setTeam(Teams.TEAM_A);
        Soldier soldier1 = SoldierFactory.getStrongSoldier().setTeam(Teams.TEAM_B);

        System.out.println(soldier);
        System.out.println(soldier1);

        System.out.println("\nFMSS Bootcamp 2022");
    }
}

