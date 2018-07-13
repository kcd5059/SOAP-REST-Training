package com.webage.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acme.services.entities.QuoteRequest;
import com.acme.services.entities.QuoteResponse;
import com.acme.services.proxy.QuoteProxy;

/**
 * Servlet implementation class QuoteController
 */
@WebServlet("/QuoteController")
public class QuoteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuoteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Compose the QuoteRequest object
		QuoteRequest req = new QuoteRequest();
		
		req.setClientId("C0001");
		req.setDateRequiredBy(request.getParameter("dateRequiredBy"));
		req.setPartNumber(request.getParameter("partNumber"));
		req.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		
		//Invoke the service
		QuoteProxy proxy = new QuoteProxy();
		
		QuoteResponse res = proxy.getQuote(req);
		//Show the result
		request.setAttribute("quoteResponse", res);
		
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
}
