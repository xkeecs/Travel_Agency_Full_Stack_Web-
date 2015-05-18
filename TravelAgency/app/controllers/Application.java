package controllers;

import java.util.*;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.data.validation.Constraints.Required;
import play.db.jpa.*;
import views.html.*;
import models.*;

import java.util.*;

import javax.persistence.*;
/**
 * Manage a database of computers
 */
public class Application extends Controller {

    /**
     * This result directly redirect to application home.
     */
    public static Result GO_HOME = redirect(
        routes.Application.list(0, "plane_id", "asc", "")
    );
    
    /**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        return GO_HOME;
    }

    /**
     * Process User Query Form
     * **/
    @Transactional
    public static Result search(int page, String order){
        DynamicForm bindedForm = form().bindFromRequest();
        System.out.println(bindedForm.data().toString());
        String[] dateStr = bindedForm.get("date").split("-");
        int year = Integer.parseInt(dateStr[0]);
        int month = Integer.parseInt(dateStr[1]);
        int day = Integer.parseInt(dateStr[2]);
        int dep_id = Integer.parseInt(bindedForm.get("dep_id"));
        int dest = Integer.parseInt(bindedForm.get("destination"));
        java.sql.Date depDate = new java.sql.Date( year, month, day);

        int duration = Integer.parseInt(bindedForm.get("duration"));
        int numPeople = Integer.parseInt(bindedForm.get("numPeople"));
        int category = Integer.parseInt(bindedForm.get("category"));
        plane.Page planePages = plane.page(page, 8, "plane_id", order, dest, dep_id, depDate);
    	return ok(
    			views.html.aftersearch.render(
    				planePages,
    				hotels.page(page, 5, "hotel_id", order, dest, category),
    				Details.page(page, planePages.getList(), 5),
    			    order
    			)
    	);
    }
    
    /**
     * Display the paginated list of planes.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    @Transactional(readOnly=true)
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            views.html.list.render(
                plane.pageInit(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
}
            
