package prj.corey.jobscheduler;

import org.quartz.SchedulerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobSchedulerApplication {

    public static void main(String[] args) throws SchedulerException {
        SpringApplication.run(JobSchedulerApplication.class, args);
    }

}
