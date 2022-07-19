
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author benja
 */
public class MostrarPersonaAction extends ActionSupport {
    
    private Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
 
    private String nombre;
    
    public String execute(){
        log.info("El lombre es "+ this.nombre);
        return SUCCESS;
    }

 
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTitulo(){
        return this.getText("persona.titulo");
    }

    public String getValor(){
        return this.getText("persona.valor");
    }

    public String getBoton(){
        return this.getText("persona.boton");
    }    
}
