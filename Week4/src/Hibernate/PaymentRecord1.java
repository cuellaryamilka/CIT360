package Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Creting annotations
@Entity
@Table(name="payment_record")

// main class
public class PaymentRecord1 {

	// creating fields and mapping them to the database table
		@Id
		// This GeneratedValue tells you how you are going to get the primary key or id
		// in this case IDENTITY assign primary key using database identity column
		// this is important to retrieve objects from the database
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="houses")
		private String houses;
		
		@Column(name="salaryYamilka")
		private int salaryYamilka;
		
		@Column(name="salaryMarisela")
		private int salaryMarisela; 
		
		// creating constructor
		public PaymentRecord1() {
			
		}

			// creating other constructors
			public PaymentRecord1(String houses, int salaryYamilka, int salaryMarisela) {
			super();
			this.houses = houses;
			this.salaryYamilka = salaryYamilka;
			this.salaryMarisela = salaryMarisela;
		}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getHouses() {
				return houses;
			}

			public void setHouses(String houses) {
				this.houses = houses;
			}

			public int getSalaryYamilka() {
				return salaryYamilka;
			}

			public void setSalaryYamilka(int salaryYamilka) {
				this.salaryYamilka = salaryYamilka;
			}

			public int getSalaryMarisela() {
				return salaryMarisela;
			}

			public void setSalaryMarisela(int salaryMarisela) {
				this.salaryMarisela = salaryMarisela;
			}
			
			// these are for debbuging purposses
			@Override
			public String toString() {
				return "paymentRecord [id=" + id + ", houses=" + houses + ", salaryYamilka=" + salaryYamilka + ", salaryMarisela=" + salaryMarisela + "]";
			}

			
		}

		


