class illegalValueException extends Exception
{
	illegalValueException()
	{
		super();
	}
	illegalValueException(String e)
	{
		super();
	}
}



class Squre
{
	private int length;
	private int width;
	

	public int rec(int length,int width) throws illegalValueException
	{
		if(length<0 || width<0)
		{
			 throw new illegalValueException("输入值非法");
		}
		this.length = length;
		this.width = width;
		return length*width;
	}

	Squre(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
}





class ExceptionTest 
{
	public static void main(String[] args)//throws Exception 
	{
		try
		{
			Squre s = new Squre(3,4);
			int rec = s.rec(-2,3);
			System.out.println(rec+"Hello World!");
		}
		catch (illegalValueException ex)
		{
			System.out.println("Got it@");
		}
		System.out.println("RUN");
		
	}
}
