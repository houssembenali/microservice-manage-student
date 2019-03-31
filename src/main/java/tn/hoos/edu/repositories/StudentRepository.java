package tn.hoos.edu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.hoos.edu.entities.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {
	public List<Student> findByNameStartsWith(String name);
	public List<Student> findByNameContains(String name);
	
	@Query("select s from Student s where s.name like :x")
	public List<Student> chercher(@Param("x")String name);

}
