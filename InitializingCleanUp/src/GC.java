import static net.mindview.util.Print.*;
//class Online {
//	boolean loggedin = false;
//	Online(boolean status) {
//		loggedin = status;
//	}
//	void login() {
//		loggedin = true;
//	}
//	void logout() {
//		loggedin = false;
//	}
//	protected void finalize() {
//			print("Error: Log out!");
//	}
//}
class Item{
    boolean out = false;
    Item(boolean status){
        out = status;
    }    
    void fromClient(){
        out = false;
    }
    void toClient(){
        out = true;
    }
    protected void finalize(){
        if(out)
        	print("Error: item out !!!");    
    }
}
public class GC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Online o = new Online(true);
//		//proper cleanup
//		o.logout();
//		new Online(true);
		Item bread = new Item(true);
    	Item cake = new Item(true);
    	bread.fromClient();
        new Item(true);
        System.gc();
	}

}
