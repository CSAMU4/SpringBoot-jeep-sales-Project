package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import java.util.Comparator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class Jeep implements Comparable<Jeep> {
  
  private Long modelPK; 
  private JeepModel modelId; 
  private String trimLevel; 
  private int numDoors; 
  private int wheelSize; 
  private BigDecimal basePrice;
  
  
  @JsonIgnore // Jackson will ignore/leave out model primary key 
  public Long getModelPK() {
    return modelPK; 
  }

  @Override // added an unimplemented method 
  public int compareTo(Jeep that) {
    // @formatter:off
    return Comparator //java.util.Comparator 
    .comparing(Jeep::getModelId)
    .thenComparing(Jeep::getTrimLevel)
    .thenComparing(Jeep::getNumDoors)
    .compare(this, that);
  // @formatter:on 
  }
  }  
