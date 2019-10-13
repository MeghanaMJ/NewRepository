package practice;

public class LabelledForLoop {

	public static void main(String[] args) {
		//Breaking outer loop
		 aa:

			for(int i=1;i<=5;i++)
			{
				bb:
					for(int j=1;j<=5;j++)
					{
						if(i==2 && j==2)
						{
							break aa;
						}
						System.out.println(i+" "+j);
					}



			}
		//	Breaking inner loop
		/*aa:
			for(int i=1;i<=3;i++)
			{
				bb:
					for(int j=1;j<=3;j++)
					{
						if(i==2 && j==2)
						{
							break bb;
						}
						System.out.println(i+" "+j);
					}

			}*/
	}
}


