import com.daguo.DubboConsumerApplication;
import com.daguo.HelloService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class ConsumerTest {
    //远程调用接口 要用dubbo的注解！！！
    @com.alibaba.dubbo.config.annotation.Reference
    private HelloService helloService;

    @Test
    public void hello(){
        String res = helloService.sayHello("测试hello");
        System.out.println(res);
    }
}
