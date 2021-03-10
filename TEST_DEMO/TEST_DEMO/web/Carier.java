/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ajay pratap singh
 */
@WebServlet(urlPatterns = {"/Carier"})
public class Carier extends HttpServlet {
    private String plumber;
    private String massag;
    private String foods;
    private String fashion;
    private String dress;
    private String compu;
    private String chemical;
    private String practicalnursing;
    private String beaty;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Future</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String DOB=request.getParameter("DOB");
            String rw=DOB.replace("-","0");
          
           int i=Integer.parseInt(rw);
           int x,p=0,s;
           while(i>0)
           {
            x=i%10;   
            p=p+x;
            i=i/10;
           }
           
            if(p<10)
            {
               
                int ch=p;
                switch(ch)
                {
                 case 1:
                      
                         out.println("<a href='practicalnursing.html'>Arts</a>z4");
                        break;
                    case 2:
                       
                         out.println("<a href='beaty.html'>Beauty</a>");
                        break;
                    case 3:
                       
                         out.println("<a href='chemical.html'>Chemical</a>");
                        break;
                    case 4:
                       
                         out.println("<a href='compu.html'>Campu</a>");
                        break;
                    case 5:
                        
                         out.println("<a href='dress.html'>Dress</a>");
                        break;
                    case 6:
                        
                         out.println("<a href='fashion.html'>Fasion</a>");
                        break;
                    case 7:
                        
                         out.println("<a href='foods.html'>Food</a>");
                        break;
                    case 8:
                        
                         out.println("<a href='massag.html'>Massage</a>");
                        break;
                    case 9:
                        
                         out.println("<a href='plumber.html'>Plumber</a>");
                        break;      
                }
            }
             else
            {
                int u=0,t;
               while(p>0)
               {
                  
                  t=p%10;   
                   u=u+t;
                  p=p/10;
               } 
          
               if(u<10)
               {
                        
                      int ch=u;
                        switch(ch)
                {
                         case 1:
                      
                         out.println("<a href='practical nursing.html'>Arts</a>z4");
                        break;
                    case 2:
                       
                         out.println("<a href='beaty.html'>Beauty</a>");
                        break;
                    case 3:
                       
                         out.println("<a href='chemical.html'>Chemical</a>");
                        break;
                    case 4:
                       
                         out.println("<a href='compu.html'>Campu</a>");
                        break;
                    case 5:
                        
                         out.println("<a href='dress.html'>Dress</a>");
                        break;
                    case 6:
                        
                         out.println("<a href='fashion.html'>Fasion</a>");
                        break;
                    case 7:
                        
                         out.println("<a href='foods.html'>Food</a>");
                        break;
                    case 8:
                        
                         out.println("<a href='massag.html'>Massage</a>");
                        break;
                    case 9:
                        
                         out.println("<a href='plumber.html'>Plumber</a>");
                        break;    
                }
                }
               
               else
               { 
                   int w=0,l;
                   while(u>0)
                   {
                     l=u%10;
                     w=w+l;
                     u=u/10;
                   }
                    
                   int ch=w;
                        switch(ch)
                {
                   case 1:
                      
                         out.println("<a href='practical nursing.html'>Arts</a>z4");
                        break;
                    case 2:
                       
                         out.println("<a href='beaty.html'>Beauty</a>");
                        break;
                    case 3:
                       
                         out.println("<a href='chemical.html'>Chemical</a>");
                        break;
                    case 4:
                       
                         out.println("<a href='compu.html'>Campu</a>");
                        break;
                    case 5:
                        
                         out.println("<a href='dress.html'>Dress</a>");
                        break;
                    case 6:
                        
                         out.println("<a href='fashion.html'>Fasion</a>");
                        break;
                    case 7:
                        
                         out.println("<a href='foods.html'>Food</a>");
                        break;
                    case 8:
                        
                         out.println("<a href='massag.html'>Massage</a>");
                        break;
                    case 9:
                        
                         out.println("<a href='plumber.html'>Plumber</a>");
                        break;       
                }
            }
            }
          
            out.println("</body>");
            out.println("</html>");
        }
    }

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
