package tn.hoos.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.hoos.edu.entities.Training;

@CrossOrigin("*")
//@CrossOrigin("http://localhost:4200")
public interface TrainingRepository extends JpaRepository<Training, Long>{

}
