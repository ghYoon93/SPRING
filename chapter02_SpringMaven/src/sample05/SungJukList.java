package sample05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SungJukList {
	@Bean
    public List<SungJukDTO2> list(){
    	return new ArrayList<SungJukDTO2>();
    }
}
