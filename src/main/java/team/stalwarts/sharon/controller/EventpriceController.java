//package team.stalwarts.sharon.controller;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import team.stalwarts.sharon.model.Eventprice;
//
//import team.stalwarts.sharon.service.EventpriceService;
//
//@CrossOrigin(origins="http://localhost:3000")
//@RestController
//@RequestMapping("/eventprice")
//public class EventpriceController 
//{
//
//	@Autowired
//	private EventpriceService eventPriceService;
//	
//
//
//	public EventpriceController() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public EventpriceController(EventpriceService eventPriceService) {
//		super();
//		this.eventPriceService = eventPriceService;
//	}
//
//	public EventpriceService getEventPriceService() {
//		return eventPriceService;
//	}
//
//	public void setEventPriceService(EventpriceService eventPriceService) {
//		this.eventPriceService = eventPriceService;
//	}
//	
//	
//	@PostMapping
//	public ResponseEntity<Eventprice> createEventprice(@RequestBody Eventprice eventprice)
//	{
//		
//	  double price= eventprice.getPrice();
//	  Long eventId= eventprice.getEvent().getId();
//	  Eventprice eventPrice = eventPriceService.createEventprice(price,eventId);
//	  return ResponseEntity.ok(eventPrice);
//	  
//		
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Eventprice> getEventpriceById(@PathVariable("id") Long id)
//	{
//		Eventprice ee = eventPriceService.getEventprice(id);
//	return ResponseEntity.ok(ee);
//	}
//	
//}
