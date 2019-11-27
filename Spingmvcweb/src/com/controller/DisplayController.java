package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pizza.bean.PizzaOrder;
import com.pizza.exception.NoOrderId;
import com.pizza.service.PizzaOrderService;

/**
 * Servlet implementation class DisplayController
 */
public class DisplayController extends HttpServlet {
	ServletContext ctx;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");//Mime type Multi purporse internet mail extension
		PrintWriter out=response.getWriter();
		PizzaOrder pizzadis=new PizzaOrder();
		int id=Integer.valueOf(request.getParameter("oid"));
		PizzaOrderService pizzaservice=new PizzaOrderService();
		PizzaOrder pizza=null;
		ctx=getServletContext();
		try {
			 pizza=pizzaservice.getOrderDetails(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pizza!=null){
		
		request.setAttribute("pizzadetails", pizza);
		  RequestDispatcher rd = ctx.getRequestDispatcher("/pages/Display_page.jsp");
		 rd.forward(request, response);
		}else{
			try{
				if(pizza==null)
					   throw new NoOrderId();
				
			}catch(Exception e){
				
				request.setAttribute("exception", e);
			//out.println("There is no such order id ");
			 RequestDispatcher rd = ctx.getRequestDispatcher("/pages/Failure.jsp");			 
			 rd.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
