import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hauptanwendung 
{
	public static void main(String [] args)
	{
		EntityManagerFactory    em = Persistence.createEntityManagerFactory("pu");
		EntityManager manager = em.createEntityManager();
		// Do the Things you do:
		BigInteger rowCount = (BigInteger)manager.createNativeQuery("SELECT count(1) FROM Book").getSingleResult();
		System.out.println("Anzahl gefundener Einträge mit EntityManager: "+rowCount);
		
		int i = 0;
		System.out.println("Tabelle Lokal (CC Stuttgart)\n==================================================================\n"
				+ "ID       Name Buch\t\t\t\t Autor\n------------------------------------------------------------------");
		while(i < (int)rowCount.intValue())
		{
			Book a = manager.find(Book.class,(i+1));
			System.out.println(a.getBid()+"\t"+a.getName()+"\t\t\t"+a.getAuthor());
			i++;
		}
		
		//System.out.println(a.getAuthor());
	}
}
