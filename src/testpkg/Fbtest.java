package testpkg;

import org.testng.annotations.Test;

import basepkg.basePgm;
import pagepkg.Fbpage;

public class Fbtest extends basePgm
{
	@Test
	public void verifylogin()
	{
		Fbpage p1=new Fbpage(driver);
		String x1="D:\\data.xlsx";
		String sheet="sheet1";
		int rowCount=Excelutil.getRowCount(x1,sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String Username=Excelutil.getCellValue(x1.sheet,i,0);
			System.out.println("username = "+Username);
			String passwrd=Excelutil.getCellValue(x1.sheet,i,0);
			System.out.println("password = "+passwrd);
			
			
			p1.setvalue(Username, passwrd);
			p1.login();
			
			
		}
	}

}
