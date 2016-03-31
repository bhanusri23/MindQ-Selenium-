
public class FileType {

	public static void main(String[] args) {
		String str = "E:\\Workspace\\AProject1\\src\\TestData\\TestData.jpeg";
		int l = str.indexOf(".");
		System.out.println(str.substring(l));
		//OR
		System.out.println(str.substring(str.indexOf(".")));
		
		if(str.substring(str.indexOf(".")).equalsIgnoreCase(".xlsx"))
			System.out.println("is .xlsx excel file");
		else if(str.substring(str.indexOf(".")).equalsIgnoreCase(".xls"))
			System.out.println("is .xls excel file");
		else if(str.substring(str.indexOf(".")).equalsIgnoreCase(".png") || 
							str.substring(str.indexOf(".")).equalsIgnoreCase(".jpeg"))
			System.out.println("is an image");
		else if(str.substring(str.indexOf(".")).equalsIgnoreCase(".pdf"))
			System.out.println("is PDF file");
		
		System.out.println("********************************************");
		System.out.println(str.substring(l).concat(" file").length());
		
	}

}
