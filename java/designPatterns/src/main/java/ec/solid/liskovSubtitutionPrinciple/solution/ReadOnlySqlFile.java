package ec.com.openwebinar.solid.liskovSubtitutionPrinciple.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadOnlySqlFile implements IReadableSqlFile{

	
	private String filePath;
	private String fileText;
	
	@Override
	public String LoadText() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
