package team.stalwarts.sharon;
import org.springframework.beans.factory.annotation.Autowired;
import team.stalwarts.sharon.model.Event;
import team.stalwarts.sharon.repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SharonApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SharonApplication.class, args);
	}

	@Autowired
	private  EventRepository eventRepository;

	@Override
	public void run(String... args) throws Exception {
	/*	Event e = new Event();
		e.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3XzI6nPT9j9HQqLjTtE9Gk1uMLmHHaZvaReYXZibWdA&usqp=CAU&ec=48665699");
		e.setTitle("SINGING");
		e.setDate("07-07-2023");
		e.setLocation("BLOCK A");
		e.setSpeaker("ANANYA");
		e.setPrice(150);

		eventRepository.save(e);

		Event e1 = new Event();
		e1.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDs3waPHr0jDPIs1CDVQ4qEqpBMkejsyZvvQ&usqp=CAU");
		e1.setTitle("DANCING");
		e1.setDate("07-07-2023");
		e1.setLocation("BLOCK B");
		e1.setSpeaker("SEBASTIN");
		e1.setPrice(250);
		eventRepository.save(e1);

		Event e2 = new Event();
		e2.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_Z2ZXPzoaipA-sR16bf_mWOaxetRRmSRAXNzv1-V7AQ&usqp=CAU&ec=48665699");
		e2.setTitle("SHIPWRECK");
		e2.setDate("08-07-2023");
		e2.setLocation("BLOCK A");
		e2.setSpeaker("KRITI");
		e2.setPrice(200);
		eventRepository.save(e2);

		Event e3 = new Event();
		e3.setUrl("https://3.imimg.com/data3/YQ/OQ/MY-10501802/adzap-500x500.jpg");
		e3.setTitle("ADZAP");
		e3.setDate("08-07-2023");
		e3.setLocation("BLOCK B");
		e3.setSpeaker("VINAY");
		e3.setPrice(150);
		eventRepository.save(e3);

		Event e4 = new Event();
		e4.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkjHJvNF9wtdPcGZK2LZNoC1SOY781lRTtG6s3CfnAu9UEk4vboNd3WWqdApqv4TWotJ0ksSucOw0&usqp=CAU&ec=48665699");
		e4.setTitle("MIME");
		e4.setDate("09-07-2023");
		e4.setLocation("BLOCK A");
		e4.setSpeaker("RAGHUL");
		e4.setPrice(200);
		eventRepository.save(e4);


		Event e5 = new Event();
		e5.setUrl("https://www.andrex.co.uk/-/media/Project/AndrexUK/Articles/Parenting-Advice-Hub/Craft-Page/Craft-Page-Header-Mobile");
		e5.setTitle("ART & CRAFT");
		e5.setDate("09-07-2023");
		e5.setLocation("BLOCK B");
		e5.setSpeaker("MARGRET");
		e5.setPrice(100);
		eventRepository.save(e5); */
	}
}
