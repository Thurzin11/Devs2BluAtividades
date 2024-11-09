package semanaDez.AulaDeBanco;

import java.sql.*;

public class TesteConexao {

    private static final String URL = "jdbc:mysql://localhost:5432/db_aula";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgre";

    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            con.setAutoCommit(false);
            if (con!=null){
                String sql = "insert into usuarios(nome,email)values('jaca','jaca@gmail.com')";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                sql = "insert into usuarios(nome,email)values('jucaxxxxxxx','juca@gmail.com')";
                stmt = con.prepareStatement(sql);
                stmt.execute();
                con.commit();
            }
        }catch (SQLException e) {
            try{
                con.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
