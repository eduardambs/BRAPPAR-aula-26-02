public class Gerente extends Acesso {
    int bonus;

    public Gerente(int bonus) {
        // super.nome = "Ze";
        // super.salario = -999;
        
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void resetarSenha() {
        
        
    }

}
