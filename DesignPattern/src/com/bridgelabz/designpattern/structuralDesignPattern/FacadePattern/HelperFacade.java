package com.bridgelabz.designpattern.structuralDesignPattern.FacadePattern;

import java.sql.Connection;
import java.sql.SQLException;

import com.sun.corba.se.impl.util.Utility;

public class HelperFacade {

	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) throws SQLException{
		Connection con = null;
		Utility u=new Utility();
		//System.out.println("enter which db type you want");
		//String dbType1=u.inputString();
		switch (dbType){
		case MYSQL: 
			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();
			//System.out.println("enter which reporttype you want");
			switch(reportType){
			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			}
			break;
		case ORACLE: 
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch(reportType){
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		}
		
	}
	
	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	
	public static enum ReportTypes{
		HTML,PDF;
	}
}