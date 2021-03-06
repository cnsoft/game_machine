
package com.game_machine.entity_system.generated;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;

import java.io.ByteArrayOutputStream;
import com.dyuproject.protostuff.JsonIOUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.game_machine.entity_system.generated.Entity;

import com.dyuproject.protostuff.Pipe;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class ClientDisconnect  implements Externalizable, Message<ClientDisconnect>, Schema<ClientDisconnect>
{




    public static Schema<ClientDisconnect> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ClientDisconnect getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ClientDisconnect DEFAULT_INSTANCE = new ClientDisconnect();



    public ClientConnection clientConnection;


    


    public ClientDisconnect()
    {
        
    }






    

	public ClientConnection getClientConnection() {
		return clientConnection;
	}
	
	public ClientDisconnect setClientConnection(ClientConnection clientConnection) {
		this.clientConnection = clientConnection;
		return this;
	}
	
	public Boolean hasClientConnection()  {
        return clientConnection == null ? false : true;
    }



  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<ClientDisconnect> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public ClientDisconnect newMessage()
    {
        return new ClientDisconnect();
    }

    public Class<ClientDisconnect> typeClass()
    {
        return ClientDisconnect.class;
    }

    public String messageName()
    {
        return ClientDisconnect.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ClientDisconnect.class.getName();
    }

    public boolean isInitialized(ClientDisconnect message)
    {
        return true;
    }

    public void mergeFrom(Input input, ClientDisconnect message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;

            	case 1:


                	message.clientConnection = input.mergeObject(message.clientConnection, ClientConnection.getSchema());
                    break;

                	


            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ClientDisconnect message) throws IOException
    {

    	

    	if(message.clientConnection == null)
            throw new UninitializedMessageException(message);

    	


    	if(message.clientConnection != null)
    		output.writeObject(1, message.clientConnection, ClientConnection.getSchema(), false);

    	


    	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {

        	case 1: return "clientConnection";

            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {

    	__fieldMap.put("clientConnection", 1);

    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = ClientDisconnect.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static ClientDisconnect parseFrom(byte[] bytes) {
	ClientDisconnect message = new ClientDisconnect();
	ProtobufIOUtil.mergeFrom(bytes, message, RuntimeSchema.getSchema(ClientDisconnect.class));
	return message;
}

public ClientDisconnect clone() {
	byte[] bytes = this.toByteArray();
	ClientDisconnect clientDisconnect = ClientDisconnect.parseFrom(bytes);
	return clientDisconnect;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public byte[] toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, ClientDisconnect.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	return out.toByteArray();
}
		
public byte[] toProtobuf() {
	LinkedBuffer buffer = LinkedBuffer.allocate(8024);
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, RuntimeSchema.getSchema(ClientDisconnect.class), buffer);
		buffer.clear();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

}
