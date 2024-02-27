public abstract class Acesso extends Funcionario implements Acessivel {
    private String login;
    private String senha;

    public abstract void resetarSenha();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
