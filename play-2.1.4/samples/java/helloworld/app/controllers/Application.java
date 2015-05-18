package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.data.validation.Constraints.*;
import java.util.*;
import views.html.*;

public class Application extends Controller {

	/**
	 * Describes the Trip form.
	 */
	public static class Trip {

		@Required
		public String departCity;
		@Required
		public String destination;
		@Required
		public Date departure_date;
		@Required
		public int term;
		@Required
		@Min(1)
		@Max(5)
		public int category;
		@Required
		public int numberOfPersion;

	}

	// -- Actions

	/**
	 * Home page
	 */
	public static Result index() {
		return ok(views.html.index.render(form(Trip.class)));
	}

	/**
	 * Handles the form submission.
	 */

	public static Result results() {
		Form<Trip> form = form(Trip.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(index.render(form));
		} else {
			Trip data = form.get();
			return ok(views.html.results.render(data.departCity,
					data.destination, data.departure_date, data.term,
					data.category, data.numberOfPersion));
		}
	}

}