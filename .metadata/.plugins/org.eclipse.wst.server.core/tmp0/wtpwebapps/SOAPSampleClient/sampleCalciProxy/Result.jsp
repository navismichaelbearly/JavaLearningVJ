<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalciProxyid" scope="session" class="com.n2s.CalciProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalciProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalciProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalciProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.n2s.Calci getCalci10mtemp = sampleCalciProxyid.getCalci();
if(getCalci10mtemp == null){
%>
<%=getCalci10mtemp %>
<%
}else{
        if(getCalci10mtemp!= null){
        String tempreturnp11 = getCalci10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String x_1id=  request.getParameter("x16");
        int x_1idTemp  = Integer.parseInt(x_1id);
        String y_2id=  request.getParameter("y18");
        int y_2idTemp  = Integer.parseInt(y_2id);
        int add13mtemp = sampleCalciProxyid.add(x_1idTemp,y_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(add13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String x_3id=  request.getParameter("x23");
        int x_3idTemp  = Integer.parseInt(x_3id);
        String y_4id=  request.getParameter("y25");
        int y_4idTemp  = Integer.parseInt(y_4id);
        int sub20mtemp = sampleCalciProxyid.sub(x_3idTemp,y_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sub20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>