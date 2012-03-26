<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

  <head>
	<title>UI - Site management system</title>
  </head>
  <body>
  
  <h4>Edit Site</h4>
	
	<form:form method="post" action="updateSite.html" commandName="site">
		<table>
		<tr>
			<td>Site</td>
			<td><form:input path="site"/>
			<form:errors path="site"  cssClass="errors" /></td>
		</tr>		
		<tr>
			<td>URL</td>
			<td><form:input path="url" />
			<form:errors path="url" cssClass="errors" /></td> 
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="description" />
			<form:errors path="description" cssClass="errors" /></td> 
		</tr>
		<tr>
			<td>Profile ID</td>
			<td><form:input path="profileId" />
			<form:errors path="profileId" /></td>
		</tr>
		<tr>
			<td>Condition</td>
			<td><form:input path="reference" />
			<form:errors path="reference" /></td>
		</tr>				
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>	
	<form:hidden path="siteId"   />
	</form:form>

  </body>
</html>

