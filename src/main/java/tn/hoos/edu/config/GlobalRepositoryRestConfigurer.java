//package tn.hoos.edu.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
//
//import tn.hoos.edu.entities.Student;
//import tn.hoos.edu.entities.Training;
//
//@Configuration
//public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter {
//
//	@Override
//	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//		super.configureRepositoryRestConfiguration(config);
//		config.setReturnBodyOnCreate(true);
//		config.setReturnBodyOnUpdate(true);
//		config.exposeIdsFor(Student.class,Training.class);
//		config.getCorsRegistry()
//		.addMapping("/**")
//		.allowedOrigins("http://localhost:4200")
//		.allowedHeaders("*")
//		.allowedMethods("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
//		
//		
//	}
//	
//}
