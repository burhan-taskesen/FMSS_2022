package backend.fifthweek.polymorphism.game.soldier;

import backend.fifthweek.polymorphism.game.team.Teams;
import backend.fifthweek.polymorphism.game.tool.gun.Gun;
import backend.fifthweek.polymorphism.game.tool.knife.Knife;
import backend.fifthweek.polymorphism.game.tool.tank.Tank;

public class SoldierFactory {
    public static Soldier getDefaultSoldier() throws CloneNotSupportedException {
        return new Soldier(Teams.TEAMLESS,new Gun(),1.0);
    }
    //Bir tutam da factory
    public static Soldier getMeleeWeakSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Knife()).setPower(.5);
    }

    public static Soldier getStrongSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Tank()).setPower(2.0);
    }

    public static Soldier getMeleeSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Knife()).setPower(1.0);
    }

    public static Soldier getRangedWeakSoldier() throws CloneNotSupportedException {
        return getDefaultSoldier().setTool(new Gun()).setPower(0.5);
    }
}
