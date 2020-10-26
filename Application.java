package workfinal;

class Application {
	public static void main(String[]args) {
		Television television = new Television(10.5,7,9);
		television.powerSwitch();
		television.channelTuning(2);
		television.decreaseVolume();
		television.increaseVolume();
		television.width=12;
		System.out.println("*********************************");
		
		DVDPlayerTelevision dvdPlayerTelevision = new DVDPlayerTelevision(10.5,7,9);
		dvdPlayerTelevision.powerSwitch();
		dvdPlayerTelevision.channelTuning(2);
		dvdPlayerTelevision.playDVD();
		System.out.println("*********************************");
		
		Television t;
		t =new DVDPlayerTelevision(10.5,7,9);
		t.channelTuning(2);
		System.out.println("*********************************");
		t = new SoundBarTelevision(10.5,7,9);
		t.channelTuning(2);
	}
}
