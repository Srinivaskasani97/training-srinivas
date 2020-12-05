<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="wheat">
	<h1>Welcome to Patient Home</h1>
	<br>
	<br>
	<a href="patient_home.html">Home</a>
	<a href="patient_profile.jsp">Profile</a>
	<a href="index.html">Logout</a>
	<br>
	<br>
	<%@ page import="java.sql.*,com.databaseconnection.DatabaseConnection"%>
	<table align="center" border="1.0" cellpadding="2">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			
		</tr>
		<%
			Connection connection = DatabaseConnection.connectivity();
		PreparedStatement ps = null;
		int id = (Integer) session.getAttribute("sid");
		System.out.println(id);
		String sql = "select * from patient where id=?";
		ps = connection.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
		%>

		<tr>
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getInt("phone")%></td>
			
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>