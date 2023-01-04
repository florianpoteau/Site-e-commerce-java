package Fil_Rouge;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DAO_Stock extends JpaRepository<DO_Sandwich, Long> {
	
	

	}
