<%@ taglib uri="/struts-tags" prefix="s" %>

<h3>Here is a simple Struts2 form.</br>
Enter your details to save in database !</br></h3>
</br>
</br>
<html><title>Oodles Struts2+ Hibernate</title>
<body style="{font-family:Segoe Print;text-align: center; }">
<center>
<s:form method="post" action="saveDetails.action">
<s:textfield label="Name" name="name"/>
<s:password label="Password" name="password"/>
<s:radio list="{'Male','Female'}" label="Gender" name="gender"></s:radio>
<s:select list="{'Gurgaon','Moradabad','Delhi','Noida'}" name="city" label="City"></s:select>
<s:submit label="Save"></s:submit>
</s:form>
</center>
</body></html>