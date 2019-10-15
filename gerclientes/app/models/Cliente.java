/**
 * 
 */
package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

/**
 * @author joaohelis
 *
 */
@Entity
public class Cliente extends Model {
	
	public String nome;
	public String email;

}
