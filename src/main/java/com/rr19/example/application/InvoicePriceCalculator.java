package com.rr19.example.application;

import java.sql.*;

/*
    DO NOT MODIFY THE CODE IN THIS CLASS. IT'S DESIGNED AND IMPLEMENTED WITH A SPECIFIC TESTING PURPOSE.
*/


public class InvoicePriceCalculator {

    public Double totalAmountOfInvoicesById(String customerId) throws Exception {
        Connection conn = null;
        String db = "jdbc:hsqldb:hsql://localhost/Test";
        String user = "SA";
        String password = "";
        double total = 0.0;

        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver" );
            conn = DriverManager.getConnection(db, user, password);

            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery("SELECT SUM(INVOICE.TOTAL) AS TOTAL FROM INVOICE LEFT JOIN CUSTOMER ON INVOICE.CUSTOMERID = CUSTOMER.ID WHERE CUSTOMER.ID = " + customerId);

            if (rs.next())
                total = rs.getDouble("TOTAL");

            rs.close();
            stmt.close();
        }
        catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        finally {
            try {
                if (conn != null)
                    conn.close();
            }
            catch (SQLException e) {
                throw new SQLException(e.getMessage());
            }
        }
        return total;
    }
}
