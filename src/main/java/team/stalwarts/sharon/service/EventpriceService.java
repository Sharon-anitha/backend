//package team.stalwarts.sharon.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import team.stalwarts.sharon.model.Event;
//import team.stalwarts.sharon.model.Eventprice;
//import team.stalwarts.sharon.repository.EventpriceRepository;
//
//
//@Service
//public class EventpriceService 
//{
//	@Autowired
//	private EventpriceRepository eventPriceRepository;
//	
//	@Autowired
//	private EventService eventService;
//
//	public EventpriceService() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public EventpriceService(EventpriceRepository eventPriceRepository) {
//		super();
//		this.eventPriceRepository = eventPriceRepository;
//	}
//
//	public EventpriceRepository getEventPriceRepository() {
//		return eventPriceRepository;
//	}
//
//	public void setEventPriceRepository(EventpriceRepository eventPriceRepository) {
//		this.eventPriceRepository = eventPriceRepository;
//	}
//	
//	
//	
//	/*public Eventprice createEventprice(double price,Long eventid)
//	{
//		Event event = eventService.getEventById(eventid);
//		
//		Eventprice ee= new Eventprice(price,event);
//		return eventPriceRepository.save(ee);
//		
//	}*/
//	
//	public Eventprice createEventprice(double price, Long eventId) 
//	{
//	    Event event = eventService.getEventById(eventId);
//	    Eventprice eventprice = eventPriceRepository.findByEventId(eventId);
//
//	    if (eventprice != null) {
//	        // Update the existing event price
//	        eventprice.setPrice(price);
//	    } else 
//	    {
//	        // Create a new event price
//	        eventprice = new Eventprice(price, event);
//	    }
//
//	    return eventPriceRepository.save(eventprice);
//	}
//
//	
//	
//	public Eventprice getEventprice(Long id)
//	{
//		Eventprice e = eventPriceRepository.findByEventId(id);
//		return e;
//	}
//	
//	  public void deleteEventPricesByEventId(Long eventId)
//	  {
//	        eventPriceRepository.deleteByEventId(eventId);
//	    }
//
//}
