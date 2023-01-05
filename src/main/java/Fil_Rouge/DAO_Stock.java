package Fil_Rouge;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface DAO_Stock extends JpaRepository<DO_Sandwich, Long> {
	
	@Query("SELECT u FROM DO_Sandwich u WHERE u.nosandwich = :nosandwich")

	List <DO_Sandwich> findOneByNosandwich(@Param("nosandwich")int nosandwich);
	
	@Query("SELECT u FROM DO_Sandwich u WHERE u.prix = :prix")
	
	List <DO_Sandwich> findPrixSandwich(@Param("prix")int prix);
	
	}
