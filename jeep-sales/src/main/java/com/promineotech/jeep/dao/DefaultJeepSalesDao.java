package com.promineotech.jeep.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultJeepSalesDao implements JeepSalesDao {
  
   @Autowired 
   @Getter
   private NamedParameterJdbcTemplate jdbcTemplate;
  
   @Override
   public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.debug("DAO: model={}, trim={}", model, trim);
    return null;
  }

}
