package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.jpa.*;

/**
 * depart entity managed by JPA
 */
@Entity
public class plane {
	
	@Id
	public int dest_id;

	@Constraints.Required
	public String city;

	public static plane findById(int dep_id) {
		return JPA.em().find(plane.class, dep_id);
	}
}