package com.theskysid.dateandtime.Repository;

import com.theskysid.dateandtime.Entity.DateAndTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateAndTimeRepository extends JpaRepository<DateAndTime, Long> {
}
