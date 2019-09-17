package br.com.padaria.model;

import java.io.Serializable;

/**
 *
 * @author ltavares
 */
public abstract class BaseEntity implements Serializable {
    
  protected Integer id;

   public Integer getId() {
     return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public boolean isPersistent() {
      return (id != null);
   }    
}
