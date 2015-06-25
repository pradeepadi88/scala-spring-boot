package org.vdms.scholarship.db.entity

import javax.persistence.{Column, Entity, Id}

import scala.beans.BeanProperty

/**
 * Created by Deny Prasetyo
 * 25 June 2015
 * Principal Software Development Engineer
 * GDP Labs
 * deny.prasetyo@gdplabs.id
 */

@Entity
class Occupation(i: String, n: String, ne: String) {

  @Id
  @BeanProperty
  var id: String = i
  @BeanProperty
  @Column(nullable = false)
  var name: String = n
  @BeanProperty
  @Column(nullable = false)
  var nameEng: String = ne


}

object Occupation {
  def apply(i: String, n: String,ne:String): Occupation = {
    new Occupation(i, n,ne)
  }

  def unapply(o: Occupation): Option[(String, String,String)] = {
    Some(o.id, o.name,o.nameEng)
  }
}