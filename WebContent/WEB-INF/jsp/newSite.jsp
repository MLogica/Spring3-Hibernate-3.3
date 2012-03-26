<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
	<title>UI - Site management system</title>
	<link rel="stylesheet" type="text/css" href="includes/css/global.css" />
	
	<script type="text/javascript" src="includes/js/jquery-1.7.1.js"></script>
	<script type="text/javascript"> 
	
	   $(document).ready(function(){
	      $(".flip").click(function(){
	         $(".blueTable").slideToggle("fast");
	      });
	   });
 
	</script>	
	
  </head>
  <body>
  
  <h4>New Site</h4>
	
	<form:form method="post" action="newSite.html" commandName="site">
		<table class="forestGreenTable">
		<tr>
			<td>Site</td>
			<td>  <input type="text" name="site" /> </td>
		</tr>		
		<tr>
			<td>URL</td>
			<td><input type="text" name="url" /></td> 
		</tr>
		<tr>
			<td>Description</td>
			<td><input type="text" name="description" /></td> 
		</tr>
		<tr>
			<td>Profile ID</td>
			<td><input type="text" name="profileId" /></td>
		</tr>
		<tr>
			<td>Condition</td>
			<td><input type="text" name="reference" /></td>
		</tr>				
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit"/>
			</td>
		</tr>
	</table>	
	</form:form>
	
	<c:if  test="${!empty sitesList}">
	<p class="flip">List of Sites (Show/Hide) Panel</p>
	<div class="blueTable" id="dataTable"> 
		<table class="data">
			<thead><tr>
				<th>Site</th>
				<th>URL</th>
				<th>Description</th>
				<th>Profile ID</th>
				<th>Condition</th>
				<th>Date Created</th>
				<th>Edit</th>
				<th>Delete</th></tr>
			</thead>
			<c:forEach items="${sitesList}" var="site">
				<tr>
				   <td>${site.site}</td>
				   <td>${site.url}</td>
				   <td>${site.description}</td>
				   <td>${site.profileId}</td>
				   <td>${site.reference}</td>
				   <td>${site.dateCreated}</td>
				   <td><a href="editSite.html?id=${site.siteId}">Edit</a></td>
				   <td><a href="removeSite.html?id=${site.siteId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	</c:if>

  </body>
</html>

