
public class ThreadAssignment2 
{
	
	private static class Writer implements Runnable
	{
		private char letter;
		public Writer ( char letter )
		{
			this.letter = letter;
		}
		
		public void run()
		{
			//System.out.println( "Thread name :" + Thread.currentThread().getName() );
			for(int i=0; i<20; i++)
			{
				System.out.println( Thread.currentThread().getName() + " --> " + this.letter);
				try
				{
					Thread.sleep(2000);
				}catch( InterruptedException e)
				
				{
					System.out.println( "Interrupted ...");
				}
			}
			System.out.println(Thread.currentThread().getName() + " end  ...");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println( "Thread name :" + Thread.currentThread().getName() );
		
		//Init new threads
		Thread thread1 = new Thread( new Writer('c') );
		Thread thread2 = new Thread( new Writer('p') );		
		Thread thread3 = new Thread( new Writer('e') );	
	
		try
		{
		//Run thread
		thread1.start();
		thread1.join(100);
		}catch( InterruptedException e )
		{
			System.out.println( "Interrupted ...");
		}
	
		try
		{
		thread2.start();
		thread2.join(100);
		}catch( InterruptedException e )
		{
			System.out.println( "Interrupted ...");
		}
		
		try
		{
		thread3.start();
		thread3.join(150);
		}catch( InterruptedException e )
		{
			System.out.println( "Interrupted ...");
		}
		
		
		try
		{	Thread.sleep(1500);
			for(int k=0;k<20;k++)
			{
				// Print space
				System.out.println();
				//wait 2 second
				Thread.sleep(2000);
			}
		}catch( InterruptedException e )
		{
			System.out.println( "Interrupted ...");
		} 
	}
}

