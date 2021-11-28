package com.tannu.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.tannu.bean.Element;

public class ElementDaoImpl implements ElementDao {

	@Override
	public ArrayList<Element> getAllElement() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		ArrayList<Element> elementList=new ArrayList<Element>();
		
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tannu");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ELEMENT");
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			while(resultSet.next()) {
				int atomicWeight=resultSet.getInt("ATOMIC_WEIGHT");
				String name=resultSet.getString("NAME");
				String symbol=resultSet.getString("SYMBOL");
				Element element=new Element(atomicWeight, name, symbol);
				elementList.add(element);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return elementList;
	}

	@Override
	public Element getElementByName(String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Element element=null;
		
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tannu");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM ELEMENT WHERE NAME=?");
			
			preparedStatement.setString(1, name);
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			
			if(resultSet.next()) {
				int atomicWeight1=resultSet.getInt("ATOMIC_WEIGHT");
				String name1=resultSet.getString("NAME");
				String symbol=resultSet.getString("SYMBOL");
				
				element=new Element(atomicWeight1, name1, symbol);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return element;
	}

	@Override
	public int addElement(Element element) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tannu");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO ELEMENT VALUES(?,?,?)");
			
			preparedStatement.setInt(1, element.getAtomicWeight());
			preparedStatement.setString(2, element.getName());
			preparedStatement.setString(3, element.getSybmol());
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int deleteElement(String name) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tannu");
			
//			2. Query
			preparedStatement=connection.prepareStatement("DELETE FROM ELEMENT WHERE NAME=?");
			
			preparedStatement.setString(1, name);
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	
	public int updateAtomicWeightByName(String name, int atomicWeight) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tannu");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE ELEMENT SET ATOMIC_WEIGHT=? WHERE NAME=?");
			
			preparedStatement.setInt(1, atomicWeight);
			preparedStatement.setString(2, name);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int updateAutomicweightByName(String name, int atomicWeight) {
		// TODO Auto-generated method stub
		return 0;
	}

}