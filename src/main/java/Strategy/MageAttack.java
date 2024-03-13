package Strategy;

public class MageAttack implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " Salud antes del daño del Jinete  " + player.getHealth());
        System.out.println("jinete en guerra");
        player.setHealth(player.getHealth() - 20);
        System.out.println(player.getName() + " vida restante " + player.getHealth());
    }
}
