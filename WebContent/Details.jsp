<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html><title>Oodles Struts2+ Hibernate</title>
<body style="{font-family:Segoe Print;text-align: center; }">
Congratulations <s:property value="name"/> !</br>
</br>
<table style="font-family: Palatino Linotype;" border="1">
<b></b><tr style="background-color:teal;color: white"><td>Name</td><td>Password</td> <td>Gender</td> <td>City</td></tr></b>
<tr><td><s:property value="name"/></td><td><s:property value="password"/></td><td>
<s:property value="gender"/></td><td><s:property value="city"/></td></tr>

</table>
</br>
Your Details are successfully saved in database !
</body></html>