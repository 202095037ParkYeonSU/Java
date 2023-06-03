package Mars;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Trade {
	Scanner stdin = new Scanner(System.in);
	MainUser usr = new MainUser();
	ShowPrice showPrice = new ShowPrice();
	
	public int buyLong, buyShort, leverage;
	
	public void Trade(){
		String[] coins = {"BitCoin", "Ethereum", "Doge", "Luna", "Wemix"};

		List<Coin> coinList = new ArrayList<>();
	    coinList.add(new Bitcoin());
	    coinList.add(new Ethereum());
	    coinList.add(new Doge());
	    coinList.add(new Luna());
	    coinList.add(new Wemix());
	    
	    System.out.println("매수, 매도할 코인 선택(1. BitCoin, 2. Ethereum, 3. Doge, 4. Luna, 5. Wemix) : ");
	    int selecCoin = stdin.nextInt();
	     
	    showPrice(coinList.get(selecCoin - 1));
	    // System.out.println(coins[selecCoin - 1] + " : " + coinList.get(selecCoin - 1).Price);
	    
	    
		System.out.println("매수, 매도 선택(1. 매수, 2. 매도) :");
		int buySellNum = stdin.nextInt();

		if (buySellNum == 1) {//매수탭
			
			
			System.out.println("롱 or 숏 선택(1. 롱, 2. 숏) : ");
			int selecLS = stdin.nextInt();
			
			if (selecLS == 1) {//롱
				Long();
			}
			
			else if(selecLS == 2) {//숏
				Short();
			}
			
		}
		else if(buySellNum == 2) {//매도탭
			Sell();
			
		}
		else {
			System.out.println("올바른값을 입력해주세요.");
		}
		
		
		
		

		
		
		int buyMoney = stdin.nextInt();
		
		if (buyMoney > usr.wallet || buyMoney <= 0) {
			System.out.println("올바른 금액을 입력해주세요.");
		}
		
		else {
			usr.wallet -= buyMoney;
			
		}
		
	}

	private void Long() {
		System.out.println("매수할 금액 입력(롱) : ");
		buyLong = stdin.nextInt();
		Leverage();
	}
	
	private void Short() {
		buyShort = stdin.nextInt();
		System.out.println("매수할 금액 입력(숏) : ");
		Leverage();
	}
	
	private void Leverage() {
		System.out.println("레버리지 배율 입력(1~10배) : ");
		leverage = stdin.nextInt();
	}
	
	private void Sell() {
		
	}
}
