package practice;
interface playable{
	void play();
}
class Guitar implements playable{

	@Override
	public void play() {
		System.out.println("play guitar");
	}
	
}
class piano implements playable{

	@Override
	public void play() {
	
		System.out.println("play piano");
	}
	
}
public class mainclass2 {

	public static void main(String[] args) {
		Guitar G = new Guitar();
		G.play();
		piano p=new piano();
		p.play();
		

	}

}
