package sevletjsp;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servletJsp
 */
@WebServlet("/trangchu")
public class servletJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletJsp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(1);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<head>");
		out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.print("<style>");
		out.print("* {");
		out.print("  box-sizing: border-box;");
		out.print("}");
		out.print(".menu {");
		out.print("  float: left;");
		out.print("  width: 20%;");
		out.print("}");
		out.print(".menuitem {");
		out.print("  padding: 8px;");
		out.print("  margin-top: 7px;");
		out.print("  border-bottom: 1px solid #f1f1f1;");
		out.print("}");
		out.print(".main {");
		out.print("  float: left;");
		out.print("  width: 60%;");
		out.print("  padding: 0 20px;");
		out.print("  overflow: hidden;");
		out.print("}");
		out.print(".right {");
		out.print("  background-color: lightblue;");
		out.print("  float: left;");
		out.print("  width: 20%;");
		out.print("  padding: 10px 15px;");
		out.print("  margin-top: 7px;");
		out.print("}");

		out.print("@media only screen and (max-width:800px) {");
		out.print("  /* For tablets: */");
		out.print("  .main {");
		out.print("    width: 80%;");
		out.print("    padding: 0;");
		out.print("  }");
		out.print("  .right {");
		out.print("    width: 100%;");
		out.print("  }");
		out.print("}");
		out.print("@media only screen and (max-width:500px) {");
		out.print("  /* For mobile phones: */");
		out.print("  .menu, .main, .right {");
		out.print("    width: 100%;");
		out.print("  }");
		out.print("}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body style=\"font-family:Verdana;\">");

		out.print("<div style=\"background-color:#f1f1f1;padding:15px;\">");
		out.print("  <h1>Cinque Terre</h1>");
		out.print("  <h3>Resize the browser window</h3>");
		out.print("</div>");

		out.print("<div style=\"overflow:auto\">");
		out.print("  <div class=\"menu\">");
		out.print("    <div class=\"menuitem\">The Walk</div>");
		out.print("    <div class=\"menuitem\">Transport</div>");
		out.print("    <div class=\"menuitem\">History</div>");
		out.print("    <div class=\"menuitem\">Gallery</div>");
		out.print("  </div>");

		out.print("  <div class=\"main\">");
		out.print("    <h2>The Walk</h2>");
		out.print("    <p>The walk from Monterosso to Riomaggiore will take you approximately two hours, give or take an hour depending on the weather conditions and your physical shape.</p>");
		out.print("    <img src=\"img_5terre.jpg\" style=\"width:100%\">");
		out.print("  </div>");

		out.print("  <div class=\"right\">");
		out.print("    <h2>What?</h2>");
		out.print("    <p>Cinque Terre comprises five villages: Monterosso, Vernazza, Corniglia, Manarola, and Riomaggiore.</p>");
		out.print("    <h2>Where?</h2>");
		out.print("    <p>On the northwest cost of the Italian Riviera, north of the city La Spezia.</p>");
		out.print("    <h2>Price?</h2>");
		out.print("    <p>The Walk is free!</p>");
		out.print("  </div>");
		out.print("</div>");


		out.print("<div style=\"background-color:#f1f1f1;text-align:center;padding:10px;margin-top:7px;font-size:12px;\"> This web page is a part of a demonstration of fluid web design made by w3schools.com. Resize the browser window to see the content respond to the resizing.</div>");

		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
