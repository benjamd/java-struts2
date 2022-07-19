package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Result(name = "success", location = "/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {

    
    @Override
    @Action("login")
    public String execute() {
        return SUCCESS;
    }

}
