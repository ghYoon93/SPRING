package sample05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SungJukOutput implements SungJuk{
	@Autowired
	private List<SungJukDTO2> list;
	@Override
	public void execute() {
		System.out.println();
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		}
	}


}
