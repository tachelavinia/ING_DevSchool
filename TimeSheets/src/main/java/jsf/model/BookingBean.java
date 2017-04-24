package jsf.model;

import ejb.BookingFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "bookingBean")
@SessionScoped
public class BookingBean implements Serializable {
    @EJB
    private BookingFacade bookingFacade;


    public String add(String date, int hours, int project_id, int team_id) {
        bookingFacade.bookNow(date, hours, project_id, team_id);
        return "home";
    }
}
