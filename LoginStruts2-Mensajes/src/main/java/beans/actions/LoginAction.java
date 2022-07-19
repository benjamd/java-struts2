package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author benja
 */
public class LoginAction extends ActionSupport {

    private Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    public String execute() {

        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFormUsuario() {
        return this.getText("form.usuario");
    }

    public String getFormPassword() {
        return this.getText("form.password");
    }

    public String getBoton() {
        return this.getText("form.boton");
    }

    public String getTitulo() {
        return this.getText("form.titulo");
    }
    
    public String getValores() {
        return this.getText("form.valores");
    }
    

}
