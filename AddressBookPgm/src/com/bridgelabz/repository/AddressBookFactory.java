package com.bridgelabz.repository;

public class AddressBookFactory  {
     public static FileParsing getFileType(String fileType) {
    	 if(fileType.equalsIgnoreCase("json")) {
    		 return new JsonFileParsing();
    	 }
    	 if(fileType.equalsIgnoreCase("jdbc")) {
    		 return new JdbcParsing();
    	 }
    	 return null;
     }
}
