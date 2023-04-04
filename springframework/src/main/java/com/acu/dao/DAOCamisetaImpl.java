package com.acu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acu.beans.Camiseta;

@Repository
public class DAOCamisetaImpl implements DAOCamiseta {
	@Autowired
	private DataSource dataSource;

	@Override
	public void registrar(Camiseta camiseta) throws Exception {
		String sql = "INSERT INTO camiseta(id,numero,idMarca) values (?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, camiseta.getId());
			ps.setInt(2, camiseta.getNumero());
			ps.setInt(3, camiseta.getMarca().getId());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw e;
			// TODO: handle exception
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
	}

}
