import java.util.Scanner;
public class SongTest {
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		Singer singers[]= new Singer[10];
		Song songs[]= new Song[10];
	
		singers[0] = new Singer("Frank Sinatra");
		singers[1] = new Singer("Wham!");
		singers[2] = new Singer("Mariah Carey");
		singers[3] = new Singer("Chris Rea");
		singers[4] = new Singer("Sia");
		
		songs[0] = new Song("All I Want for Christmas Is You", singers[2], "https://www.youtube.com/watch?v=yXQViqx6GMY");
		songs[1] = new Song("White Christmas", singers[0], "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		songs[2] = new Song("Last Christmas",singers[1], "https://www.youtube.com/watch?v=E8gmARGvPlI");
		songs[3] = new Song("Driving home for christmas", singers[3], "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		songs[4] = new Song("Santa's Coming For Us", singers[4], "https://www.youtube.com/watch?v=V3EYjVPRClU");
		songs[5] = new Song("Let It Snow! Let It Snow! Let It Snow!", singers[0],"https://www.youtube.com/watch?v=vGRC2LYmHfU");
		
		while (true){
			System.out.println("******************** Welcome to our DMST Christmas Music Application ********************");
			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.println("Type here:");
			int choice = scanner.nextInt();
			
			if (choice==1) {
				System.out.println("** Display Singer's List **");
				for (Singer singer: singers) {
					if (singer!=null)
						System.out.println(singer.toString());
				}
			}
			
			else if (choice == 2 ){
				System.out.println("** Display Frank's Sinatra Song List **");
				for(Song song:songs) {
					if(song != null)
						if(song.getSinger().getId() == 1)
							System.out.println(song.toString());
					}
				
				}else if(choice==0) {
					return;
				}else {
					System.out.println("Wrong input! You should type either 1 or 2");
				}
		}
	}
}
