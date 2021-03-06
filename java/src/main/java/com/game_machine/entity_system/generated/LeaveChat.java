
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

public final class LeaveChat  implements Externalizable, Message<LeaveChat>, Schema<LeaveChat>
{




    public static Schema<LeaveChat> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static LeaveChat getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final LeaveChat DEFAULT_INSTANCE = new LeaveChat();



    public List<ChatChannel> chatChannel;


    


    public LeaveChat()
    {
        
    }






    

	public List<ChatChannel> getChatChannelList() {
		return chatChannel;
	}

	public LeaveChat setChatChannelList(List<ChatChannel> chatChannel) {
		this.chatChannel = chatChannel;
		return this;
	}

	public ChatChannel getChatChannel(int index)  {
        return chatChannel == null ? null : chatChannel.get(index);
    }

    public int getChatChannelCount()  {
        return chatChannel == null ? 0 : chatChannel.size();
    }

    public LeaveChat addChatChannel(ChatChannel chatChannel)  {
        if(this.chatChannel == null)
            this.chatChannel = new ArrayList<ChatChannel>();
        this.chatChannel.add(chatChannel);
        return this;
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

    public Schema<LeaveChat> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public LeaveChat newMessage()
    {
        return new LeaveChat();
    }

    public Class<LeaveChat> typeClass()
    {
        return LeaveChat.class;
    }

    public String messageName()
    {
        return LeaveChat.class.getSimpleName();
    }

    public String messageFullName()
    {
        return LeaveChat.class.getName();
    }

    public boolean isInitialized(LeaveChat message)
    {
        return true;
    }

    public void mergeFrom(Input input, LeaveChat message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;

            	case 1:

            		if(message.chatChannel == null)
                        message.chatChannel = new ArrayList<ChatChannel>();

                    message.chatChannel.add(input.mergeObject(null, ChatChannel.getSchema()));

                    break;


            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, LeaveChat message) throws IOException
    {

    	

    	

    	if(message.chatChannel != null)
        {
            for(ChatChannel chatChannel : message.chatChannel)
            {
                if(chatChannel != null) {

    				output.writeObject(1, chatChannel, ChatChannel.getSchema(), true);

    			}
            }
        }


    	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {

        	case 1: return "chatChannel";

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

    	__fieldMap.put("chatChannel", 1);

    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = LeaveChat.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static LeaveChat parseFrom(byte[] bytes) {
	LeaveChat message = new LeaveChat();
	ProtobufIOUtil.mergeFrom(bytes, message, RuntimeSchema.getSchema(LeaveChat.class));
	return message;
}

public LeaveChat clone() {
	byte[] bytes = this.toByteArray();
	LeaveChat leaveChat = LeaveChat.parseFrom(bytes);
	return leaveChat;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public byte[] toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, LeaveChat.getSchema(), numeric);
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
		bytes = ProtobufIOUtil.toByteArray(this, RuntimeSchema.getSchema(LeaveChat.class), buffer);
		buffer.clear();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

}
