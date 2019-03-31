package tn.hoos.edu.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import tn.hoos.edu.entities.Student;
import tn.hoos.edu.entities.Training;

/* The projection definition in 
 * the same package (or subpackage) 
 * as the corresponding entity.*/

@Projection(name="p1",types= {Student.class})
public interface StudentProjection {
	public String getName();
	public Training getTraining();
}
