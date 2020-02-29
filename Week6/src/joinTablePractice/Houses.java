//package joinTablePractice;
//
//	import java.util.ArrayList;
//	import java.util.List;
//
//	import javax.persistence.CascadeType;
//	import javax.persistence.Column;
//	import javax.persistence.Entity;
//	import javax.persistence.FetchType;
//	import javax.persistence.GeneratedValue;
//	import javax.persistence.GenerationType;
//	import javax.persistence.Id;
//	import javax.persistence.JoinColumn;
//	import javax.persistence.JoinTable;
//	import javax.persistence.ManyToMany;
//	import javax.persistence.ManyToOne;
//	import javax.persistence.OneToMany;
//	import javax.persistence.Table;
//
//	@Entity
//	@Table(name="houses")
//	public class Houses {
//		
//		
//		// define our fields
//		@Id
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
//		@Column(name="id")
//		private int id;
//		
//		@Column(name="houseName")
//		private String houseName;
//		
//		@Column(name="paymentYamilka")
//		private int paymentYamilka;
//		
//		@Column(name="paymentMarisela")
//		private int paymentMarisela;
//		
//		@ManyToMany(fetch=FetchType.LAZY,
//				cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//				 CascadeType.DETACH, CascadeType.REFRESH})
//		// this maps the houses and the employees and also it does it in inverse way
//		@JoinTable(
//				name="houses_employees",
//				joinColumns=@JoinColumn(name="houses_id"),
//				inverseJoinColumns=@JoinColumn(name="employees_id")
//				)
//		
//		private List<Employees> employees;
//		
//		// define constructors
//		
//		public Houses() {
//			
//		}
//
//		public Houses(String houseName, int paymentYamilka, int paymentMarisela) {
//			this.houseName = houseName;
//			this.paymentYamilka = paymentYamilka;
//			this.paymentMarisela = paymentMarisela;
//			
//		}
//		
//		// define getter setters
//		
//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//		public String getHouseName() {
//			return houseName;
//		}
//
//		public void setHouseName(String houseName) {
//			this.houseName = houseName;
//		}
//
//		public int getPaymentMarisela() {
//			return paymentMarisela;
//		}
//
//		public void setPaymentMarisela(int paymentMarisela) {
//			this.paymentMarisela = paymentMarisela;
//		}
//
//		public void setPaymentYamilka(int paymentYamilka) {
//			this.paymentYamilka = paymentYamilka;
//		}		
//		
//		public List<Employees> getEmployees() {
//			return employees;
//		}
//
//		public void setEmployees(List<Employees> employees) {
//			this.employees = employees;
//		}
//
//		// annotate fields
//		// add a convenience method, this is for adding a single employee to a house
//		
//		public void addEmployees(Employees theEmployees) {
//			
//			if (employees == null) {
//				employees = new ArrayList<>();
//			}
//			
//			employees.add(theEmployees);
//		}
//		
//		// define tostring
//		
//		@Override
//		public String toString() {
//			return "Houses [id=" + id + ", houseName=" + houseName + ",  paymentYamilka=" + paymentYamilka + ", paymentMarisela=" + paymentMarisela + "]";
//		}
//		
//		
//	}
//
//
//
//
//
//
//
