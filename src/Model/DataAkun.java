package Model;

public class DataAkun {
    private String username;
    private String password;

    public DataAkun(String username, String password, String role) {
        this.username = username;
        this.password = password;
    }

    public DataAkun() {
        this.username = "";
        this.password = "";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
