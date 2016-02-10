package hu.bme.aut.gergelyszaz.BGS.manager;

public class IDGenerator {
public interface GGID{
	int getUniqueID();
}
	int i=Integer.MIN_VALUE;
	public int getNewID()
	{
		return i++;
	}
}
