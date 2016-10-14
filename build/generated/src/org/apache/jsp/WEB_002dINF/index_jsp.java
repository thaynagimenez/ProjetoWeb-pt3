package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<!--Metadados-->\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"keyword\" content=\"Startup, Weekend, Network, Learn\">\n");
      out.write("    <meta name=\"description\" content=\"Startup Weekend - Learn, Network, Startup\">\n");
      out.write("    <meta name=\"author\" content=\"Ricardo Corassa e Thayna Gimenez\">\n");
      out.write("\n");
      out.write("    <title>Startup Weekend - Learn, Network, Startup</title>\n");
      out.write("\n");
      out.write("    <!--Folha de estilo-->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write(" \t<!--Ícone da aba do navegador-->\n");
      out.write("    <link href=\"icone.ico\" rel=\"icon\" sizes=\"32x32\" type=\"image/ico\" />\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\t\n");
      out.write("\t<!--menu-->\n");
      out.write("\t<nav class=\"menu\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a target=\"_blank\" href=\"index2.html\"><img alt=\"Sw-logo-white\" src=\"img/sw-logo-white-532a0ec919a9f54c31e35b924c7c55f1.svg\"></a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"find event-search col-lg-offset-1\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" id=\"event\" name=\"event\" placeholder=\"Find\" size=\"50\" type=\"text\" />\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn-search-menu\" name=\"button\" type=\"submit\">GO</button>\n");
      out.write("\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t        <a>Explore Events<span></span></a>\n");
      out.write("\t\t\t        <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t        \t<li><a href=\"events.html\">Near Me</a></li>\n");
      out.write("\t\t\t            <li><a href=\"locations.html\">By Region/City</a></li>\n");
      out.write("\t\t\t            <li><a href=\"interests.html\">By Edition/Theme</a></li>\n");
      out.write("\t\t\t            <li><a href=\"by_map.html\">By Map</a></li>\n");
      out.write("\t        \t\t</ul>\n");
      out.write("\t        \t</li>\n");
      out.write("\t        \t<li>\n");
      out.write("\t\t\t\t\t<a>More<span></span></a>\n");
      out.write("\t              \t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Overview</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Attendees</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Organizers</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Sponsors</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\">Mentors</a></li>\n");
      out.write("\t              \t</ul>\n");
      out.write("\t        \t<li>\n");
      out.write("\t        \t\t<a>?<span></span></a>\n");
      out.write("\t        \t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \t<!--Seção 1 - Learn, Network, Startup-->\n");
      out.write("\t<section class=\"sw-hero sw-hero-home inverter-cor\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-lg-10 col-lg-offset-1 col-md-12\">\n");
      out.write("\t\t\t\t<h1>Learn, Network, Startup</h1>\n");
      out.write("\t\t\t\t<p>In just 54 hours, you will experience the highs, lows, fun, and pressure that make up life at a startup. As you learn how to create a real company, you'll meet the very best mentors, investors, cofounders, and sponsors who are ready to help you get started. Your community is here to help you — find an event today!</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container hero-search hidden-xs hidden-sm\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5\"><h3>Find an event near:</h3></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-inline event-search\">\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"margin:0; padding:0; display:inline\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"utf8\" type=\"hidden\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t  \t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t    \t\t\t\t\t\t\t<input class=\"form-control\" id=\"event\" name=\"event\" placeholder=\"Find\" size=\"50\" type=\"text\" />\n");
      out.write("\t    \t\t\t\t\t\t\t<button class=\"btn btn-white btn-search\" name=\"button\" type=\"submit\">Go!</button>\n");
      out.write("\t\t\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<!--Seção 2 - Introdução -->\n");
      out.write("\t<section class=\"sw-introduction\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>The hardest part of starting up is starting out. At Startup Weekend, you'll be immersed in the ideal environment for startup magic to happen.</h2>\n");
      out.write("\t\t\t<p class=\"pxl\">Surrounded by smart, passionate people and with the best tools and approaches at your disposal, you’ll take giant leaps toward creating a business, becoming a founder, and connecting with the right people and resources.</p>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row sw-offset-row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"sw-content-block sw-block-connect\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sw-block-icon\"><img src=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t<h3>Connect</h3>\n");
      out.write("\t\t\t\t\t\t<p>Connect with people driven to build something new. Rich and diverse talent is a Startup Weekend staple.</p>\n");
      out.write("\t\t\t\t\t\t<p>Are you ready to meet your next (cofounder) (friend) (mentor) (investor)?</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"sw-content-block sw-block-discover\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sw-block-icon\"><img src=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t<h3>Discover</h3>\n");
      out.write("\t\t\t\t\t\t<p>Discover where you are on the Entrepreneur's Journey.</p>\n");
      out.write("\t\t\t\t\t\t<p>Find the resources available near you.</p>\n");
      out.write("\t\t\t\t\t\t<p>Leave knowing the next steps you need to take on your road to success.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"sw-content-block sw-block-learn\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sw-block-icon\"><img src=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t<h3>Learn</h3>\n");
      out.write("\t\t\t\t\t\t<p>Learn what it really takes to start a company.</p>\n");
      out.write("\t\t\t\t\t\t<p>No book, panel, speaker, or blog post will teach you what you need to know.</p>\n");
      out.write("\t\t\t\t\t\t<p>The only way to learn is the experience of trying.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"sw-content-block sw-block-start\">\n");
      out.write("\t\t\t\t\t\t<div class=\"sw-block-icon\"><img src=\"\"/></div>\n");
      out.write("\t\t\t\t\t\t<h3>Start</h3>\n");
      out.write("\t\t\t\t\t\t<p>It’s that simple. Startup Weekend is designed to get you going, FAST.</p>\n");
      out.write("\t\t\t\t\t\t<p>Your local Organizers will set up the ideal environment for you to be successful and learn as much as possible in just 54 hours.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--Footer-->\n");
      out.write("\t<footer class=\"sw-footer\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\">\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"Sw-logo-white\" src=\"img/sw-logo-white-532a0ec919a9f54c31e35b924c7c55f1.svg\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<ul class=\"ul-base\">\n");
      out.write("\t\t\t\t\t\t\t<li> <h4>Startup Weekend</h4> </li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"\">Attendee FAQ</a> </li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<ul class=\"ul-base\">\n");
      out.write("\t\t\t\t\t\t\t<li> <h4>Connect With Us</h4></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"\">Twitter</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li> <a href=\"\"> Email</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 height-100\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-secundario\">\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<h4><a href=\"http://techstars.com/\" style=\"color: #3ccf80\">A Techstars Program</a></h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"ul-base hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Startup Weekend</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.startupnext.co/\">Startup Next</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.startupdigest.com/\">Startup Digest</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.startupweek.co/\">Startup Week</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
