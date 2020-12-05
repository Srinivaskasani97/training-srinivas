<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body align="center" bgcolor="wheat">
	<h1>Welcome to Doctor Home</h1>
	<br>
	<br>
	<a href="doctor_home.html">Home</a>
	<a href="doctor_profile.jsp">Profile</a>
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
			<td>Specialisation</td>
			<td>Action</td>
		</tr>
		<%
			Connection connection = DatabaseConnection.connectivity();
		PreparedStatement ps = null;
		int id = (Integer) session.getAttribute("sid");
		System.out.println(id);
		String sql = "select * from doctor where id=?";
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
			<td><%=rs.getString("specialisation")%></td>
			<td><a href="Doctor_Profile_Update_Display.jsp?msg=+id">Update</a></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>