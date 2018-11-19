package models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * [purpose]
 * <p>
 * Project ws-test<br>
 * BrokenMessage.java created nov 19, 2018
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@SuppressWarnings("unused")
public class BrokenMessage extends Message
{
   // Note: leaving out these annotations means Jackson can't handle this object, which is what we want.
//   @JsonCreator
   public BrokenMessage(/*@JsonProperty("id") */int id, /*@JsonProperty("payload") */String payload)
   {
      super(id, payload);
   }
}