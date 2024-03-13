package Strategy;


public class WarriorAttack implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " Salud antes del daño del Arquero  " + player.getHealth());
        System.out.println("Arquero en guerra");
        player.setHealth(player.getHealth() - 20);
        System.out.println(player.getName() + " vida restante " + player.getHealth());
    }
}
