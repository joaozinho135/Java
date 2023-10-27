package pkBanco;

import pkModelo.Flor;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FlorDAO {

    private String urlBanco = "jdbc:postgresql://localhost:5432/postgres";
    private String usuarioBanco = "postgres";
    private String senhaBanco = "postgres";

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int cadastrarFlor(Flor flor) {
        int cadastrado = 0;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement cadastrar = conexao.prepareStatement("INSERT INTO flowers(nome,especie,valor) VALUES (?,?,?)");
                cadastrar.setString(1, flor.getNome());
                cadastrar.setString(2, flor.getEspecie());
                cadastrar.setDouble(3, flor.getValor());
                cadastrar.executeUpdate();
                cadastrado = 1;
                cadastrar.close();
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cadastrado;
    }

    public Flor selecionarFlor(String nome) {
        Flor flor = null;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM flowers WHERE nome = '" + nome + "'");
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) {
                    nome = rs.getString("nome");
                    String especie = rs.getString("especie");
                    Double valor = rs.getDouble("valor");

                    flor = new Flor(nome, especie, valor);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flor;
    }

    public List<Flor> consultarFlores(String campo, String dado) {
        List<Flor> flores = new ArrayList<>();
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement consultarFlores;
                if (!campo.equals("especie")) {
                    consultarFlores = conexao.prepareStatement("SELECT * FROM flowers WHERE " + campo + " LIKE '%" + dado + "%'");
                } else {
                    consultarFlores = conexao.prepareStatement("SELECT * FROM flowers WHERE especie = " + dado);
                }
                ResultSet rs = consultarFlores.executeQuery();
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    String especie = rs.getString("especie");
                    Double valor = rs.getDouble("valor");
                    flores.add(new Flor(nome, especie, valor));
                }
                rs.close();
                consultarFlores.close();
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flores;
    }

    public boolean deletarFlor(String nome) {
        boolean florDeletado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement deletar = conexao.prepareStatement("DELETE FROM flowers WHERE nome = '" + nome + "'");
                florDeletado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return florDeletado;
    }

    public boolean atualizarFlor(Flor flor) {
        boolean florAtualizado = false;
        try {
            Connection conexao = getConnection();
            if (conexao != null) {
                PreparedStatement atualizar = conexao.prepareStatement("UPDATE flowers set nome=?,especie=?,valor=?");
                atualizar.setString(1, flor.getNome());
                atualizar.setString(2, flor.getEspecie());
                atualizar.setDouble(3, flor.getValor());
            
                florAtualizado = atualizar.executeUpdate() > 0;
                atualizar.close();
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return florAtualizado;
    }
}
