package com.military;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOps {
	
	//Writes object array to file.
	public static WriteFileReturn writeToSerialFile(ArrayList<Military> military) {
		WriteFileReturn fW = new WriteFileReturn();
		 try
	        {
	            FileOutputStream fos = new FileOutputStream("Military.dat");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(military);
	            oos.close();
	            fos.close();
	            fW.setSuccess(true);
	            fW.setEx(null);
	            return fW;
	        }
	        catch (IOException ex)
	        {
	        	 fW.setSuccess(false);
		            fW.setEx(ex);
		            return fW;
	        }
		 
		 	catch(Exception ex)
		 {
		 		fW.setSuccess(false);
	            fW.setEx(ex);
	            return fW;
		 }
	}

	@SuppressWarnings("unchecked")
	//Reads object array from file.
	public static  ReadFileReturn readFromSerialFile() {
		
		ReadFileReturn fR = new ReadFileReturn();
		
		try
       {
           FileInputStream fis = new FileInputStream("Military.dat");
           ObjectInputStream ois = new ObjectInputStream(fis);

          fR.setMilitaryList((ArrayList<Military>) ois.readObject());
          fR.setSuccess(true);
          fR.setEx(null);
           ois.close();
           fis.close();
       }
		 catch (IOException ex)
        {
        	 fR.setSuccess(false);
	            fR.setEx(ex);
	            return fR;
        }
	 
	 	catch(Exception ex)
	 {
	 		fR.setSuccess(false);
            fR.setEx(ex);
            return fR;
	 		
	 }
		return fR;
	}
}
