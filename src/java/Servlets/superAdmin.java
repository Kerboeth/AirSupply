/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DataBase_Objects.AirsupplyUser;
import DataBase_Objects.Caracterise;
import DataBase_Objects.CaracteriseId;
import DataBase_Objects.HibernateUtil;
import DataBase_Objects.Privilege;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 21401013
 */
public class superAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    private void createCustomerAdmin(String inpName, String inpSurName, String inpEmail, String inpPassword){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try{    
            AirsupplyUser newCusAdmin = new AirsupplyUser(0, 1, inpName, inpSurName, inpSurName, inpEmail, inpPassword);
            Privilege newPriv = (Privilege) session.get(Privilege.class, 2);
            Caracterise newCar = new Caracterise(new CaracteriseId(newCusAdmin.getIdTy(), newPriv.getIdPr()));
            
            t.commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
            t.rollback();
        }    
    }
    
    private void createSupplierAdmin(String inpName, String inpSurName, String inpEmail, String inpPassword){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try{    
            AirsupplyUser newSupAdmin = new AirsupplyUser(0, 1, inpName, inpSurName, inpSurName, inpEmail, inpPassword);
            Privilege newPriv = (Privilege) session.get(Privilege.class, 3);
            Caracterise newCar = new Caracterise(new CaracteriseId(newSupAdmin.getIdTy(), newPriv.getIdPr()));
            
            t.commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
            t.rollback();
        }    
    }
    
    //private void scheduleExport TO DO!!!!!!!!!
    //private void scheduleImport TO DO!!!!!!!!!
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

