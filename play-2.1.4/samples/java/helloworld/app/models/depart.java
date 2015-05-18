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
public class depart {
	@Id
	public int dep_id;

	@Constraints.Required
	public String city;

	public static depart findById(int dep_id) {
		return JPA.em().find(depart.class, dep_id);
	}
}