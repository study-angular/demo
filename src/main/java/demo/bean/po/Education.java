package demo.bean.po;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Created by xu on 2016/11/16.
 */
public class Education {
    private String message;
    @Autowired //构造器注入
    private Education(String message) {
        this.message = message;
    }
}
