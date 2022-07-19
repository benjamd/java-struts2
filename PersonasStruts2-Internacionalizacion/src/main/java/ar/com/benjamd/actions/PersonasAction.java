package ar.com.benjamd.actions;

import ar.com.benjamd.model.Persona;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Container;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonasAction extends ActionSupport {

    Logger log = LogManager. getLogger(PersonasAction.class);
    
    private Persona persona;
    
    
    @Override
    public String execute(){
        if(this.persona != null){
            log.info("\n");
            log.info("Persona: "+ this.persona);
        } else {
            log.info("Persona con valor nulo");
        }
        
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    
    
    
}
