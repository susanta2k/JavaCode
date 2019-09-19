package exception;

public class ThrowCustomException {

	
		void productCheck(int weight) throws CustomException{
			if(weight<100){
				throw new CustomException("Product Invalid");
			}
		   }
		   
		    public static void main(String args[])
		    {
		    	ThrowCustomException obj = new ThrowCustomException();
		        try
		        {
		            obj.productCheck(20);
		        }
		        catch (CustomException ex)
		        {
		            System.out.println("Caught the exception");
		            System.out.println(ex.getMessage());
		        }
		    }

	}


