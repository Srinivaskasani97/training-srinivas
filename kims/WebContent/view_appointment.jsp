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
<a href="view_appointment.jsp">Appointment Details</a>
<a href="index.html">Logout</a>

<%@include file="connection.jsp" %>
<table border="1" align = "center">
<tr>
<td>Patient Name</td>
<td>Phone Number</td>
<td>Email</td>
<td>Gender</td>
<td>Blood Group</td>
<td>Specialist</td>
<td>Date</td>
<td>Time</td>
<td>Status</td>
<td>Doctor Name</td>
<td>Action</td>
</tr>

<%
String sql="select * from appointment where specialist=?";
ps=connection.prepareStatement(sql);
String specialisation = (String) session.getAttribute("sspecialisation");
ps.setString(1, specialisation);
ResultSet rs = ps.executeQuery();
while(rs.next()) {
%>
<tr>
<td><%=rs.getString("patient_name") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("blood_group") %></td>
<td><%=rs.getString("specialist") %></td>
<td><%=rs.getString("date_of_appointment") %></td>
<td><%=rs.getString("time_of_appointment") %></td>
<td><%=rs.getString("status") %></td>
<td><%=rs.getString("doctor_name") %></td>
<%if(rs.getString("status").equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%} else { %>
<td><a href="accept_appointment.jsp?id=<%=rs.getInt("aid")%>">Accept</a></td>
<%} %> 
</tr>
<%} %>
</table>
</body>
</html>