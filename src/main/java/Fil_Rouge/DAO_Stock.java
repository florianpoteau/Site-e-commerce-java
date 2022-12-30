package Fil_Rouge;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component

public class DAO_Stock implements InterfaceDAO {
	
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("sandwich");
		
	
	public void ajouterproduit (final int id, final int noproduit, final String nom, final String produit1, final String produit2, final String produit3, final String produit4, final String produit5, final float prix) {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			DO_Sandwich dO_Sandwich = new DO_Sandwich();
			dO_Sandwich.setId(id);
			dO_Sandwich.setNoproduit(noproduit);
			dO_Sandwich.setNom(nom);
			dO_Sandwich.setProduit1(produit1);
			dO_Sandwich.setProduit2(produit2);
			dO_Sandwich.setProduit3(produit3);
			dO_Sandwich.setProduit4(produit4);
			dO_Sandwich.setProduit5(produit5);
			dO_Sandwich.setPrix(prix);
			em.persist(dO_Sandwich);
			et.commit();
		}
		catch(Exception ex){
			if(et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
			
			finally {
				em.close();
				ENTITY_MANAGER_FACTORY.close();
			}
		}
	
	public void deletesandwich ( final int id) {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		DO_Sandwich dO_Sandwich = null;
		try {
			et = em.getTransaction();
			et.begin();
			dO_Sandwich = em.find(DO_Sandwich.class, id);
			em.remove(dO_Sandwich);
			et.commit();
		}
		catch (Exception ex) {
			if(et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
			ENTITY_MANAGER_FACTORY.close();
		}
	}
	
	public void getsandwich(final int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT s FROM Sandwich s WHERE s.id = :id";

		TypedQuery<DO_Sandwich> tq = em.createQuery(query, DO_Sandwich.class);
		tq.setParameter("id", id);
		DO_Sandwich util = null;
		try {
			util = tq.getSingleResult();
			System.out.println(util.getNom() + " " + util.getProduit1() + " " + util.getProduit2() + " " + util.getProduit3() + " " + util.getProduit4() + " " + util.getProduit5() + " " + util.getPrix());
		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}
	
	
	public List<DO_Sandwich> getsandwichs () {
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery = "SELECT s FROM Sandwich s WHERE s.id IS NOT NULL";
		
		TypedQuery<DO_Sandwich> tq = em.createQuery(strQuery, DO_Sandwich.class);
		List<DO_Sandwich> utils;
		try {
			utils = tq.getResultList();
			utils.forEach(Sandwich->System.out.println( Sandwich.getNom() + " " + Sandwich.getProduit1() + " " + Sandwich.getProduit2() + " " + Sandwich.getProduit3() + " " + Sandwich.getProduit4() + " " + Sandwich.getProduit5() + " " + Sandwich.getPrix()));
		}
		
		catch ( NoResultException ex) {
			ex.printStackTrace();
		}
		
		finally {
			em.close();
			ENTITY_MANAGER_FACTORY.close();
		}
		return tq.getResultList();
	}
	
	public void dateAchat (final int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT s FROM Sandwich s WHERE s.id = :id";
		TypedQuery<DO_Sandwich> tq = em.createQuery(query, DO_Sandwich.class);
		tq.setParameter("id", id);
		DO_Sandwich util = null;
		try {
			util = tq.getSingleResult();
			
			System.out.println(util.getNom() + " " + util.getProduit1() + " " + util.getProduit2() + " " + util.getProduit3() + " " + util.getProduit4() + " " + util.getProduit5() + " " + util.getPrix());
			//utiliser le calendrier par défaut
	        Calendar calendar = Calendar.getInstance();
	 
	        //définir le format de la date
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 
	        //Afficher la date du joru
	        System.out.println("Vous avez commandé le sandwich le: "+sdf.format(calendar.getTime()));
	        
	        SimpleDateFormat sdf1 = new SimpleDateFormat("HH");
	        calendar.add(Calendar.HOUR, 2);
	        System.out.println("Vous recevrez la commande vers " + sdf1.format(calendar.getTime()) + " Heures");
			
		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	
	
	}
