/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import DataBase_Objects.AirsupplyUser;
import DataBase_Objects.HibernateUtil;
import DataBase_Objects.Privilege;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author 21401013
 */
public class TesterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        try {
            List<AirsupplyUser> emailRes = session.createQuery("from AirsupplyUser as u where "
                    + "u.email = ?").setString(0,"J@EMAIL.COM").list();
            AirsupplyUser curUser = emailRes.get(0);
            
            System.out.println(curUser.getTypeUser().getRoleTy());
            Set<Privilege> test = curUser.getPrivileges();
            for (Privilege p : test) {
                System.out.println(p.getDescriptionPr());
            }
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
