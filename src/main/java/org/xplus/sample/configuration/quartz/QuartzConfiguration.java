package org.xplus.sample.configuration.quartz;

import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Quartz配置<br>
 * <p>
 * 参考资料:<br>
 * Spring-Boot整合Quartz实现动态配置定时任务<br>
 * http://blog.csdn.net/liuchuanhong1/article/details/60873295<br>
 * <br>
 * Spring Boot集成持久化Quartz定时任务管理和界面展示 <br>
 * http://blog.csdn.net/u012907049/article/details/73801122<br>
 * <br>
 * 任务调度开源框架Quartz动态添加、修改和删除定时任务<br>
 * http://blog.csdn.net/luo201227/article/details/37511137<br>
 * </p>
 * 
 * @author qiming.kong
 *
 */
@Configuration
public class QuartzConfiguration {

	/**
	 * 配置定时任务
	 */
	@Bean(name = "jobDetail")
	public MethodInvokingJobDetailFactoryBean detailFactoryBean(ScheduleTask task) {// ScheduleTask为需要执行的任务

		MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
		/*
		 * 是否并发执行 例如每5s执行一次任务，但是当前任务还没有执行完，就已经过了5s了，
		 * 如果此处为true，则下一个任务会执行，如果此处为false，则下一个任务会等待上一个任务执行完后，再开始执行
		 */
		jobDetail.setConcurrent(false);

		jobDetail.setName("srd-chhliu");// 设置任务的名字
		jobDetail.setGroup("srd");// 设置任务的分组，这些属性都可以存储在数据库中，在多任务的时候使用

		/*
		 * 为需要执行的实体类对应的对象
		 */
		jobDetail.setTargetObject(task);

		/*
		 * sayHello为需要执行的方法
		 * 通过这几个配置，告诉JobDetailFactoryBean我们需要执行定时执行ScheduleTask类中的sayHello方法
		 */
		jobDetail.setTargetMethod("sayHello");
		return jobDetail;
	}

	/**
	 * 配置定时任务的触发器，也就是什么时候触发执行定时任务
	 */
	@Bean(name = "jobTrigger")
	public CronTriggerFactoryBean cronJobTrigger(MethodInvokingJobDetailFactoryBean jobDetail) {
		CronTriggerFactoryBean tigger = new CronTriggerFactoryBean();
		tigger.setJobDetail(jobDetail.getObject());
		tigger.setCronExpression("0 30 20 * * ?");// 初始时的cron表达式
		tigger.setName("srd-chhliu");// trigger的name
		return tigger;

	}

	/**
	 * attention: Details：定义quartz调度工厂
	 */
	@Bean(name = "scheduler")
	public SchedulerFactoryBean schedulerFactory(Trigger cronJobTrigger) {
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		// 用于quartz集群,QuartzScheduler 启动时更新己存在的Job
		bean.setOverwriteExistingJobs(true);
		// 延时启动，应用启动1秒后
		bean.setStartupDelay(1);
		// 注册触发器
		bean.setTriggers(cronJobTrigger);
		return bean;
	}
}
