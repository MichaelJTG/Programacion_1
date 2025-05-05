package modelo.dao;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.javabeans.Clientes;

public class ClientesDaoImplXampJdbc extends AbsGenericoImplXamp implements ClientesDao{
	
	private ClientesDao cdao;

	public ClientesDaoImplXampJdbc() {
		super();
		
	}

	@Override
	public int altaDelCliente(Clientes cliente) {
		sql = "insert into clientes(cif,nombre,apellidos,domicilio,facturacion_anual,numero_empleados) values(?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomicilio());
			ps.setFloat(5, cliente.getFactura_anual());
			ps.setInt(6, cliente.getNumero_empleado());
			
			filas = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Clientes buscarUnCliente(String cif) {
		sql = "select * from clientes where cif = ?";
		Clientes clientes = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cif);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				clientes = new Clientes();
				clientes.setCif(rs.getString("cif"));
				clientes.setNombre(rs.getString("nombre"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return clientes;
	}

	@Override
	public List<Clientes> FindAll() {
		sql = "select * from clientes";//solo he escrito la sentencia
		List<Clientes> aux = new ArrayList<Clientes>();
		try {
			ps = conn.prepareStatement(sql);//preparo 
			rs = ps.executeQuery();//ejecuto la sentecia de sql
			
			while(rs.next()) {//leemos con rs.next
				
				Clientes clientes = new Clientes();
				
				clientes.setCif(rs.getString("cif"));
				clientes.setNombre(rs.getString("nombre"));
				clientes.setApellidos(rs.getString("apellidos"));
				clientes.setDomicilio(rs.getString("domicilio"));
				clientes.setFactura_anual(rs.getFloat("facturacion_anual"));
				clientes.setNumero_empleado(rs.getInt("numero_empleados"));
				
				
				aux.add(clientes);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return aux;
	}

	@Override
	public int eliminarUnCliente(String cif) {// 1 se puedo, -1 no existe, 0 se a cascado
		sql ="delete from clientes where cif = ?";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cif);
			filas = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas = -1;
		}
		
		
		
		return filas;
	}

	@Override
	public String exportar(String nombreFichero) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		String texto = "Sea exportado correctamente";
		sql = "select * from clientes";//solo he escrito la sentencia
		
		try {
			ps = conn.prepareStatement(sql);//preparo 
			rs = ps.executeQuery();//ejecuto la sentecia de sql
			
			fos = new FileOutputStream(nombreFichero);
			oos = new ObjectOutputStream(fos);
			
			while(rs.next()) {//leemos con rs.next
				
				Clientes clientes = new Clientes();
				
				clientes.setCif(rs.getString("cif"));
				clientes.setNombre(rs.getString("nombre"));
				clientes.setApellidos(rs.getString("apellidos"));
				clientes.setDomicilio(rs.getString("domicilio"));
				clientes.setFactura_anual(rs.getFloat("facturacion_anual"));
				clientes.setNumero_empleado(rs.getInt("numero_empleados"));
				
				oos.writeObject(clientes);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 texto = "Error en la exportación: " + e.getMessage();
		}
	
		
		return texto;
	}

	@Override
	public List<Clientes> importar(String nombreFichero) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<Clientes> aux = new ArrayList<>();
		
		
		try {
			
			fis = new FileInputStream(nombreFichero);
			ois = new ObjectInputStream(fis);
			
			  while (true) {
	                try {
	                    // Se lee el objeto y se convierte al tipo Clientes
	                    Clientes cliente = (Clientes) ois.readObject();
	                    aux.add(cliente);
	                } catch (EOFException eof) {
	                    // Se llega al final del fichero
	                    break;
	                }
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return aux;
	    }
	}

