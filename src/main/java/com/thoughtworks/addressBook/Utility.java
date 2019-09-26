package com.thoughtworks.addressBook;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utility
{
    //Object Mapper
    private static ObjectMapper mapper;

    static
    {
        mapper=new ObjectMapper();
    }

    public static String convertJavaToJson(Object object)
    {	String jsonResult=" ";
        try
        {
            jsonResult= mapper.writeValueAsString(object);
        }
        catch(JsonGenerationException e)
        {
            System.out.println("exception ocur wile converting java to json");
        }
        catch (JsonMappingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jsonResult;
    }

    public static <T> T convertJsonToJava(String jsonString,Class<T> cls)
    {
        T result=null;

        try
        {
            result= mapper.readValue(jsonString, cls);
        }
        catch(JsonGenerationException e)
        {
            System.out.println("exception ocur wile converting json to java  ");
        }
        catch (JsonMappingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static void filewrite(String s) throws IOException
    {
        FileOutputStream fils=null;
        //FileOutputStream will throw exception---so surrounding try catch

        try
        {
            fils=new FileOutputStream("sush.txt");

            //convert string to byte
            //as FileOutputStream support byte by byte input
            //so here we convert string to byte and create 1 byte array
            byte b[]=s.getBytes();

            //now we pass the byte array
            fils.write(b);

            System.out.println("written successfuly");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            fils.close();
        }
    }

}
