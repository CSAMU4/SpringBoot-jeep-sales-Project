package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class Jeep {
  
  private Long modelPK; 
  private JeepModel modelID; 
  private String trimLevel; 
  private int numDoors; 
  private int wheelSize; 
  private BigDecimal basePrice;
  
  }  
