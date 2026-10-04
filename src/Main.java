import enemy.Enemy;
import school.FrostSchool;
import school.HolySchool;
import spell.AreaSpell;
import spell.BoltSpell;
import spell.Spell;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Enemy ragnaros = new Enemy("Ragnaros", 500);
        List<Enemy> boss = List.of(ragnaros);
        List<Enemy> murlocPack = List.of(
                new Enemy("Murloc Warrior", 120),
                new Enemy("Murloc Oracle", 90),
                new Enemy("Murloc Hunter", 100)
        );

        System.out.println("=== Bolt with Holy school ===");
        Spell bolt = new BoltSpell(new HolySchool(), "Bolt", 40);
        bolt.cast(boss);

        System.out.println();
        System.out.println("=== Same Bolt object, school switched to Frost ===");
        bolt.setSchool(new FrostSchool());
        bolt.cast(boss);

        System.out.println();
        System.out.println("=== Storm with Frost school on a murloc pack ===");
        Spell storm = new AreaSpell(new FrostSchool(), "Storm", 30);
        storm.cast(murlocPack);

        System.out.println();
        System.out.println("=== Same Storm object, school switched to Holy ===");
        storm.setSchool(new HolySchool());
        storm.cast(murlocPack);
    }
}