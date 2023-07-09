//package team.stalwarts.sharon.model;
//
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "eventprice")
//public class Eventprice {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "eventprice")
//    private Double price;
//
//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    private Event event;
//
//    public Eventprice() 
//    {
//    }
//
//   
//    public Eventprice( Double price, Event event) {
//    	
//		this.price = price;
//		this.event = event;
//	}
//
//
//
//
//
//	public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public Event getEvent() {
//        return event;
//    }
//
//    public void setEvent(Event event) {
//        this.event = event;
//    }
//}
