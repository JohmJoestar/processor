package com.ming.processor.repository;

import com.ming.processor.entity.TblDataOffset;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface TblDataOffsetRepository extends MongoRepository<TblDataOffset, String> {

    @Query("{'collectTime' : {'$gte' : ?0, '$lte' : ?1 }}")
    List<TblDataOffset> findByCollectTimeValueBetween(String headTime, String endTime);

}