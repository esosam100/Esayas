import java.rmi.Naming;
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1025);
			
			FileServer fServer=new FileServer();
			fServer.setFile("fashion.pdf");			
			Naming.rebind("rmi://10.194.119.201/abc", fServer);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}