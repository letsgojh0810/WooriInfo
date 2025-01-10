package info.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CommuteMateDTO {
	private String laptopNumber; // 노트북 번호 (고유한 식별자)
    private String name; // 이름
    
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 노트북 번호 : ");
		builder.append(laptopNumber);
		builder.append(" 2. 이름 : ");
		builder.append(name);
		return builder.toString();
	}
}