package TextInterfaceConnection;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class TextualInterfaceConnectionImpl implements TextualInterfaceConnection
{
     private TextualInterfaceConnection conn;

    public TextualInterfaceConnectionImpl(TextualInterfaceConnection conn)
    {
        this.conn = conn;
    }

     @Override
    public void writeInt(int i) throws IOException
    {
        conn.writeInt(i);
    }
    
    @Override
    public int readInt() throws IOException
    {
        return conn.readInt();
    }

    

    @Override
    public void close() throws IOException
    {
        conn.close();
    }

    @Override
    public void writeString(String str) throws IOException
    {
        conn.writeString(str);
    }

    @Override
    public String readString() throws IOException
    {
       return conn.readString();
    }


}
