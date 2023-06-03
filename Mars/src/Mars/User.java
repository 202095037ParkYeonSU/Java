package Mars;

abstract class User {
	protected String id;
	protected String passwd;
	public int wallet;
	public int[] coinWallet = new int[5];
}
class MainUser extends User{
	public MainUser(){
		id="";
		passwd="";
		wallet = 100000000;
		int[] coinWallet;
	}
}

