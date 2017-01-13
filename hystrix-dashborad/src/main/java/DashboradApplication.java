import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/1/13 09:53.
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class DashboradApplication {


    public static void main(String[] args) {
        SpringApplication.run(DashboradApplication.class, args);
    }

}
