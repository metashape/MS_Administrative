package metashape;

public class Funcionario {

    private int id_user;
    private String user;
    private String senha;
    private Departamento[] permissions;

    public Funcionario(String user, String senha, Departamento[] permissions) {
        this.user = user;
        this.senha = senha;
        this.permissions = permissions;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Departamento[] getPermissions() {
        return permissions;
    }

    public void setPermissions(Departamento[] permissions) {
        this.permissions = permissions;
    }
            
}
