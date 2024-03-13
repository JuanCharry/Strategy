package Strategy;

public class UnarmedAttack implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " Salud antes del daño del Artillero " + player.getHealth());
        System.out.println("Artillero en guerra ");
        player.setHealth(player.getHealth() - 20);
        System.out.println(player.getName() + " vida restante " + player.getHealth());
    }
}
