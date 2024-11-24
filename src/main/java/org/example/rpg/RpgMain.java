package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("Shrek", 1000, 40);
        Monster okami = new Werewolf("Okami", 900, 90);

        printAttackResult(shrek);
        printAttackResult(okami);

    }

    private static void printAttackResult(Monster monster) {
        System.out.println("attack rusult of: "+monster.getName()+": "+monster.attack());
    }
}