Exp_LoginApp — Minimal JSP login example (drop-in for Tomcat)

Contents:
- index.jsp     : Login form (two text boxes: username & password)
- login.jsp     : Processes login and validates against SQL Server Users table
- WEB-INF/web.xml

How to deploy:
1. Place Exp_LoginApp.zip in Tomcat's webapps folder and unzip (or drop the extracted "Exp_LoginApp" folder).
2. Make sure Tomcat 11 (Jakarta Servlet API 6.0) is being used.
3. Put the Microsoft SQL Server JDBC driver (e.g., microsoft JDBC driver jar like mssql-jdbc-<version>.jar)
   into Tomcat's lib folder (TOMCAT_HOME/lib). Tomcat will load it for JSP/servlet usage.
4. Edit login.jsp and change:
     - dbUrl (server, port, databaseName)
     - dbUser (database username)
     - dbPass (database password)
5. Create the required Users table in your SQL Server database. Example SQL:
     CREATE TABLE Users (
       id INT IDENTITY PRIMARY KEY,
       username NVARCHAR(100) UNIQUE NOT NULL,
       password NVARCHAR(100) NOT NULL
     );
   Insert a test user:
     INSERT INTO Users (username, password) VALUES ('testuser', 'testpass');

Notes:
- This is intentionally minimal for learning/demo purposes. Passwords are stored plaintext in this example.
  For any real application, use hashed+salted passwords and secure connection practices.
- The login logic is implemented in JSP so Tomcat will compile it automatically; no pre-compilation needed.
- If you prefer a Servlet-based implementation (LoginServlet.java), I can generate that too — but you'd need to compile
  the servlet into a .class and place it under WEB-INF/classes (or package into a WAR). Let me know.

Enjoy — change the DB password as you said you would!
