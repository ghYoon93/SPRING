package com.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample03.SungJukDTO;
import sample03.SungJukImpl;

@Configuration
public class Instance {
	//메소드 명을 객체 명으로 인식한다.
	// 그래서 객체 명을 getSungJukImpl로 인식하기 때문에 추가로 name="sungJukImpl"를 부여
	@Bean(name="sungJukImpl")
    public SungJukImpl getSungJukImpl() {
    	
    	return new SungJukImpl();
    }
	@Bean
	public SungJukDTO sungJukDTO() {
		return new SungJukDTO();
	}
}
