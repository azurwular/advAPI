/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextInterfaceConnection;

import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 *
 * @author Dell
 */
public interface TextualInterfaceConnection extends Closeable
{
    
    public void writeInt(int i) throws IOException;
   
    public void writeString(String str) throws IOException;  
    public int readInt() throws IOException;

    public String readString() throws IOException;
    

}

