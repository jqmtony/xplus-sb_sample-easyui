package org.xplus.sample.configuration.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * 任务类<br>
 * 
 * @author qiming.kong
 *
 */
@Configuration
@Component // 此注解必加
@EnableScheduling // 此注解必加
public class ScheduleTask {
	
	private static final Logger logger = LoggerFactory.getLogger(ScheduleTask.class);
	
	public void sayHello(){
		logger.info("sayHello");
	}
}
