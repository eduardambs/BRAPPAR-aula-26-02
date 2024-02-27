public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        f1.setNome("Ian");
        f1.setSalario(100);

        Gerente g1 = new Gerente(200);
        g1.setNome("Karl");
        g1.setSalario(777);
        // g1.bonus = 200;
        g1.setLogin("picolino");
        g1.setSenha("123");
        imprimirFuncionario(g1);

        Presidente p1 = new Presidente();
        p1.setNome("Paola");
        p1.setSalario(5555);
        p1.ferias = 60;
        // imprimirPresidente(p1);
        imprimirFuncionario(p1);

        // SysPag sysPag = new SysPag();
        // sysPag.addPedido(p1);

        // System.out.println("Funcionario = " + g1.getNome() + " Salario = " +
        // g1.getSalario());
    }

    private static void imprimirFuncionario(Acesso p1) {
        System.out.println("Funcionario = " + p1.getNome()
                + " Salario = " + p1.getSalario() + " Usuario = " + p1.getLogin());
    }

}
