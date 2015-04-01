import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaInsereProduto {
public static void main(String[] args)
{ EntityManagerFactory factory =
Persistence.createEntityManagerFactory("Lojinha");
EntityManager em = factory.createEntityManager();
Produto p = new Produto();
p.setNome("Livro");
p.setPreco(12.00);
Produto p1 = new Produto();
p1.setNome("Caderno");
p1.setPreco(15.00);
em.getTransaction().begin();
em.persist(p);
em.persist(p1);
em.getTransaction().commit();
}
}