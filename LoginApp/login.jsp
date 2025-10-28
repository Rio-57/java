<%@ page import="java.sql.*" %>
<%
    String dbUrl = "jdbc:mysql://localhost:3306/LoginDB";
    String dbUser = "root";
    String dbPass = "Hunain26!@!";  // change to your real MySQL root password

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username == null || password == null) {
        out.println("Missing credentials.");
        return;
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

        String sql = "SELECT COUNT(*) FROM Users WHERE username = ? AND password = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        rs = ps.executeQuery();

        int count = 0;
        if (rs.next()) count = rs.getInt(1);

        if (count > 0) {
            out.println("<h2>Login successful!</h2>");
        } else {
            out.println("<h2>Invalid username or password.</h2>");
        }

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception ignored) {}
        try { if (ps != null) ps.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
%>
