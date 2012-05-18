
import java.text.DecimalFormat;

public class GenericFormat {
    
	String formatObj(Object obj, int totalWidth, boolean justifyLeft){
		String strObj = null;
		DecimalFormat df = new DecimalFormat("###0.00");
		if (obj instanceof Double) strObj = df.format(((Double)obj).doubleValue());
		else strObj = obj.toString();
		int diff = totalWidth - strObj.length(); 
		int leftSpaces = 0, rightSpaces = 0;
		String str = "";
		if (diff > 0) 
		{
			if (justifyLeft) rightSpaces = diff; // pad only on the right
			else // centralize if justifyLeft is false
			{
				leftSpaces = diff / 2;
				rightSpaces = diff - leftSpaces;
			} 
			for (int i = 1; i <= leftSpaces; i++) str += " ";
			str += strObj;
			for (int i = 1; i <= rightSpaces; i++) str += " ";
		}
		return str;
	}
}
