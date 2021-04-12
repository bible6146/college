package winter;
import java.util.ArrayList;
public class Character {
	private static class Item{
		private String name;
		private int type;
		private int price;
		
		public int getPrice() {
			return price;
		}
		@Override
		public String toString() {
			return "name:"+name+"type:"+type+"price:"+price;
		}
	}
	private ArrayList<Item> list=new ArrayList<>();
	
	public void add(String name,int type,int price) {
		Item item=new Item();
		item.name=name;
		item.type=type;
		item.price=price;
		list.add(item);
	}
	public void print() {
		int total=0;
		for(Item item:list) {
			System.out.println(item);
			total+=item.getPrice();
		}
		System.out.println(total);
	}
	
	
	
	
	}

