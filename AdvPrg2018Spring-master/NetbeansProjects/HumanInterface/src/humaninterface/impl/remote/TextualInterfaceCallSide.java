/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humaninterface.impl.remote;

import TextInterfaceConnection.TextualInterfaceConnection;
import humaninterface.TextualInterface;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class TextualInterfaceCallSide implements TextualInterface
{
    private TextualInterfaceConnection con;
    
    public TextualInterfaceCallSide(TextualInterfaceConnection con)
    {
        this.con = con;
        
    }

    @Override
    public void sendMessage(String msg)
    {
        try
          {
            con.writeString(msg);
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @Override
    public String askForString(String question)
    {
        try
          {
            return con.readString();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return null;
    }

    @Override
    public String askForPassword(String question)
    {
        try
          {
            return con.readString();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return null;
    } 

    @Override
    public String askForEmail(String question)
    {
        try
          {
            return con.readString();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return null;
    }

    @Override
    public int askForInteger(String question)
    {
        try
          {
            return con.readInt();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return 0;
    }
    
    @Override
    public int askForInteger(String question, int min, int max)
    {
        try
          {
            return con.readInt();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return 0;
    }

    @Override
    public int makeSingleChoice(String question, String[] choices)
    {
        try
          {
            return con.readInt();
          } catch (IOException ex)
          {
            Logger.getLogger(TextualInterfaceCallSide.class.getName()).log(Level.SEVERE, null, ex);
          }
        return 0;
        
    }

    
    
}
