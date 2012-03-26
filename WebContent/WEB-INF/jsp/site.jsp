<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
	<title>UI - Site management system</title>
  </head>
  <body>
  
  <h4>New Site</h4>
	
	<form:form method="post" action="addSite.html" commandName="site">
		<table>
		<tr>
			<td>Site</td>
			<td><form:input path="site" />
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
			<td><form:input path="condition" />
			<form:errors path="condition" /></td>
		</tr>		
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>	
	</form:form>
	
	<c:if  test="${!empty userList}">
	<table class="data">
	<tr>
		<th>Site</th>
		<th>URL</th>
		<th>Description</th>
		<th>Profile ID</th>
		<th>Condition</th>
		<th>Date Created</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
			   <td>${user.username}</td>
			   <td>${user.firstName}</td>
			   <td>${user.lastName}</td>
			   <td>${user.dateCreated}</td>
			   <td><a href="editUser.html?id=${user.id}">Edit</a></td>
			   <td><a href="deleteUser.html?id=${user.id}">delete</a></td>
			</tr>
	</c:forEach>
	</table>
	</c:if>

  </body>
</html>

