//package joinTablePractice;
//
//
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
//	import javax.persistence.Table;
//
//	@Entity
//	@Table(name="employees")
//	public class Employees {
//
//		@Id
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
//		@Column(name="id")
//		private int id;
//		
//		@Column(name="first_name")
//		private String firstName;
//		
//		@Column(name="last_name")
//		private String lastName;
//		
//		@Column(name="email")
//		private String email;
//		
//		// Creating mapping for ManyToMany
//		
//		@ManyToMany(fetch=FetchType.LAZY,
//				cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//				 CascadeType.DETACH, CascadeType.REFRESH})
//		@JoinTable(
//				name="houses_employees",
//				joinColumns=@JoinColumn(name="employees_id"),
//				inverseJoinColumns=@JoinColumn(name="houses_id")
//				)	
//		private List<Houses> houses;
//
//		
//		public Employees() {
//			
//		}
//
//		public Employees(String firstName, String lastName, String email) {
//			this.firstName = firstName;
//			this.lastName = lastName;
//			this.email = email;
//		}
//
//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//		public String getFirstName() {
//			return firstName;
//		}
//
//		public void setFirstName(String firstName) {
//			this.firstName = firstName;
//		}
//
//		public String getLastName() {
//			return lastName;
//		}
//
//		public void setLastName(String lastName) {
//			this.lastName = lastName;
//		}
//
//		public String getEmail() {
//			return email;
//		}
//
//		public void setEmail(String email) {
//			this.email = email;
//		}
//
//		public List<Houses> getHouses() {
//			return houses;
//		}
//
//		public void setHouses(List<Houses> houses) {
//			this.houses = houses;
//		}
//
//		@Override
//		public String toString() {
//			return "Employees [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
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
