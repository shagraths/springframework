package com.acu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acu.beans.Equipo;

@Repository
public class DAOEquipoImpl implements DAOEquipo{
	@Autowired
	private DataSource dataSource;
	@Override
	public void registrar(Equipo equipo) throws Exception {
		
		String sql = "INSERT INTO equipo(id,nombre) values (?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, equipo.getId());
			ps.setString(2, equipo.getNombre());
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
