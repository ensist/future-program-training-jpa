package com.gdn.future.program.training.jpa.model.entity;

import com.gdn.future.program.training.jpa.model.constants.BaseEntityConstant;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
abstract class BaseEntity implements Serializable {

  @Id
  @Column(name = BaseEntityConstant.ID)
  @GeneratedValue(generator = BaseEntityConstant.SYSTEM_UUID)
  @GenericGenerator(name = BaseEntityConstant.SYSTEM_UUID, strategy = BaseEntityConstant.STRATEGY_UUID2)
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

