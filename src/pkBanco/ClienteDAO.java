package pkBanco;


import pkModelo.Cliente;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO 
{
    private String urlBanco = "jdbc:postgresql://localhost:5432/bancoemocionante";
    private String usuarioBanco = "postgres";
    private String senhaBanco = "mcjow1998";
    private Connection getConnection() 
    {
        Connection connection = null;
        try 
        {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);
        } catch (SQLException e) 
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return connection;
    }
    public int cadastrarCliente(Cliente cliente)
    {
        int cadastrado = 0;
        try
        {
            Connection conexao = getConnection();
            if (conexao != null)
            {
                PreparedStatement cadastrar = conexao.prepareStatement("INSERT INTO clientes(nome,cpf,idade,telefone,email) VALUES (?,?,?,?,?)");
                cadastrar.setString(1, cliente.getNome());
                cadastrar.setString(2, cliente.getCpf());
                cadastrar.setInt(3, cliente.getIdade());
                cadastrar.setString(4, cliente.getTelefone());
                cadastrar.setString(5, cliente.getEmail());
                cadastrar.executeUpdate();
                cadastrado = 1;
                cadastrar.close();
                conexao.close();
            }	
        }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return cadastrado;
    }
    public Cliente selecionarCliente(String cpf) 
    {
        Cliente cliente=null;
        try
        {
            Connection conexao = getConnection();
            if (conexao != null)
            {
                PreparedStatement consultar = conexao.prepareStatement("SELECT * FROM clientes WHERE cpf = '" + cpf + "'");
                ResultSet rs = consultar.executeQuery();
                while (rs.next()) 
                {
                    String nome = rs.getString("nome");
                    int idade = rs.getInt("idade");
                    String telefone = rs.getString("telefone");
                    String email = rs.getString("email");
                    cliente = new Cliente(nome,cpf,idade,telefone,email);
                }
                rs.close();
                consultar.close();
                conexao.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return cliente;
    }
    public List<Cliente> consultarClientes(String campo,String dado) {
	List<Cliente> clientes = new ArrayList<>();
	try
	{
            Connection conexao = getConnection();
            if (conexao != null)
            {
		PreparedStatement consultarClientes;
		if (!campo.equals("idade"))
                    consultarClientes = conexao.prepareStatement("SELECT * FROM clientes WHERE " + campo + " LIKE '%" + dado + "%'");
		else
                    consultarClientes = conexao.prepareStatement("SELECT * FROM clientes WHERE idade = " + dado);
                ResultSet rs = consultarClientes.executeQuery();
                while (rs.next()) 
                {
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    int idade = rs.getInt("idade");
                    String telefone = rs.getString("telefone");
                    String email = rs.getString("email");
                    clientes.add(new Cliente(nome,cpf,idade,telefone,email));
                }	
                rs.close();
                consultarClientes.close();
                conexao.close();
            }
	}catch (SQLException e)
	{
            e.printStackTrace();
	}catch (Exception e)
	{
            e.printStackTrace();
        }
	return clientes;
    }
    public boolean deletarCliente(String cpf)
    {
	boolean clienteDeletado=false;
	try
	{
            Connection conexao = getConnection();
            if (conexao != null)
            {
		PreparedStatement deletar = conexao.prepareStatement("DELETE FROM clientes WHERE cpf = '" + cpf + "'");
		clienteDeletado = deletar.executeUpdate() > 0;
		deletar.close();
		conexao.close();
            }
        }catch (SQLException e)
	{
            e.printStackTrace();
	}catch (Exception e)
	{
            e.printStackTrace();
	}
	return clienteDeletado;
    }
    public boolean atualizarCliente(Cliente cliente)
    {
	boolean clienteAtualizado=false;
	try
	{
            Connection conexao = getConnection();
            if (conexao != null)
            {
		PreparedStatement atualizar = conexao.prepareStatement("UPDATE clientes set nome=?,idade=?,telefone=?,email=? where cpf=?");
		atualizar.setString(1,cliente.getNome());
		atualizar.setInt(2,cliente.getIdade());
		atualizar.setString(3,cliente.getTelefone());
		atualizar.setString(4,cliente.getEmail());
		atualizar.setString(5,cliente.getCpf());
		clienteAtualizado = atualizar.executeUpdate() > 0;
		atualizar.close();
		conexao.close();
            }
        }catch (SQLException e)
	{
            e.printStackTrace();
	}catch (Exception e)
	{
            e.printStackTrace();
	}
	return clienteAtualizado;
    }
}
