package com.tnsif.InterfaceDemo;
//demo for multiple level

//first interface
interface Camera{
	void takephoto();
}
//Second interface
interface Musicplayer{
	void playmusic();
}
//A class implements multiple interface
class Smartphone implements Camera,Musicplayer{

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music on the smartphone");
	}

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("taking a photo with the smartphone");
		
	}
	
}



public class MultipleInterface {
	public static void main(String[] args) {
	Smartphone s=new Smartphone();
	s.takephoto();
	s.playmusic();

}
}



