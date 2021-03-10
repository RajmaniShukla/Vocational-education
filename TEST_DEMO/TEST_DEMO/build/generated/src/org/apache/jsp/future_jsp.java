package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class future_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("div#test{ border:#000 1px solid; padding:10px 40px 40px 40px; }\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("var pos = 0, test, test_status, question, choice, choices, chA, chB, chC, correct = 0;\n");
      out.write("var questions = [\n");
      out.write("    [ \"1.I leave everything eles when it is time for me study.\", \"True\", \"Most of the time\", \"False\"],\n");
      out.write("\t[ \"2).I eat my meals at fixed times daily.\", \"May be\", \"All the time\", \"No\", \"B\" ],\n");
      out.write("\t[ \"3.Given an option to attend tuition classes, you will attend\", \"At home\", \"IN group\", \"In class\", \"C\" ],\n");
      out.write("\t[ \"4.I remember everything that is spoken in the class\", \"True\", \"False\", \"Most of the times\", \"A\" ],\n");
      out.write("        [ \"5.Do you like to be compared with your friends?\", \"Yes\", \"No\", \"Some times\", \"B\" ],\n");
      out.write("        [ \" 6.I like to keep my phone with me even while studying.\", \"Most of the times\", \"No\", \"Yes\", \"B\" ],\n");
      out.write("        [ \"7.I have a fixed place in my home where I sit and study.\", \"No\", \"Yes\", \"Mostly\", \"A\" ],\n");
      out.write("        [ \"8.I study with my friends.\", \"No\", \"Yes\", \"Some times\", \"B\" ],\n");
      out.write("        [ \"9.Given an option to do eLearning, you will say.\", \"Yes\", \"No\", \"Some times\", \"A\" ],\n");
      out.write("        [ \"10.I know what subjects I will take up in Class XI and Class XII.\", \"Yes\", \"No\", \"Some Things\", \"A\" ],\n");
      out.write("        [ \"11.I play an outdoor game daily\", \"No\", \"Yes\", \"Mostly\", \"C\" ],\n");
      out.write("        [ \"12.I love to learn through practical demonstrations\", \"No\", \"I like Theories\", \"Yes\", \"C\" ],\n");
      out.write("        [ \"13.I don't feel tired after my studies\", \"Yes\", \"No\", \"Sometimes\", \"C\" ],\n");
      out.write("        [ \" 14.Do you leave a topic midway If you don't understand it?\", \"Yes\", \"Some Times\", \"No\", \"C\" ],\n");
      out.write("        [ \"15.Given an option to appear for Competitive/Entrance Exams, you will\", \"For Better college\", \"For Better Learning\", \"Highly Graduate facalities\", \"B\" ],\n");
      out.write("        [ \"16. My family members always encourage me to do well\", \"Yes\", \"Not Often\", \"No\", \"B\" ],\n");
      out.write("        [ \"17.Do you discuss your problems with your teacher(s)?\", \"Yes\", \"No\", \"Sometimes\", \"A\" ],\n");
      out.write("        [ \"18.Do you have a time table at home?\", \"No\", \"Yes\", \"Never\", \"B\" ],\n");
      out.write("        [ \"19.Do you have a fixed time to sleep?\", \"No\", \"Yes\", \"Not often\", \"C\" ],\n");
      out.write("        [\"have you like to listioning songs while studying?\",\"Yes\",\"No\",\"Mostly\",\"B\"]\n");
      out.write("    ];\n");
      out.write("function _(x){\n");
      out.write("\treturn document.getElementById(x);\n");
      out.write("}\n");
      out.write("function renderQuestion(){\n");
      out.write("\ttest = _(\"test\");\n");
      out.write("\tif(pos >= questions.length){\n");
      out.write("\t\ttest.innerHTML = \"<h2>You got \"+correct+\" of \"+questions.length+\" questions correct</h2>\";\n");
      out.write("\t\t_(\"test_status\").innerHTML = \"Test Completed\";\n");
      out.write("\t\ttest.innerHTML += \"<a href='#'>Re-test</a>\";\n");
      out.write("\t\ttest.innerHTML += \"<button>Done</button>\";\n");
      out.write("\t\tpos = 0;\n");
      out.write("\t\tcorrect = 0;\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\t_(\"test_status\").innerHTML = \"Question \"+(pos+1)+\" of \"+questions.length;\n");
      out.write("\tquestion = questions[pos][0];\n");
      out.write("\tchA = questions[pos][1];\n");
      out.write("\tchB = questions[pos][2];\n");
      out.write("\tchC = questions[pos][3];\n");
      out.write("\ttest.innerHTML = \"<h3>\"+question+\"</h3>\";\n");
      out.write("\ttest.innerHTML += \"<input type='radio' name='choices' value='A'> \"+chA+\"<br>\";\n");
      out.write("\ttest.innerHTML += \"<input type='radio' name='choices' value='B'> \"+chB+\"<br>\";\n");
      out.write("\ttest.innerHTML += \"<input type='radio' name='choices' value='C'> \"+chC+\"<br><br>\";\n");
      out.write("\ttest.innerHTML += \"<button onclick='checkAnswer()'>Submit Answer</button>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checkAnswer(){\n");
      out.write("\tchoices = document.getElementsByName(\"choices\");\n");
      out.write("\tfor(var i=0; i<choices.length; i++){\n");
      out.write("\t\tif(choices[i].checked){\n");
      out.write("\t\t\tchoice = choices[i].value;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tif(choice == questions[pos][4]){\n");
      out.write("\t\tcorrect++;\n");
      out.write("\t}\n");
      out.write("\tpos++;\n");
      out.write("\trenderQuestion();\n");
      out.write("}\n");
      out.write("window.addEventListener(\"load\", renderQuestion, false);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var limit=\"00:10\"\n");
      out.write("if (document.images){\n");
      out.write("var parselimit=limit.split(\":\")\n");
      out.write("parselimit=parselimit[0]*60+parselimit[1]*1\n");
      out.write("}\n");
      out.write("//function begintimer(){\n");
      out.write("//if (!document.images)\n");
      out.write("//return\n");
      out.write("//if (parselimit==1)\n");
      out.write("//window.location=\"msg.html\"\n");
      out.write("//else{ \n");
      out.write("//parselimit-=1\n");
      out.write("//curmin=Math.floor(parselimit/60)\n");
      out.write("//cursec=parselimit%60\n");
      out.write("//if (curmin!=0)\n");
      out.write("//curtime=curmin+\" minutes and \"+cursec+\" seconds left\"\n");
      out.write("//else\n");
      out.write("//curtime=cursec+\" seconds left\"\n");
      out.write("//window.status=curtime\n");
      out.write("//setTimeout(\"begintimer()\",1000)\n");
      out.write("//}\n");
      out.write("//}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body action=\"Future\" method=\"post\">\n");
      out.write("<h2 id=\"test_status\"></h2>\n");
      out.write("<div id=\"test\"></div>\n");
      out.write("<form>\n");
      out.write("<input type=\"submit\" value=\"Carriers\">\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
