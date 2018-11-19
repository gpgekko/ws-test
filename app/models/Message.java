package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * [purpose]
 * <p>
 * Project ws-test<br>
 * Message.java created nov 19, 2018
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@SuppressWarnings("unused")
public class Message
{
   private final int id;
   private final String payload;

   @JsonCreator
   public Message(@JsonProperty("id") int id, @JsonProperty("payload") String payload)
   {
      this.id = id;
      this.payload = payload;
   }

   /**
    * Getter for property 'id'.
    *
    * @return Value for property 'id'.
    */
   public int getId()
   {
      return this.id;
   }

   /**
    * Getter for property 'payload'.
    *
    * @return Value for property 'payload'.
    */
   public String getPayload()
   {
      return this.payload;
   }

   @Override
   public String toString()
   {
      return "Message{" + "id=" + this.id + ", payload='" + this.payload + '\'' + '}';
   }
}